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
public class SetOfPlotsTest {
    
    public SetOfPlotsTest() {
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
     * Test of addPlot method, of class SetOfPlots.
     */
    @Test
    public void testAddPlot() {
        System.out.println("addPlot");
        Plot aPlot = null;
        SetOfPlots instance = new SetOfPlots();
        instance.addPlot(aPlot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePlot method, of class SetOfPlots.
     */
    @Test
    public void testRemovePlot() {
        System.out.println("removePlot");
        Plot aPlot = null;
        SetOfPlots instance = new SetOfPlots();
        instance.removePlot(aPlot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPlotsByCropType method, of class SetOfPlots.
     */
    @Test
    public void testFindPlotsByCropType() {
        System.out.println("findPlotsByCropType");
        CropName cropName = null;
        SetOfPlots instance = new SetOfPlots();
        SetOfPlots expResult = null;
        SetOfPlots result = instance.findPlotsByCropType(cropName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
