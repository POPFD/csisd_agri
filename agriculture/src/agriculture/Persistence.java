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
        
        
        /* Create farm access levels for user */
        FarmAccess fa1 = new FarmAccess(farm1, AccessLevel.ReadWrite);
        FarmAccess fa2 = new FarmAccess(farm2, AccessLevel.ReadOnly);
        user.getPermissions().add(fa1);
        user.getPermissions().add(fa2);
        
        
        SetOfFarms setOfFarms = new SetOfFarms();
        setOfFarms.add(farm1);
        setOfFarms.add(farm2);
        
        
        FieldStation fs1 = new FieldStation(1.234, -4.456, farm1);
        FieldStation fs2 = new FieldStation(1.234, -4.456, farm2);
        
        SetOfFieldStations fieldStationList = new SetOfFieldStations();
        fs2.addNewSensor(SensorType.TEMPERATURE);
        fs2.addNewSensor(SensorType.BAROMETRIC);
        fs2.addNewSensor(SensorType.RAINFALL);
        fs1.addNewSensor(SensorType.TEMPERATURE);
        fs1.addNewSensor(SensorType.BAROMETRIC);
        fs1.addNewSensor(SensorType.RAINFALL);
        fieldStationList.add(fs1);
        fieldStationList.add(fs2);
                
        SetOfUsers setOfusers = new SetOfUsers();
        setOfusers.add(user);
                
        Server server = new Server();
        server.setSetOfUsers(setOfusers);
        server.setSetOfFarms(setOfFarms);
        server.setSetOfFieldStations(fieldStationList); 
        
        return server;
    }
    
}
