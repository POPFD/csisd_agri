/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

/**
 *
 * @author sambowenhughes
 */

public class FieldStation {
    /* 
    Changed fieldStationID to private and final
    have also added a idCounter as an attribute for
    the creation of a unique ID every time
    */
    private static int idCounter = 0;
    private final int fieldStationID; 
    private SetOfSensorMonitors stationMonitors;
     
    public Location fieldStationLocation;
    public Farm farmLocatedIn;

  
    public FieldStation(Double lat, Double lng, Farm farm){
        //Creating unique ID every time
        this.fieldStationID = idCounter;
        this.idCounter++;
        
        this.fieldStationLocation = new Location(lat, lng);
        this.farmLocatedIn = farm;
    }
    
    public void updateLocation(Location location){
        this.fieldStationLocation = location;
    }
      
    public void addNewSensor(SensorType type){

        /* Choose appropriate data handler for type of sensor */
        DataHandlerMethod newHandler = null;
        switch(type) 
        {
            case BAROMETRIC:
            {
                newHandler = new BarometricDataHandler();
                break;
            }
            
            case TEMPERATURE:
            {
                newHandler = new MaxMinDataHandler();
                break;
            }
            
            case RAINFALL:
            {
                newHandler = new CumulativeDataHandler();
                break;
            }
        }
        
        Sensor newSensor = new Sensor(fieldStationLocation.getLongitude(), 
                                    fieldStationLocation.getLatitude(),
                                    newHandler);
        
        /* For new frequency is static */
        SensorMonitor newMonitor = new SensorMonitor(1, newSensor);
        
        stationMonitors.add(newMonitor); 
    }
    
    public SetOfSensorMonitors getSensorMonitors(){
        return stationMonitors;
    }
    
    //ADDED GETTER FOR ID
    public int getFieldStationID(){
        return this.fieldStationID;
    }
    
    //ADDED GETTER FOR LOCATION
    public Location getFieldStationLocation(){
        return this.fieldStationLocation;
    }
    
    //ADDED GETTER FOR NAME
    public Farm getFieldStationFarm(){
        return this.farmLocatedIn;
    }
    
}
