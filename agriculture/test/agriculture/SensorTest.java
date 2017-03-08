/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Observer;
import java.util.Observable;

/**
 *
 * @author Jack
 */
public class SensorTest implements Observer {
      
    private Reading lastReading = null;
    
    public SensorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
   
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void clearID() {
        try
        {
            java.lang.reflect.Field idField = Sensor.class.getDeclaredField("idCounter");
            idField.setAccessible(true);
            idField.set(null, 0);
            idField.setAccessible(false);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }     
    }
    
    @Before 
    public void clearVariables() {
        lastReading = null;
    }
    
    /**
     * Test of getID method, of class Sensor.
     * Goes through and creates 20 instances of Sensor.
     * Tests each one ID to see that they are incrementing correctly.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        
        for (int i = 0; i < 20; i++)
        {
            Sensor instance = new Sensor(1, 2, SensorType.RAINFALL); 
            
            int idResult = instance.getID();
            assertEquals(i, idResult);
        }
    }

    /**
     * Test of getType method, of class Sensor.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        
        Sensor instance = new Sensor(1, 2, SensorType.RAINFALL);
        
        SensorType expResult = SensorType.RAINFALL;
        SensorType result = instance.getType();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of updateLocation method, of class Sensor.
     */
    @Test
    public void testUpdateLocation() {
        System.out.println("updateLocation");
        
        /* Variabled needed for initiation */
        Location expStartLocation = new Location(1, 2);
        Location expNewLocation = new Location(3, 4);
        
        Sensor instance = new Sensor(expStartLocation.getLongitude(), 
                expStartLocation.getLatitude(), SensorType.RAINFALL);
        
        Location startLocation = instance.getLocation();
        assertEquals(expStartLocation.getLatitude(), startLocation.getLatitude(), 0);
        assertEquals(expStartLocation.getLongitude(), startLocation.getLongitude(), 0);        
        
        /* Updating logic */
        instance.updateLocation(expNewLocation);
        Location newLocation = instance.getLocation();
        
        /* Assertions */
        assertEquals(expNewLocation.getLatitude(), newLocation.getLatitude(), 0);
        assertEquals(expNewLocation.getLongitude(), newLocation.getLongitude(), 0);
    }

    /**
     * Test of initiateReading method, of class Sensor.
     */
    @Test
    public void testInitiateReading() {
        System.out.println("initiateReading");
        
        Sensor instance = new Sensor(1, 2, SensorType.RAINFALL);
        instance.addObserver(this);

        /* Assert that there hasn't been a change yet and lastReading = null */
        assertEquals(false, instance.hasChanged());
        assertEquals(null, lastReading);
        
        instance.initiateReading();
        
        /* Test to see whether observerable has actually notified observers */
        assertNotEquals(null, lastReading);
    }

    @Override
    public void update(Observable o, Object arg) {
        /* Override so we can store last reading from Sensor */
        lastReading = (Reading)arg;
    }
    
}
