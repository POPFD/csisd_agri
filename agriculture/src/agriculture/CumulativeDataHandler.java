/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

/**
 *
 * @author user
 */
public class CumulativeDataHandler extends DataHandlerMethod {
    
    private Double cumulativeTotal = 0.0;
    private int tickCount = 0;
    
    @Override
    public Reading handleRawData(Reading rawReading) {
        
        /* To simulate cumulative resetting after set amount of time */
        if (tickCount >= 24)
        {
            cumulativeTotal = 0.0;
            tickCount = 0;
        }
        
        cumulativeTotal += (Double)rawReading.getReadingValue();
        
        Reading procReading = new Reading(rawReading.getReadingTime(),
                                            cumulativeTotal,
                                            rawReading.getReadingLocation());
        
        tickCount++;
        return procReading;
        
    }
    
}
