/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author user
 */
public class SetOfFarmAccess extends ArrayList<FarmAccess> {
   
    public SetOfFarmAccess()
    {
        super();
    }
    
    public SetOfFarmAccess(Collection<? extends FarmAccess> c)
    {
        super(c);
    }
    
    public void addFarmAccess(FarmAccess farmAccess)
    {
        super.add(farmAccess);
    }
    
    public void removeFarmAccess(FarmAccess farmAccess)
    {
        super.remove(farmAccess);
    }
    
    public FarmAccess getFarmAccessByFarm(Farm farm)
    {
        FarmAccess result = null;
        
        for (FarmAccess tmp: this)
        {
            if (tmp.getFarm() == farm)
            {
                result = tmp;
                break;
            }
        }
        
        return result;
    }
}
