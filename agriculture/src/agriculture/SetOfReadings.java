/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class SetOfReadings extends ArrayList<Reading> {
    
    public SetOfReadings()
    {
        super();
    }
    
    public void addReading(Reading reading) {
        super.add(reading);
    }
    
    public void removeReading(Reading reading) {
        super.remove(reading);
    }
    
}
