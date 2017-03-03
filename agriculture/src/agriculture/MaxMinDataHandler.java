/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author student
 */
public class MaxMinDataHandler extends DataHandlerMethod {
    
    private boolean firstReading = true;
    private Double maxReading = 0.0;
    private Double minReading = 0.0;
    
    public Reading handleRawData(Reading rawReading) {
        
        Double rawValue = (Double)rawReading.getReadingValue();
        
        /* If is the first reading both our max and min would be that */
        if (firstReading)
        {
            maxReading = rawValue;
            minReading = rawValue;
            firstReading = false;
        } else
        {
            /* Update maximum and minimum methods */
            if (Double.compare(rawValue, maxReading) > 0)
                maxReading = rawValue;
            else if (Double.compare(rawValue, minReading) < 0)
                minReading = rawValue;          
        }
                   
        /* Due to design of handlers, we have to create arraylist to
         * return both the minimum and maximum values.
         */
        ArrayList<Double> procValue = new ArrayList<Double>();
        procValue.add(minReading);
        procValue.add(maxReading);
        
        Reading procReading = new Reading(rawReading.getReadingTime(),
                                            procValue,
                                            rawReading.getReadingLocation()); 
        return procReading;
        
    }
}
