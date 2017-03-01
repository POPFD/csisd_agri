/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.Date;
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
public class SetOfHarvestsTest {
    
    public SetOfHarvestsTest() {
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
     * Test of addHarvest method, of class SetOfHarvests.
     */
    @Test
    public void testAddHarvest() {
        System.out.println("addHarvest");
        Harvest harvest = null;
        SetOfHarvests instance = new SetOfHarvests();
        instance.addHarvest(harvest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeHarvest method, of class SetOfHarvests.
     */
    @Test
    public void testRemoveHarvest() {
        System.out.println("removeHarvest");
        Harvest harvest = null;
        SetOfHarvests instance = new SetOfHarvests();
        instance.removeHarvest(harvest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHarvestByTime method, of class SetOfHarvests.
     */
    @Test
    public void testGetHarvestByTime() {
        System.out.println("getHarvestByTime");
        Date time = null;
        SetOfHarvests instance = new SetOfHarvests();
        Harvest expResult = null;
        Harvest result = instance.getHarvestByTime(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHarvestByCrop method, of class SetOfHarvests.
     */
    @Test
    public void testGetHarvestByCrop() {
        System.out.println("getHarvestByCrop");
        Crop cropname = null;
        SetOfHarvests instance = new SetOfHarvests();
        SetOfHarvests expResult = null;
        SetOfHarvests result = instance.getHarvestByCrop(cropname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
