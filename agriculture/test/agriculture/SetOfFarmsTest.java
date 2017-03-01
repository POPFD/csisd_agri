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
public class SetOfFarmsTest {
    
    public SetOfFarmsTest() {
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
     * Test of addFarm method, of class SetOfFarms.
     */
    @Test
    public void testAddFarm() {
        System.out.println("addFarm");
        Farm farm = null;
        SetOfFarms instance = new SetOfFarms();
        instance.addFarm(farm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFarm method, of class SetOfFarms.
     */
    @Test
    public void testRemoveFarm() {
        System.out.println("removeFarm");
        Farm farm = null;
        SetOfFarms instance = new SetOfFarms();
        instance.removeFarm(farm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarmByName method, of class SetOfFarms.
     */
    @Test
    public void testGetFarmByName() {
        System.out.println("getFarmByName");
        String farmName = "";
        SetOfFarms instance = new SetOfFarms();
        Farm expResult = null;
        Farm result = instance.getFarmByName(farmName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarmByID method, of class SetOfFarms.
     */
    @Test
    public void testGetFarmByID() {
        System.out.println("getFarmByID");
        int id = 0;
        SetOfFarms instance = new SetOfFarms();
        Farm expResult = null;
        Farm result = instance.getFarmByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
