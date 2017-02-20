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
public class SetOfLocations extends ArrayList<Location> {
    
    public SetOfLocations(){
        super();
    }
    
    public void addLocation(Location aLocation){
        super.add(aLocation);
    }
    
    public void removeLocation(Location aLocation){
        super.remove(aLocation);
    }
    
    public Location getLocationByLatLong(Double lat, Double lon){
        
        
        for(Location tmp: this)
        {
            if ((tmp.getLongitude() == lon) && (tmp.getLatitude() == lat))
            {
                return tmp;
            }
        }
        
        return null;
        
    }
    
    
    
}
