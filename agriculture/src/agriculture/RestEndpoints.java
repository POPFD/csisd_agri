/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import spark.ResponseTransformer;
import static spark.Spark.*;

/**
 *
 * @author SaneetBhella
 */
public class RestEndpoints {

    public RestEndpoints(Server server) {
        //sets port
        setPort(8080);
        
        //get list of farms
        get("/farms", (request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            List<String> farms = new ArrayList<String>();
            for (Farm f : server.getSetOfFarms()) {
                JsonObject jsonObj = new JsonObject();
                jsonObj.addProperty("farmID", f.getFarmID());
                jsonObj.addProperty("farmName", f.getFarmName());
                jsonObj.addProperty("farmAddress", f.getFarmAddress());
                farms.add(jsonObj.toString());
            }
            return farms;
        }, json());

        //get list of field stations for a farm
        get("/fieldStation/:farmName", (request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            Farm farm = server.getSetOfFarms().getFarmByName(request.params(":farmName"));

            if (farm != null) {
                SetOfFieldStations fieldStationsMatchingFarmName = server.getSetOfFieldStations().getSetOfFieldStationsByName(farm.getFarmName());

                List<String> fieldStations = new ArrayList<String>();
                for (FieldStation fieldStation : fieldStationsMatchingFarmName) {
                    JsonObject jsonObj = new JsonObject();
                    jsonObj.addProperty("fieldStationID", fieldStation.getFieldStationID());                   
                    fieldStations.add(jsonObj.toString());
                }
                return fieldStations;
            }

            response.status(400);
            JsonObject jsonObj = new JsonObject();
            jsonObj.addProperty("message", "No fieldstations found for " + request.params(":farmName"));
            return jsonObj;

        }, json());

        //get list of sensor monitors for a fieldstation
        get("/sensorMonitor/:fieldStationId", (request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            int fieldStationId = Integer.parseInt(request.params(":fieldStationId"));

            FieldStation fieldStation = server.getSetOfFieldStations().getFieldStationByID(Integer.parseInt(request.params(":fieldStationId")));

            if (fieldStation != null) {

                List<String> sensorMonitors = new ArrayList<String>();
                for (SensorMonitor sensorMonitor : fieldStation.getSensorMonitors()) {
                    JsonObject jsonObj = new JsonObject();
                    jsonObj.addProperty("sensorMonitorID", sensorMonitor.getID());
                    sensorMonitors.add(jsonObj.toString());
                }
                return sensorMonitors;
            }

            response.status(400);
            JsonObject jsonObj = new JsonObject();
            jsonObj.addProperty("message", "No sensor monitors found for fieldstation: " + fieldStationId);
            return jsonObj;

        }, json());

        //get readings for a sensor monitor
        get("/readings/:fieldStationId", (request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            int fieldStationId = Integer.parseInt(request.params(":fieldStationId"));

            FieldStation fieldStation = server.getSetOfFieldStations().getFieldStationByID(fieldStationId);
            if (fieldStation != null) {
                SetOfSensorMonitors setOfSensorMonitors = fieldStation.getSensorMonitors();
                
                List<String> readings = new ArrayList<String>();
                for(SensorMonitor sensorMonitor: setOfSensorMonitors) {
                    JsonObject jsonObj = new JsonObject();
                    jsonObj.addProperty("sensorType", sensorMonitor.getSensor().getType().toString());
                    jsonObj.addProperty("sensorReading", sensorMonitor.getSensor().getReading().getReadingValue().toString());
                    jsonObj.addProperty("readingTime", sensorMonitor.getSensor().getReading().getReadingTime().toString());
                    jsonObj.addProperty("latitude", sensorMonitor.getSensor().getReading().getReadingLocation().getLatitude());
                    jsonObj.addProperty("longitude", sensorMonitor.getSensor().getReading().getReadingLocation().getLongitude());
                    
                    readings.add(jsonObj.toString());
                }
                return readings;            
            }

            response.status(400);
            JsonObject jsonObj = new JsonObject();
            jsonObj.addProperty("message", "No sensors found for field station ID: " + fieldStationId);
            return jsonObj;

        }, json());
    }

    //converts string to json
    public static String toJson(Object object) {
        return new Gson().toJson(object);
    }

    //used to override spark java response transformer function
    public static ResponseTransformer json() {
        return RestEndpoints::toJson;
    }
}
