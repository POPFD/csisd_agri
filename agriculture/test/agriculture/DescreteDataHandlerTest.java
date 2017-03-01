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
public class DescreteDataHandlerTest {
    
    public DescreteDataHandlerTest() {
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
     * Test of handleRawData method, of class DescreteDataHandler.
     */
    @Test
    public void testHandleRawData() {
        System.out.println("handleRawData");
        Reading rawReading = null;
        DescreteDataHandler instance = new DescreteDataHandler();
        Reading expResult = null;
        Reading result = instance.handleRawData(rawReading);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
