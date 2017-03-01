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
public class FarmAccessTest {
    
    public FarmAccessTest() {
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
     * Test of setAccessLevel method, of class FarmAccess.
     */
    @Test
    public void testSetAccessLevel() {
        System.out.println("setAccessLevel");
        AccessLevel accessLevel = null;
        FarmAccess instance = null;
        instance.setAccessLevel(accessLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarm method, of class FarmAccess.
     */
    @Test
    public void testGetFarm() {
        System.out.println("getFarm");
        FarmAccess instance = null;
        Farm expResult = null;
        Farm result = instance.getFarm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccessLevel method, of class FarmAccess.
     */
    @Test
    public void testGetAccessLevel() {
        System.out.println("getAccessLevel");
        FarmAccess instance = null;
        AccessLevel expResult = null;
        AccessLevel result = instance.getAccessLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
