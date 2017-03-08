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
public class SetOfFarmAccessTest {
    
    public SetOfFarmAccessTest() {
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
     * Test of addFarmAccess method, of class SetOfFarmAccess.
     */
    @Test
    public void testAddFarmAccess() {
        System.out.println("addFarmAccess");
        FarmAccess farmAccess = null;
        SetOfFarmAccess instance = new SetOfFarmAccess();
        instance.addFarmAccess(farmAccess);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFarmAccess method, of class SetOfFarmAccess.
     */
    @Test
    public void testRemoveFarmAccess() {
        System.out.println("removeFarmAccess");
        FarmAccess farmAccess = null;
        SetOfFarmAccess instance = new SetOfFarmAccess();
        instance.removeFarmAccess(farmAccess);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarmAccessByFarm method, of class SetOfFarmAccess.
     */
    @Test
    public void testGetFarmAccessByFarm() {
        System.out.println("getFarmAccessByFarm");
        Farm farm = null;
        SetOfFarmAccess instance = new SetOfFarmAccess();
        FarmAccess expResult = null;
        FarmAccess result = instance.getFarmAccessByFarm(farm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
