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
public class FieldTest {
    
    public FieldTest() {
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
     * Test of getPlots method, of class Field.
     */
    @Test
    public void testGetPlots() {
        System.out.println("getPlots");
        Field instance = new Field();
        SetOfPlots expResult = null;
        SetOfPlots result = instance.getPlots();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlots method, of class Field.
     */
    @Test
    public void testSetPlots() {
        System.out.println("setPlots");
        SetOfPlots newPlots = null;
        Field instance = new Field();
        instance.setPlots(newPlots);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Field.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Field instance = new Field();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
