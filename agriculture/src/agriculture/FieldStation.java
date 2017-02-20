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
     
    public Location stationLocation;
    public Farm farmLocatedIn;

  
    public FieldStation(Double lat, Double lng, Farm farm){
        //Creating unique ID every time
        fieldStationID = idCounter;
        idCounter++;
        
        stationLocation = new Location(lat, lng);
        farmLocatedIn = farm;
    }
    
    public void updateLocation(Location location){
        stationLocation = location;
    }
    
    public void getSesorData(){
        //TODO: need to work on what the getSensor data returns
    }
    
    public void addNewSensor(){
        //TODO: dont know how to add a sensor without a sensor being passed in as a parameter
    }
    
    public SetOfSensorMonitors getSensorMonitors(){
        return stationMonitors;
    }
    
}
