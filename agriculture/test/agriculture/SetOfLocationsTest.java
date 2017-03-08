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
public class SetOfLocationsTest {
    
    public SetOfLocationsTest() {
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
     * Test of addLocation method, of class SetOfLocations.
     */
    @Test
    public void testAddLocation() {
        System.out.println("addLocation");
        Location aLocation = null;
        SetOfLocations instance = new SetOfLocations();
        instance.addLocation(aLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLocation method, of class SetOfLocations.
     */
    @Test
    public void testRemoveLocation() {
        System.out.println("removeLocation");
        Location aLocation = null;
        SetOfLocations instance = new SetOfLocations();
        instance.removeLocation(aLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocationByLatLong method, of class SetOfLocations.
     */
    @Test
    public void testGetLocationByLatLong() {
        System.out.println("getLocationByLatLong");
        Double lat = null;
        Double lon = null;
        SetOfLocations instance = new SetOfLocations();
        Location expResult = null;
        Location result = instance.getLocationByLatLong(lat, lon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
