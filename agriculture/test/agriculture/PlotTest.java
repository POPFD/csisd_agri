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
public class PlotTest {
    
    public PlotTest() {
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
     * Test of setCrop method, of class Plot.
     */
    @Test
    public void testSetCrop() {
        System.out.println("setCrop");
        Crop aCrop = null;
        Plot instance = null;
        instance.setCrop(aCrop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Plot.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        Location aLocation = null;
        Plot instance = null;
        instance.setLocation(aLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHarvestHistory method, of class Plot.
     */
    @Test
    public void testSetHarvestHistory() {
        System.out.println("setHarvestHistory");
        SetOfHarvests aHistory = null;
        Plot instance = null;
        instance.setHarvestHistory(aHistory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlotState method, of class Plot.
     */
    @Test
    public void testSetPlotState() {
        System.out.println("setPlotState");
        PlotState aPlotState = null;
        Plot instance = null;
        instance.setPlotState(aPlotState);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHarvestHistory method, of class Plot.
     */
    @Test
    public void testGetHarvestHistory() {
        System.out.println("getHarvestHistory");
        Plot instance = null;
        SetOfHarvests expResult = null;
        SetOfHarvests result = instance.getHarvestHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Plot.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        Area anArea = null;
        Plot instance = null;
        instance.setArea(anArea);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCrop method, of class Plot.
     */
    @Test
    public void testGetCrop() {
        System.out.println("getCrop");
        Plot instance = null;
        Crop expResult = null;
        Crop result = instance.getCrop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Plot.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Plot instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
