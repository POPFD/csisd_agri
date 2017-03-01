/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sambowenhughes
 */
public class SensorTest {
    
    public SensorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getID method, of class Sensor.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Sensor instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLocation method, of class Sensor.
     */
    @Test
    public void testUpdateLocation() {
        System.out.println("updateLocation");
        Location newLocation = null;
        Sensor instance = null;
        instance.updateLocation(newLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReading method, of class Sensor.
     */
    @Test
    public void testGetReading() {
        System.out.println("getReading");
        Sensor instance = null;
        Reading expResult = null;
        Reading result = instance.getReading();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
