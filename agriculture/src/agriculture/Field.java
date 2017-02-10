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
    
    public Field(){
        fieldID = idCounter;
        idCounter++;
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
