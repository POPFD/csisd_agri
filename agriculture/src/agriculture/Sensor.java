/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author user
 */
public class Sensor {
    
    private static int idCounter = 0;
    private final int sensorID;
    
    private SensorType sensorType;
    private Location sensorLocation;
    private DataHandlerMethod handlerMethod = null;
    private Reading processedReading;
    private Reading rawReading;
    
    public Sensor(double longitude, double latitude, SensorType sensType)
    {   
        /* Method of giving unique ID's to sensors */
        sensorID = idCounter;
        idCounter++;

        this.sensorLocation = new Location(longitude, latitude);
        this.sensorType = sensType;
        
        /* Choose appropriate data handler for type of sensor */
        switch(sensType) 
        {
            case BAROMETRIC:
            {
                this.handlerMethod = new BarometricDataHandler();
                break;
            }
            
            case TEMPERATURE:
            {
                this.handlerMethod = new MaxMinDataHandler();
                break;
            }
            
            case RAINFALL:
            {
                this.handlerMethod = new CumulativeDataHandler();
                break;
            }
        }
    }
    
    public int getID()
    {
        return sensorID;
    }
    
    public SensorType getType()
    {
        return sensorType;
    }
    
    public void updateLocation(Location newLocation)
    {
        sensorLocation = newLocation;
    }
    
    public Reading getReading()
    {
        Date currDT = new Date();
                
        /* For now reading data is pseudo-random */
        
        //TODO: Fix so ranges are appropriate relating to sensor type
        double startRange = 400;
        double endRange = 402;
        double random = new Random().nextDouble();
        Double randomReading = startRange + (random * (endRange - startRange));
                        
        rawReading = new Reading(currDT, randomReading, sensorLocation);
        processedReading = handlerMethod.handleRawData(rawReading);
        
        return processedReading;
    }
    
    
    
}
