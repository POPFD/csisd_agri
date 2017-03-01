/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SaneetBhella
 */
//ranamed from plot history
public class SetOfHarvests extends ArrayList<Harvest> {
    
    public SetOfHarvests() {
        super();
    }
    
    public void addHarvest(Harvest harvest) {
        super.add(harvest);
    }
    
    public void removeHarvest(Harvest harvest) {
        super.remove(harvest);
    }
    
    public Harvest getHarvestByTime(Date time) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss"); //returns string
        Harvest harvest = null;
        for(Harvest h : this) {
            if(dateFormat.format(h.getHarvestDate()).equals(dateFormat.format(time))) {
                harvest = h;
            }
        }
        return harvest;
    }
    
    public SetOfHarvests getHarvestByCrop(Crop cropname) {
        SetOfHarvests result = new SetOfHarvests();
        
        
        for(Harvest tmp: this)
        {
            if (tmp.getCropType() == cropname)
            {
                result.addHarvest(tmp);
            }
        }
        return result;
    }
}
