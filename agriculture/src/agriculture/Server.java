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
public class Server {
    public Users setOfUsers;
    public FieldStation setOfFieldStations;
    public Farms setOfFarms;
    
    public SetOfReadings requestReadingsByFarm(Farm farm){
        //TODO: where are these readings coming from? assuming its from the fieldStations
    }
    
    public Reading returnReading(){
        return 0;
    }
    
    public User validateLogin(String username, String password){
        return 0;
    }
    
    public FieldStation getUserFieldStations(Permissions permission){
        return 0;
    }
    
    public void addFieldStation(Double example, Double example2, String example3){
        //TODO:  what is being passed in?? 
    }
    
    public void addSensor(Double example, Double example2){
        //TODO:  what is being passed in??
    }    
}
