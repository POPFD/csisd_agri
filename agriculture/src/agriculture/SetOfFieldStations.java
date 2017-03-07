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
public class SetOfFieldStations extends ArrayList<FieldStation> {
    public SetOfFieldStations(){
           super();
       }
     
    public void addNewFieldStation(FieldStation station){
       super.add(station);
    }
    
    public void removeFieldStation(FieldStation station){
        super.remove(station);
    }
    
    //get field station by id
    public FieldStation getFieldStationByID(int id){
        FieldStation station = null;
        for(FieldStation s: this) {
            if(s.getFieldStationID() == id){
                station = s;
            }
        }
        return station;
    }
    
    //get field station by location
    public FieldStation getFieldStationByLocation(Location location){
        FieldStation station = null;
        for(FieldStation s: this) {
            if(s.getFieldStationLocation().equals(location)){
                station = s;
            }
        }
        return station;
    }
    
    //gets field station by farm name
    public FieldStation getFieldStationByFarmName(String farmname){
        FieldStation station = null;
        for(FieldStation s: this) {
            Farm farm = s.getFieldStationFarm();
            if(farm.getFarmName().equals(farmname)){
                station = s;
            }
        }
        return station;
    }
    
    //get set of field stations by farn name
    public SetOfFieldStations getSetOfFieldStationsByName(String farmname){
        SetOfFieldStations list = new SetOfFieldStations();
        for(FieldStation f: this) {
            Farm farm = f.getFieldStationFarm();
            if(farm.getFarmName().equals(farmname)){
                list.add(f);
            }
        }
        return list;
    }
            
}
