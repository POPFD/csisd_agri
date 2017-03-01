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
public class SetOfSensorMonitorsTest {
    
    public SetOfSensorMonitorsTest() {
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
     * Test of addSensorMonitor method, of class SetOfSensorMonitors.
     */
    @Test
    public void testAddSensorMonitor() {
        System.out.println("addSensorMonitor");
        SensorMonitor sensorMonitor = null;
        SetOfSensorMonitors instance = new SetOfSensorMonitors();
        instance.addSensorMonitor(sensorMonitor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeSensor method, of class SetOfSensorMonitors.
     */
    @Test
    public void testRemoveSensor() {
        System.out.println("removeSensor");
        SensorMonitor sensorMonitor = null;
        SetOfSensorMonitors instance = new SetOfSensorMonitors();
        instance.removeSensor(sensorMonitor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonitorByID method, of class SetOfSensorMonitors.
     */
    @Test
    public void testGetMonitorByID() {
        System.out.println("getMonitorByID");
        ID = null;
        SetOfSensorMonitors instance = new SetOfSensorMonitors();
        instance.getMonitorByID(<error>);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
