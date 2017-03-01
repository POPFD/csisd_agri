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
public class FSManagerGUITest {
    
    public FSManagerGUITest() {
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
     * Test of login method, of class FSManagerGUI.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        FSManagerGUI instance = new FSManagerGUI();
        boolean expResult = false;
        boolean result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMessage method, of class FSManagerGUI.
     */
    @Test
    public void testDisplayMessage() {
        System.out.println("displayMessage");
        String message = "";
        FSManagerGUI instance = new FSManagerGUI();
        instance.displayMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configureUserPermissions method, of class FSManagerGUI.
     */
    @Test
    public void testConfigureUserPermissions() {
        System.out.println("configureUserPermissions");
        User user = null;
        FSManagerGUI instance = new FSManagerGUI();
        instance.configureUserPermissions(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configureUI method, of class FSManagerGUI.
     */
    @Test
    public void testConfigureUI() {
        System.out.println("configureUI");
        Permissions permission = null;
        FSManagerGUI instance = new FSManagerGUI();
        instance.configureUI(permission);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewFieldStation method, of class FSManagerGUI.
     */
    @Test
    public void testAddNewFieldStation() {
        System.out.println("addNewFieldStation");
        Double test = null;
        Double test2 = null;
        String test3 = "";
        FSManagerGUI instance = new FSManagerGUI();
        instance.addNewFieldStation(test, test2, test3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewSensor method, of class FSManagerGUI.
     */
    @Test
    public void testAddNewSensor() {
        System.out.println("addNewSensor");
        Double test = null;
        Double test2 = null;
        String test3 = "";
        FSManagerGUI instance = new FSManagerGUI();
        instance.addNewSensor(test, test2, test3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class FSManagerGUI.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        FSManagerGUI instance = new FSManagerGUI();
        Reading expResult = null;
        Reading result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayData method, of class FSManagerGUI.
     */
    @Test
    public void testDisplayData() {
        System.out.println("displayData");
        FSManagerGUI instance = new FSManagerGUI();
        instance.displayData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeUserPermissions method, of class FSManagerGUI.
     */
    @Test
    public void testChangeUserPermissions() {
        System.out.println("changeUserPermissions");
        Farm farm = null;
        AccessLevel accessLevel = null;
        FSManagerGUI instance = new FSManagerGUI();
        instance.changeUserPermissions(farm, accessLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUserPermissions method, of class FSManagerGUI.
     */
    @Test
    public void testAddUserPermissions() {
        System.out.println("addUserPermissions");
        String string = "";
        AccessLevel accessLevel = null;
        FSManagerGUI instance = new FSManagerGUI();
        instance.addUserPermissions(string, accessLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
