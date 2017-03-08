/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.ArrayList;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jack
 */
public class MaxMinDataHandlerTest {
    
    public MaxMinDataHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of handleRawData method, of class MaxMinDataHandler.
     */
    @Test
    public void testHandleRawData() {
        System.out.println("handleRawData");
        
        MaxMinDataHandler instance = new MaxMinDataHandler();
        
        /* Handle a new reading of 5 */
        Reading reading = new Reading(new Date(), (Double)5.0, new Location(1, 1));
              
        Reading result = instance.handleRawData(reading);
        ArrayList<Double> minMax = (ArrayList<Double>)result.getReadingValue();
       
        Double minimum = minMax.get(0);
        Double maximum = minMax.get(1);

        assertEquals(5, minimum, 0);
        assertEquals(5, maximum, 0);
        
        /* Handle a second reading of value 10 */
        reading = new Reading(new Date(), (Double)10.0, new Location(1, 1));
              
        result = instance.handleRawData(reading);
        minMax = (ArrayList<Double>)result.getReadingValue();
       
        minimum = minMax.get(0);
        maximum = minMax.get(1);

        assertEquals(5, minimum, 0);
        assertEquals(10, maximum, 0);
    }
    
}
