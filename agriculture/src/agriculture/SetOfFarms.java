/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.ArrayList;

/**
 *
 * @author SaneetBhella
 */
public class SetOfFarms extends ArrayList<Farm> {
    
    public SetOfFarms() {
        super();
    }
    
    public void addFarm(Farm farm) {
        super.add(farm);
    }
    
    public void removeFarm(Farm farm) {
        super.remove(farm);
    }
    
    public Farm getFarmByName(String farmName) {
        Farm farm = null;
        for(Farm f: this) {
            if(f.getFarmName().equals(farmName)) {
                farm = f;
            }
        }
        return farm;
    }
    
    public Farm getFarmByID(int id) {
        Farm farm = null;
        for(Farm f: this) {
            if(f.getFarmID() == id) {
                farm = f;
            }
        }
        return farm;
    }
}
