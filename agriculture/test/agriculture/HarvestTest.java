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
public class HarvestTest {
    
    public HarvestTest() {
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
     * Test of getHarvestDate method, of class Harvest.
     */
    @Test
    public void testGetHarvestDate() {
        System.out.println("getHarvestDate");
        Harvest instance = null;
        Date expResult = null;
        Date result = instance.getHarvestDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHarvestDate method, of class Harvest.
     */
    @Test
    public void testSetHarvestDate() {
        System.out.println("setHarvestDate");
        Date harvestDate = null;
        Harvest instance = null;
        instance.setHarvestDate(harvestDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCropType method, of class Harvest.
     */
    @Test
    public void testGetCropType() {
        System.out.println("getCropType");
        Harvest instance = null;
        Crop expResult = null;
        Crop result = instance.getCropType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCropType method, of class Harvest.
     */
    @Test
    public void testSetCropType() {
        System.out.println("setCropType");
        Crop cropType = null;
        Harvest instance = null;
        instance.setCropType(cropType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHarvestYield method, of class Harvest.
     */
    @Test
    public void testGetHarvestYield() {
        System.out.println("getHarvestYield");
        Harvest instance = null;
        double expResult = 0.0;
        double result = instance.getHarvestYield();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHarvestYield method, of class Harvest.
     */
    @Test
    public void testSetHarvestYield() {
        System.out.println("setHarvestYield");
        double harvestYield = 0.0;
        Harvest instance = null;
        instance.setHarvestYield(harvestYield);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
