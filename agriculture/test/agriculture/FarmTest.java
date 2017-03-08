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
public class FarmTest {
    
    public FarmTest() {
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
     * Test of setFields & getFields method, of class Farm.
     */
    @Test
    public void testSetFields() {
        System.out.println("setFields");
        
        User user = new User("username1", "User1", "Password1");
        Farm instance = new Farm("farm1", "1 fake street", user);
        
        SetOfFields fields = null;    
        instance.setFields(fields);
        assertEquals(null, instance.getFields());
        
        fields = new SetOfFields();
        instance.setFields(fields);
        assertEquals(fields, instance.getFields());
    }

    /**
     * Test of getFarmID method, of class Farm.
     */
    @Test
    public void testGetFarmID() {
        System.out.println("getFarmID");
        
        User user = new User("username1", "User1", "Password1");

        for (int i = 0; i < 20; i++)
        {
            Farm instance = new Farm("farm1", "1 fake street", user); 
            
            int idResult = instance.getFarmID();
            assertEquals(i, idResult);
        }
    }

    /**
     * Test of setFarmID method, of class Farm.
     */
    @Test
    public void testSetFarmID() {
        System.out.println("setFarmID");
        
        User user = new User("username1", "User1", "Password1");
        Farm instance = new Farm("farm1", "1 fake street", user);
        
        for (int i = 0; i < 20; i++)
        {
            int idBefore = instance.getFarmID();
            instance.setFarmID(idBefore + 1);
            
            int idAfter = instance.getFarmID();
            
            assertEquals(idBefore + 1, idAfter);
        }
    }

    /**
     * Test of getFarmName method, of class Farm.
     */
    @Test
    public void testGetFarmName() {
        System.out.println("getFarmName");
        
        User user = new User("username1", "User1", "Password1");
        Farm instance = new Farm("farm1", "1 fake street", user);
        

        assertEquals("farm1", instance.getFarmName());
    }

    /**
     * Test of setFarmName method, of class Farm.
     */
    @Test
    public void testSetFarmName() {
        System.out.println("setFarmName");
        
        User user = new User("username1", "User1", "Password1");
        Farm instance = new Farm("farm1", "1 fake street", user);
        
        assertEquals("farm1", instance.getFarmName());
        
        instance.setFarmName("farm2");
        
        assertEquals("farm2", instance.getFarmName());
    }

    /**
     * Test of getFarmAddress method, of class Farm.
     */
    @Test
    public void testGetFarmAddress() {
        System.out.println("getFarmAddress");

        User user = new User("username1", "User1", "Password1");
        Farm instance = new Farm("farm1", "1 fake street", user);
        
        assertEquals("1 fake street", instance.getFarmAddress());
    }

    /**
     * Test of setFarmAddress method, of class Farm.
     */
    @Test
    public void testSetFarmAddress() {
        System.out.println("setFarmAddress");

        User user = new User("username1", "User1", "Password1");
        Farm instance = new Farm("farm1", "1 fake street", user);
        
        assertEquals("1 fake street", instance.getFarmAddress());
        
        instance.setFarmAddress("2 fake street");
        
        assertEquals("2 fake street", instance.getFarmAddress());
    }

    /**
     * Test of getFarmOwner method, of class Farm.
     */
    @Test
    public void testGetFarmOwner() {
        System.out.println("getFarmOwner");

        User user = new User("username1", "User1", "Password1");
        Farm instance = new Farm("farm1", "1 fake street", user);
        
        User farmOwner = instance.getFarmOwner();
        
        assertNotEquals(null, farmOwner);
        assertEquals(user, farmOwner);
    }

    /**
     * Test of setFarmOwner method, of class Farm.
     */
    @Test
    public void testSetFarmOwner() {
        System.out.println("setFarmOwner");

        User user1 = new User("username1", "User1", "Password1");
        User user2 = new User("username2", "User2", "Password2");
        
        Farm instance = new Farm("farm1", "1 fake street", user1);
        
        User farmOwner = instance.getFarmOwner();
        assertEquals(user1, farmOwner);
        
        instance.setFarmOwner(user2);
        
        farmOwner = instance.getFarmOwner();
        assertNotEquals(null, farmOwner);
        assertEquals(user2, farmOwner);     
    }
    
}
