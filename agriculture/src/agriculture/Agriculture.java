/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class Agriculture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
        //sets up the REST endpoints
        new RestEndpoints(server);
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                
                JFrame frame = new JFrame();
                FormLogin loginForm = new FormLogin(server, frame);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(loginForm);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
}
