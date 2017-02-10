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
    
    // changed void to boolean to give a response whether 
    // the user has logged in successfully or not
    public boolean login(String username, String password){
        return 0;
    }
    
    public void displayMessage(String message){
        //sys(message);
    }
    
    public void configureUserPermissions(User user){
        
    }
    
    public void configureUI(Permissions permission){
        
    }
    
    public void addNewFieldStation(Double test, Double test2, String test3){
        
    }
    
    public void addNewSensor(Double test, Double test2, String test3){
        
    }
    
    public Reading getData(){
        return reading;
    }
    
    public void displayData(){
        
    }
    
    public void changeUserPermissions(Farm farm, AccessLevel accessLevel){
        
    }
    
    public addUserPermissions(String string, AccessLevel accessLevel){
        
    }
    
    
}
