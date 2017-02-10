/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class SetOfPlots extends ArrayList<Plot> {
    
    public SetOfPlots()
    {
        super();
    }
    
    public void addPlot(Plot aPlot){
        super.add(aPlot);
    }
    
    public void removePlot(Plot aPlot){
        super.remove(aPlot);
    }
    
    public SetOfPlots findPlotsByCropType(CropName cropName)
    {
        SetOfPlots result = new SetOfPlots();
        
        
        for(Plot tmp: this)
        {
            if (tmp.getCrop().getCropType() == cropName)
            {
                result.addPlot(tmp);
            }
        }
        return result;
    }
    
}
