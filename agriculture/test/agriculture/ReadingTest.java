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
public class ReadingTest {
    
    public ReadingTest() {
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
     * Test of getReadingTime method, of class Reading.
     */
    @Test
    public void testGetReadingTime() {
        System.out.println("getReadingTime");
        Reading instance = null;
        Date expResult = null;
        Date result = instance.getReadingTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReadingValue method, of class Reading.
     */
    @Test
    public void testGetReadingValue() {
        System.out.println("getReadingValue");
        Reading instance = null;
        Object expResult = null;
        Object result = instance.getReadingValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReadingLocation method, of class Reading.
     */
    @Test
    public void testGetReadingLocation() {
        System.out.println("getReadingLocation");
        Reading instance = null;
        Location expResult = null;
        Location result = instance.getReadingLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
