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

public class FieldStation implements java.io.Serializable {
    /* 
     * Changed fieldStationID to private and final
     * have also added a idCounter as an attribute for
     * the creation of a unique ID every time
     */
    private static int idCounter = 0;
    private final int fieldStationID; 
    private SetOfSensorMonitors stationMonitors;
     
    public Location location;

  
    public FieldStation(Location location){
        //Creating unique ID every time
        this.fieldStationID = idCounter;
        idCounter++;
        
        this.location = location;
        this.stationMonitors = new SetOfSensorMonitors();
    }
         
    public void addNewSensor(SensorType type){

        /* Create new sensor and add to sensor monitor */
        Sensor newSensor = new Sensor(location.getLongitude(), 
                                    location.getLatitude(),
                                    type);
        
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
        return this.location;
    }
        
}
