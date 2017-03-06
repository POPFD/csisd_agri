/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.Date;

/**
 *
 * @author SaneetBhella
 */
public class Reading implements java.io.Serializable {
    private final Date timeStamp;
    private final Object readingValue;
    private final Location readingLocation;
    
    public Reading(Date timeStamp, Object readingValue, Location readingLocation) {
        this.timeStamp = timeStamp;
        this.readingValue = readingValue;
        this.readingLocation = readingLocation;
    }
    
    public Date getReadingTime() {
       return timeStamp; 
    }
    
    public Object getReadingValue() {
        return readingValue;
    }
    
    public Location getReadingLocation() {
        return readingLocation;
    }
}
