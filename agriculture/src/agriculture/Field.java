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
public class Field {
    
    private static int idCounter = 0;
    
    private final int fieldID;
    private SetOfPlots plots = new SetOfPlots();
    private FieldStation fieldStation = null;
    private Location location;
    
    public Field(Location loc){
        fieldID = idCounter;
        idCounter++;
        
        this.location = loc;
        fieldStation = new FieldStation(loc);
    }
    
    public Location getLocation()
    {
        return location;
    }
    
    public FieldStation getFieldStation()
    {
        return fieldStation;
    }
    
    public SetOfPlots getPlots(){
        return plots;
    }
    
    public void setPlots(SetOfPlots newPlots){
        plots = newPlots;
    }
    
    public int getID(){
        return fieldID;
    }
    
}
