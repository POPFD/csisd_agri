/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

/**
 *
 * @author student
 */
public class BarometricDataHandler extends DataHandlerMethod{
    
    private Reading previousReading = null;
    
    @Override
    public Reading handleRawData(Reading rawReading){
        
        
        Double readingVal = (Double)rawReading.getReadingValue();
        if (previousReading != null)
        {
            /* Take average of last reading and current */
            readingVal += (Double)previousReading.getReadingValue();
            readingVal /= 2;
        }        
        
        Reading procReading = new Reading(rawReading.getReadingTime(), 
                                        readingVal, 
                                        rawReading.getReadingLocation());
              
        /* Save last reading for next use */
        previousReading = rawReading;
        return procReading;       
    }
    
}
