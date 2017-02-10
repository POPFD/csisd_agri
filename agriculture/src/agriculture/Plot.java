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
public class Plot {
    private static int idCounter = 0;
    
    private final int plotID;
    public Crop crop;
    public PlotState state ;
    private SetOfHarvests plotHistory;
    public Area plotArea;
    public Location gpsLocation;
    
    
    public Plot(Area anArea){
        plotID = idCounter;
        idCounter++;
        plotArea = anArea;
    }
    
    public void setCrop(Crop aCrop){
        Crop = aCrop;
    }
    
    public void setLocation(Location aLocation){
        gpsLocation = aLocation;
    }
    
    public void setHarvestHistory(PlotHistory aHistory){
        plotHistory = aHistory;
    }
    
    public void setPlotState(PlotState aPlotState){
        state = aPlotState;
    }
    
    public SetOfHarvests getHarvestHistory(){
        return plotHistory;
    }
    
    public void setArea(Area anArea){
        plotArea = anArea;
    }
    
    public Crop getCrop(){
        return crop;
    }
    
    public int getID(){
        return plotID;
    }
}
