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
public class FarmTest {
    
    public FarmTest() {
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
     * Test of setFields method, of class Farm.
     */
    @Test
    public void testSetFields() {
        System.out.println("setFields");
        SetOfFarms fields = null;
        Farm instance = null;
        instance.setFields(fields);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFields method, of class Farm.
     */
    @Test
    public void testGetFields() {
        System.out.println("getFields");
        Farm instance = null;
        instance.getFields();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarmID method, of class Farm.
     */
    @Test
    public void testGetFarmID() {
        System.out.println("getFarmID");
        Farm instance = null;
        int expResult = 0;
        int result = instance.getFarmID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFarmID method, of class Farm.
     */
    @Test
    public void testSetFarmID() {
        System.out.println("setFarmID");
        int farmID = 0;
        Farm instance = null;
        instance.setFarmID(farmID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarmName method, of class Farm.
     */
    @Test
    public void testGetFarmName() {
        System.out.println("getFarmName");
        Farm instance = null;
        String expResult = "";
        String result = instance.getFarmName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFarmName method, of class Farm.
     */
    @Test
    public void testSetFarmName() {
        System.out.println("setFarmName");
        String farmName = "";
        Farm instance = null;
        instance.setFarmName(farmName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarmAddress method, of class Farm.
     */
    @Test
    public void testGetFarmAddress() {
        System.out.println("getFarmAddress");
        Farm instance = null;
        String expResult = "";
        String result = instance.getFarmAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFarmAddress method, of class Farm.
     */
    @Test
    public void testSetFarmAddress() {
        System.out.println("setFarmAddress");
        String farmAddress = "";
        Farm instance = null;
        instance.setFarmAddress(farmAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarmOwner method, of class Farm.
     */
    @Test
    public void testGetFarmOwner() {
        System.out.println("getFarmOwner");
        Farm instance = null;
        User expResult = null;
        User result = instance.getFarmOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFarmOwner method, of class Farm.
     */
    @Test
    public void testSetFarmOwner() {
        System.out.println("setFarmOwner");
        User farmOwner = null;
        Farm instance = null;
        instance.setFarmOwner(farmOwner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
