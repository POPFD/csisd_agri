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
public class Sensor implements java.io.Serializable, Subject {
    
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
    
    public void initiateReading() {
        getReading();
        notifyObservers();
    }
    
    public Reading getReading()
    {
        Date currDT = new Date();    
                        
        rawReading = new Reading(currDT, generateRandomReading(), sensorLocation);
        processedReading = handlerMethod.handleRawData(rawReading);
        
        return processedReading;
    }
    
    
    private Double generateRandomReading()
    {
        /* Generates a random reading to simulate how a sensor would work */
        
        double startRange = 0;
        double endRange = 0;
        switch(sensorType) 
        {
            case BAROMETRIC:
            {
                endRange = 100;
                break;
            }
            
            case TEMPERATURE:
            {
                endRange = 35;
                break;
            }
            
            case RAINFALL:
            {
                endRange = 20;
                break;
            }
        }

        double random = new Random().nextDouble();
        return startRange + (random * (endRange - startRange));
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer != null) {
            Server.getInstance().addObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: Server.getInstance().getObservers()) {
            System.out.println(Server.getInstance().getObservers().size());
            observer.update(this);
        }
    }
}
