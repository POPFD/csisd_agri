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
public class Reading {
    private final Date timeStamp;
    private final double readingValue;
    private final Location readingLocation;
    
    public Reading(Date timeStamp, double readingValue, Location readingLocation) {
        this.timeStamp = timeStamp;
        this.readingValue = readingValue;
        this.readingLocation = readingLocation;
    }
    
    public Date getReadingTime() {
       return timeStamp; 
    }
    
    public double getReadingValue() {
        return readingValue;
    }
    
    public Location getReadingLocation() {
        return readingLocation;
    }
}
