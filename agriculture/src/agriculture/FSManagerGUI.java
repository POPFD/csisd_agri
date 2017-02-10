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
public class FSManagerGUI {
    public User currentUser;
    public Permissions currentUserPermissions;
    public UserAccessibilityFieldStation setOfFieldStations;
    
    
    public void login(String username, String password){
        //login now should make a request to the server
        //there is a function there that has - validLogin();
    }
    
    public void displayMessage(String message){
        //sys(message);
    }
    
    public void configureUserPermissions(User user){
        //TODO: dont know how to implement this
    }
    
    public void configureUI(Permissions permission){
        //TODO: dont know how to implement this
    }
    
    public void addNewFieldStation(Double test, Double test2, String test3){
        //TODO: need to finissh
    }
    
    public void addNewSensor(Double test, Double test2, String test3){
        //TODO: need to finish
    }
    
    public Reading getData(){
        //TODO: where is this reading coming from????
        return reading;
    }
    
    public void displayData(){
        //TODO: What data are we displaying?????
    }
    
    public void changeUserPermissions(Farm farm, AccessLevel accessLevel){
        //TOD: how do the permissions work?
    }
    
    public void addUserPermissions(String string, AccessLevel accessLevel){
        //TODO: how to the permissions work?
    }
    
    
}
