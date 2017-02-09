/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.Date;

/**
 *
 * @author user
 */
public class Sensor {
    
    private static int idCounter = 0;
    
    private final int sensorID;
    
    private Location sensorLocation;
    private DataHandlerMethod handlerMethod;
    private Reading processedReading;
    private Reading rawReading;
    
    public Sensor(double longitude, double latitude, DataHandlerMethod handler) 
    {   
        /* Method of giving unique ID's to sensors */
        sensorID = idCounter;
        idCounter++;
        
        handlerMethod = handler;
        sensorLocation = new Location(longitude, latitude);
    }
    
    public void updateLocation(Location newLocation)
    {
        sensorLocation = newLocation;
    }
    
    public Reading getReading()
    {
        Date currDT = new Date();
        
        /* Need to figure out what tmpObj is!!?!? */
        
        rawReading = new Reading(currDT, tmpObj, sensorLoction);
        processedReading = handlerMethod(rawReading);
        
        return processedReading;
    }
    
    
    
}
