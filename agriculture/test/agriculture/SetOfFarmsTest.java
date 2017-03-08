/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Jack
 */
public class SetOfFarmsTest {
    
    public SetOfFarmsTest() {
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
            java.lang.reflect.Field idField = Farm.class.getDeclaredField("idCounter");
            idField.setAccessible(true);
            idField.set(null, 0);
            idField.setAccessible(false);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }     
    }

    /**
     * Test of addFarm method, of class SetOfFarms.
     */
    @Test
    public void testAddFarm() {
        System.out.println("addFarm");
        
        User user = new User("username1", "User1", "Password1");
        Farm farm1 = new Farm("farm1", "1 fake street", user);
        Farm farm2 = new Farm("farm2", "2 fake street", user);
        
        SetOfFarms instance = new SetOfFarms();
        
        /* Should be no farms in the array */
        assertEquals(0, instance.size());
        
        /* Add one farm to array and test */
        instance.addFarm(farm1);
        assertEquals(1, instance.size());
        
        /* Add same farm again to array and test */
        instance.add(farm1);
        assertEquals(2, instance.size());
        
        /* Add different farm to array and test */
        instance.add(farm2);
        assertEquals(3, instance.size());
    }

    /**
     * Test of removeFarm method, of class SetOfFarms.
     */
    @Test
    public void testRemoveFarm() {
        System.out.println("removeFarm");

        User user = new User("username1", "User1", "Password1");
        Farm farm1 = new Farm("farm1", "1 fake street", user);
        Farm farm2 = new Farm("farm2", "2 fake street", user);
        
        SetOfFarms instance = new SetOfFarms();
        
        /* Should be no farms in the array */
        assertEquals(0, instance.size());
        
        /* Add farms to array and test */
        instance.add(farm1);
        instance.add(farm2);
        assertEquals(2, instance.size());
        
        /* Remove farm 2 */
        instance.remove(farm2);
        assertEquals(1, instance.size());
        
        /* Remove farm 2 (doesn't exist so size should be 1 still) */
        instance.remove(farm2);
        assertEquals(1, instance.size());
        
        /* Remove farm 1 (final one so size should go to 0) */
        instance.remove(farm1);
        assertEquals(0, instance.size());
    }

    /**
     * Test of getFarmByName method, of class SetOfFarms.
     */
    @Test
    public void testGetFarmByName() {
        System.out.println("getFarmByName");

        User user = new User("username1", "User1", "Password1");
        Farm farm1 = new Farm("farm1", "1 fake street", user);
        Farm farm2 = new Farm("farm2", "2 fake street", user);
        
        SetOfFarms instance = new SetOfFarms();
               
        /* Add farms to array and test */
        instance.add(farm1);
        instance.add(farm2);
        
        /* Test with a valid name */
        Farm retFarm = instance.getFarmByName("farm1");
        assertEquals(farm1, retFarm);
        
        /* Test with an invalid farm name */
        retFarm = instance.getFarmByName("farm3");
        assertEquals(null, retFarm);
    }

    /**
     * Test of getFarmByID method, of class SetOfFarms.
     */
    @Test
    public void testGetFarmByID() {
        System.out.println("getFarmByID");
        
        User user = new User("username1", "User1", "Password1");
        
        /* Will have ID 0 */
        Farm farm1 = new Farm("farm1", "1 fake street", user); 
        
        /* Will have ID 1 */
        Farm farm2 = new Farm("farm2", "2 fake street", user); 
        
        SetOfFarms instance = new SetOfFarms();
               
        /* Add farms to array and test */
        instance.add(farm1);
        instance.add(farm2);
        
        /* Test with a valid ID */
        Farm retFarm = instance.getFarmByID(0);
        assertEquals(farm1, retFarm);
        
        /* Test with another valid farm ID */
        retFarm = instance.getFarmByID(1);
        assertEquals(farm2, retFarm);
        
        /* Test with an invalid farm ID */
        retFarm = instance.getFarmByID(100);
        assertEquals(null, retFarm);
    }
    
}
