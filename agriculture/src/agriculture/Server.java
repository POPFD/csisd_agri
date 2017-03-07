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
    private SetOfFieldStations setOfFieldStations;
    private SetOfFarms setOfFarms;
    
    private static Server serverInstance = null;
    private List<Observer> observers = new ArrayList<Observer>();
    
    private Server() {}
    
    public static Server getInstance() {
        synchronized(Server.class) {
            if(serverInstance == null) {
                serverInstance = new Server();
            } 
        }
        
        return serverInstance;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
    
    public void addObserver(Observer observer) {
        observers.add(observer);
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

    public SetOfFieldStations getSetOfFieldStations() {
        return setOfFieldStations;
    }

    public void setSetOfFieldStations(SetOfFieldStations setOfFieldStations) {
        this.setOfFieldStations = setOfFieldStations;
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
       
    public boolean addFieldStation(double longitude, double latitude, String name) {
        Farm farm = setOfFarms.getFarmByName(name);
        if(farm != null) {
            FieldStation fieldStation = new FieldStation(latitude, longitude, farm);
            setOfFieldStations.add(fieldStation);
            
            return true;
        }
        return false;
    }
    
    public void addSensor(double longitude, double latitude, SensorType type) {
        Location location = new Location(longitude, latitude);
        FieldStation fieldStation = setOfFieldStations.getFieldStationByLocation(location);
        fieldStation.addNewSensor(type);
    }
}
