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
public class SensorMonitor {
    
    private Sensor sensor;
    private SetOfReadings readings;
    private double readingFrequency;
    private Date lastReading;
    
    
    public SensorMonitor(double frequency, Sensor sens) {
        
        this.monitorID = idCounter;
        idCounter++;
        
        this.sensor = sens;
        this.readingFrequency = frequency;
        
        this.readings = new SetOfReadings();       
    }
    
    public Sensor getSensor() {
        return sensor;
    }
    
    
    /* No need to have takeReadingIfRequired as that function did nothing else */
    public void requestReading() {
        Reading processedReading = sensor.getReading();
        
        /* 
         * No need for updateReadings as it would be
         * a one line function otherwise. We may as well 
         * add directly to SetOfReadings.
         */
        readings.add(processedReading);
    }
    
    /* Was postReadings in diagram, changed to be more explanatory */
    public SetOfReadings getReadings() {
        return readings;
    }
    
}
