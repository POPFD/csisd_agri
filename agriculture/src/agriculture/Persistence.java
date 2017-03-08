/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.io.*;

/**
 *
 * @author user
 */
public class Persistence {
    
    private final static String SERVER_FILE = "server.dat";
    
    public boolean saveServer(Server server)
    {
        boolean result;        
        try
        {
            FileOutputStream fileOut = new FileOutputStream(SERVER_FILE);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(server);
            out.close();
            fileOut.close();
            
            result = true;
        }
        catch (IOException i)
        {
            i.printStackTrace();
            result = false;
        }
        
        return result;
    }
    
    public Server loadServer() {
        Server server = null;
        
        try
        {
            /* Set up our streams and read object */
            FileInputStream fileIn = new FileInputStream(SERVER_FILE);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            server = (Server)in.readObject();
            
            /* Close all needed handles */
            in.close();
            fileIn.close();
        }
        catch (IOException i)
        {
            /* Do nothing */
            i.printStackTrace();
        }
        catch (ClassNotFoundException c)
        {
            /* Do nothing */
            c.printStackTrace();
        }
        
        return server;
    }
    
    public Server loadDefaultServer()
    {
        /* Create users and farms */
        User user = new User("john", "John Smith", "sheff");
        Farm farm1 = new Farm("Sheffield Farm", "Sheffield 177 Road", user);
        Farm farm2 = new Farm("Wales Farm", "Wales 455 Road", user);
        
        
        /* Add a set of fields to the farms */
        SetOfFields fieldsFarm1 = new SetOfFields();
        Location fieldLocation1 = new Location(1.234, -4.456);
        
        fieldsFarm1.add(new Field(fieldLocation1));
        farm1.setFields(fieldsFarm1);
        
        SetOfFields fieldsFarm2 = new SetOfFields();
        Location fieldLocation2 = new Location(2.345, -6.789);
        fieldsFarm2.add(new Field(fieldLocation2));
        farm2.setFields(fieldsFarm2);
        
        /* Add sensors to the field stations within farms */
        FieldStation fieldStation = farm1.getFields().get(0).getFieldStation();
        fieldStation.addNewSensor(SensorType.TEMPERATURE);
        fieldStation.addNewSensor(SensorType.BAROMETRIC);
        fieldStation.addNewSensor(SensorType.RAINFALL);
                
        /* Create our farms and SetOfFarms for server */
        SetOfFarms setOfFarms = new SetOfFarms();
        setOfFarms.add(farm1);
        setOfFarms.add(farm2);
        
        /* Create farm access levels for user */
        FarmAccess fa1 = new FarmAccess(farm1, AccessLevel.ReadWrite);
        FarmAccess fa2 = new FarmAccess(farm2, AccessLevel.ReadOnly);
        user.getPermissions().add(fa1);
        user.getPermissions().add(fa2);
                        
        SetOfUsers setOfUsers = new SetOfUsers();
        setOfUsers.add(user);
                
        Server server = Server.getInstance();
        server.setSetOfUsers(setOfUsers);
        server.setSetOfFarms(setOfFarms);
        
        return server;
    }
    
}
