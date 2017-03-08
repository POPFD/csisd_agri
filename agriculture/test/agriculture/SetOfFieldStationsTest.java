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
public class SetOfFieldStationsTest {
    
    public SetOfFieldStationsTest() {
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
     * Test of addNewFieldStation method, of class SetOfFieldStations.
     */
    @Test
    public void testAddNewFieldStation() {
        System.out.println("addNewFieldStation");
        FieldStation station = null;
        SetOfFieldStations instance = new SetOfFieldStations();
        instance.addNewFieldStation(station);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFieldStation method, of class SetOfFieldStations.
     */
    @Test
    public void testRemoveFieldStation() {
        System.out.println("removeFieldStation");
        FieldStation station = null;
        SetOfFieldStations instance = new SetOfFieldStations();
        instance.removeFieldStation(station);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFieldStationByID method, of class SetOfFieldStations.
     */
    @Test
    public void testGetFieldStationByID() {
        System.out.println("getFieldStationByID");
        int id = 0;
        SetOfFieldStations instance = new SetOfFieldStations();
        FieldStation expResult = null;
        FieldStation result = instance.getFieldStationByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFieldStationByLocation method, of class SetOfFieldStations.
     */
    @Test
    public void testGetFieldStationByLocation() {
        System.out.println("getFieldStationByLocation");
        Location location = null;
        SetOfFieldStations instance = new SetOfFieldStations();
        FieldStation expResult = null;
        FieldStation result = instance.getFieldStationByLocation(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFieldStationByFarmName method, of class SetOfFieldStations.
     */
    @Test
    public void testGetFieldStationByFarmName() {
        System.out.println("getFieldStationByFarmName");
        String farmname = "";
        SetOfFieldStations instance = new SetOfFieldStations();
        FieldStation expResult = null;
        FieldStation result = instance.getFieldStationByFarmName(farmname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
