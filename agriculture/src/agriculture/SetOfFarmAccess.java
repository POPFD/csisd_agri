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
public class SetOfFarmAccess extends ArrayList<User> {
   
    public SetOfFarmAccess()
    {
        super();
    }
    
    public SetOfFarmAccess(Collection<? extends User> c)
    {
        super(c);
    }
    
    public void addFarmAccess(FarmAccess farmAccess)
    {
        super.add(farmAccess);
    }
    
    public void removeUser(FarmAccess farmAccess)
    {
        super.remove(farmAccess);
    }
    
    public FarmAccess getByFarm(Farm farm)
    {
        FarmAccess result = null;
        
        for (FarmAccess tmp: this)
        {
            if (tmp.getUsername().equals(username))
            {
                result = tmp;
                break;
            }
        }
        
        return result;
    }
}
