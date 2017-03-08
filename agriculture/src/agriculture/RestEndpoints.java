/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
        //port to run on
        setPort(8080);
        
        //get list of farms
        get("/farms", (request, response) -> {
            response.type("application/json");
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
        get("/fieldStations/:farmName", (request, response) -> {
            response.type("application/json");
            response.header("Access-Control-Allow-Origin", "*");
            Farm farm = server.getSetOfFarms().getFarmByName(request.params(":farmName"));

            if(farm != null) {
                SetOfFieldStations farmFieldStations = server.getSetOfFieldStations().getSetOfFieldStationsByName(farm.getFarmName());

                List<String> fieldStations = new ArrayList<String>();
                for (FieldStation fieldStation : farmFieldStations) {
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
        get("/sensorMonitors/:fieldStationId", (request, response) -> {
            response.type("application/json");
            response.header("Access-Control-Allow-Origin", "*");
            
            int fieldStationId;
            try {
                fieldStationId = Integer.parseInt(request.params(":fieldStationId"));
            } catch(Exception e) {
                response.status(400);
                JsonObject jsonObj = new JsonObject();
                jsonObj.addProperty("message", "Fieldstation ID is not a number");
                return jsonObj;
            }            

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
            jsonObj.addProperty("message", "No sensor monitors found for fieldstation ID: " + fieldStationId);
            return jsonObj;

        }, json());

        //get readings for a sensor monitor
        get("/readings/:fieldStationId", (request, response) -> {
            response.type("application/json");
            response.header("Access-Control-Allow-Origin", "*");
            
            int fieldStationId;
            try {
                fieldStationId = Integer.parseInt(request.params(":fieldStationId"));
            } catch(Exception e) {
                response.status(400);
                JsonObject jsonObj = new JsonObject();
                jsonObj.addProperty("message", "Fieldstation ID is not a number");
                return jsonObj;
            }
            
            FieldStation fieldStation = server.getSetOfFieldStations().getFieldStationByID(fieldStationId);
            if (fieldStation != null) {
                SetOfSensorMonitors setOfSensorMonitors = fieldStation.getSensorMonitors();
                
                List<String> readings = new ArrayList<String>();
                for(SensorMonitor sensorMonitor: setOfSensorMonitors) {
                    Sensor sensor = sensorMonitor.getSensor();
                    
                    /* Manually have to initiate a reading now */
                    sensor.initiateReading();
                    
                    Reading lastReading = sensorMonitor.getLastReading();
                    
                    JsonObject jsonObj = new JsonObject();
                    jsonObj.addProperty("sensorType", sensor.getType().toString());
                    jsonObj.addProperty("sensorReading", lastReading.getReadingValue().toString());
                    jsonObj.addProperty("readingTime", lastReading.getReadingTime().toString());
                    jsonObj.addProperty("latitude",lastReading.getReadingLocation().getLatitude());
                    jsonObj.addProperty("longitude", lastReading.getReadingLocation().getLongitude());
                    
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
    
    //used to override spark java response transformer function, calls toJson function instead
    public static ResponseTransformer json() {
        return RestEndpoints::toJson;
    }

    //returns json to client
    public static String toJson(Object object) {
        JsonParser parser = new JsonParser();
        JsonElement jsonTree = parser.parse(object.toString());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(jsonTree);
    }  
}
