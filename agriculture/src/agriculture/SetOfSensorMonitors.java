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
public class SetOfSensorMonitors extends ArrayList<SensorMonitor>{
    
    
    public void addSensorMonitor(SensorMonitor sensorMonitor){
        
    }
    
    public void removeSensor(SensorMonitor sensorMonitor){
        
    }
    
   
    public SensorMonitor getMonitorByID(ID){
        SensorMonitor sMonitor = null;
        for(SensorMonitor s : this){
            if(s.getMonitorByID() == ID){
                s = sMonitor;
            }
        }
        return sMonitor;
    }
    
}
