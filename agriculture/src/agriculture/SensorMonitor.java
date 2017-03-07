/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.Date;
import java.util.Observer;
import java.util.Observable;

/**
 *
 * @author user
 */
public class SensorMonitor implements java.io.Serializable, Observer {
    
    private static int idCounter = 0;
    private final int monitorID;

    private final Sensor sensor;
    private final SetOfReadings readings;  
    private int frequency;
    
    public SensorMonitor(int updateFrequency, Sensor sens) {
        
        this.monitorID = idCounter;
        idCounter++;
        
        this.sensor = sens;
        this.sensor.addObserver(this);
               
        this.readings = new SetOfReadings();      
        this.frequency = updateFrequency;
    }
    
    @Override
    public void update(Observable o, Object arg) {

        Reading newReading = (Reading)arg;
        readings.add(newReading);
    }
    
    public int getID() {
        return monitorID;
    }
    
    public Sensor getSensor() {
        
        /* 
         * Add ourself as observer if not already there.
         * This is to fix problem with serialisation losing observers.
         */
        if (sensor.countObservers() == 0)
            sensor.addObserver(this);
        
        return sensor;
    }
        
    /* Was postReadings in diagram, changed to be more explanatory */
    public SetOfReadings getReadings() {
        return readings;
    }
    
    public Reading getLastReading() {
        Reading result = null;
        
        if ((readings != null) && (readings.isEmpty() == false))
        {
            result = readings.get(readings.size() - 1);
        }
        
        return result;
    }
       
}
