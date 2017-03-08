/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sambowenhughes
 */
public class Server implements java.io.Serializable {
    private SetOfUsers setOfUsers;
    private SetOfFarms setOfFarms;
    
    private static Server serverInstance = null;
    
    private Server() {}
    
    public static Server getInstance() {
        synchronized(Server.class) {
            if(serverInstance == null) {
                serverInstance = new Server();
            } 
        }
        
        return serverInstance;
    }

    public SetOfUsers getSetOfUsers() {
        return setOfUsers;
    }

    public void setSetOfUsers(SetOfUsers setOfUsers) {
        this.setOfUsers = setOfUsers;
    }

    public SetOfFarms getSetOfFarms() {
        return setOfFarms;
    }

    public void setSetOfFarms(SetOfFarms setOfFarms) {
        this.setOfFarms = setOfFarms;
    }
     
    public User validateLogin(String username, String password) {
        User user = null;
        for(User u: setOfUsers) {
            if(u.getUsername().equals(username)) {
                if(u.checkPassword(password)) {
                    user = u;
                }
            }
        }
        return user;
    }
       
    public boolean addField(double longitude, double latitude, String name) {
        Farm farm = setOfFarms.getFarmByName(name);
        if(farm != null) {
            
            Location location = new Location(longitude, latitude);
            Field field = new Field(location);

            
            SetOfFields fields = farm.getFields();
            fields.add(field);            
            return true;
        }
        return false;
    }
    
    public boolean addSensor(Location location, SensorType type) {
        boolean result = false;
        
        /* Find the farm that has a field with that location */
        for (int farmCounter = 0; farmCounter < setOfFarms.size(); farmCounter++)
        {
            Farm farm = setOfFarms.get(farmCounter);
            SetOfFields fields = farm.getFields();
            
            for (int fieldCounter = 0; fieldCounter < fields.size(); fieldCounter++)
            {
                Field field = fields.get(fieldCounter);
                
                if (field.getLocation() == location)
                {
                    FieldStation station = field.getFieldStation();
                    
                    station.addNewSensor(type);
                    result = true;
                }
            }
                        
        }           
        return result;
    }
}
