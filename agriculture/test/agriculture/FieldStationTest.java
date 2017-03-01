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
public class FieldStationTest {
    
    public FieldStationTest() {
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
     * Test of updateLocation method, of class FieldStation.
     */
    @Test
    public void testUpdateLocation() {
        System.out.println("updateLocation");
        Location location = null;
        FieldStation instance = null;
        instance.updateLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSesorData method, of class FieldStation.
     */
    @Test
    public void testGetSesorData() {
        System.out.println("getSesorData");
        FieldStation instance = null;
        instance.getSesorData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewSensor method, of class FieldStation.
     */
    @Test
    public void testAddNewSensor() {
        System.out.println("addNewSensor");
        FieldStation instance = null;
        instance.addNewSensor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSensorMonitors method, of class FieldStation.
     */
    @Test
    public void testGetSensorMonitors() {
        System.out.println("getSensorMonitors");
        FieldStation instance = null;
        SetOfSensorMonitors expResult = null;
        SetOfSensorMonitors result = instance.getSensorMonitors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFieldStationID method, of class FieldStation.
     */
    @Test
    public void testGetFieldStationID() {
        System.out.println("getFieldStationID");
        FieldStation instance = null;
        int expResult = 0;
        int result = instance.getFieldStationID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFieldStationLocation method, of class FieldStation.
     */
    @Test
    public void testGetFieldStationLocation() {
        System.out.println("getFieldStationLocation");
        FieldStation instance = null;
        Location expResult = null;
        Location result = instance.getFieldStationLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFieldStationFarm method, of class FieldStation.
     */
    @Test
    public void testGetFieldStationFarm() {
        System.out.println("getFieldStationFarm");
        FieldStation instance = null;
        Farm expResult = null;
        Farm result = instance.getFieldStationFarm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
