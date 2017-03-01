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
public class CropTest {
    
    public CropTest() {
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
     * Test of getCropType method, of class Crop.
     */
    @Test
    public void testGetCropType() {
        System.out.println("getCropType");
        Crop instance = new Crop();
        CropName expResult = null;
        CropName result = instance.getCropType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCropType method, of class Crop.
     */
    @Test
    public void testSetCropType() {
        System.out.println("setCropType");
        CropName cropType = null;
        Crop instance = new Crop();
        instance.setCropType(cropType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
