/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

/**
 *
 * @author SaneetBhella
 */
public class FarmAccess implements java.io.Serializable {
    private Farm farm;
    private AccessLevel accessLevel;
    
    public FarmAccess(Farm farm, AccessLevel accessLevel) {
        this.farm = farm;
        this.accessLevel = accessLevel;
    }
    
    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }
    
    public Farm getFarm() {
        return farm;
    }
    
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
}
