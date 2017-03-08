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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getLongitude method, of class Location.
     */
    @Test
    public void testGetLongitude() {
        System.out.println("getLongitude");
        Location instance = new Location(1.1,1.1);
        double expResult = 1.1;
        double result = instance.getLongitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

//    /**
//     * Test of setLongitude method, of class Location.
//     */
//    @Test
//    public void testSetLongitude() {
//        System.out.println("setLongitude");
//        double longitude = 0.0;
//        Location instance = null;
//        instance.setLongitude(longitude);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLatitude method, of class Location.
//     */
//    @Test
//    public void testGetLatitude() {
//        System.out.println("getLatitude");
//        Location instance = null;
//        double expResult = 0.0;
//        double result = instance.getLatitude();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLatitude method, of class Location.
//     */
//    @Test
//    public void testSetLatitude() {
//        System.out.println("setLatitude");
//        double latitude = 0.0;
//        Location instance = null;
//        instance.setLatitude(latitude);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    
}
