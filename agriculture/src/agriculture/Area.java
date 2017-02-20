/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

/**
 *
 * @author student
 */
public class Area {
    
    private Double area; //changed from public
    private SetOfLocations coordinates; //changed from public
    
    public Area(SetOfLocations someCoordinates, Double anArea){
        
        coordinates = someCoordinates;
        area = anArea;
    }
    
    public SetOfLocations getLocations(){
        return coordinates;
    }
}
