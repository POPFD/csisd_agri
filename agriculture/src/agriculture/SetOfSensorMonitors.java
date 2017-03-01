/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.ArrayList;

/**
 *
 * @author sambowenhughes
 */
public class SetOfSensorMonitors extends ArrayList<SensorMonitor>{
    
    public SetOfSensorMonitors()
    {
        super();
    }
    
    
    public void addSensorMonitor(SensorMonitor sensorMonitor){
        super.add(sensorMonitor);
    }
    
    public void removeSensor(SensorMonitor sensorMonitor){
        super.remove(sensorMonitor);
    }
   
   
    public SensorMonitor getMonitorByID(int id) {
        
        SensorMonitor found = null;
        
        for(SensorMonitor tmp: this){
            
            if(tmp.getID() == id) {
                found = tmp;
            }
        }
        
        return found;
    }
    
}
