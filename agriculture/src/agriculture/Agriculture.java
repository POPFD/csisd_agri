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
        // TODO code application logic here
        User user = new User("john", "John Smith", "sheff");
        Farm farm = new Farm("Sheffield Farm", "Farm Address..", user);
        
        SetOfFarms setOfFarms = new SetOfFarms();
        setOfFarms.add(farm);
        
        SetOfUsers setOfusers = new SetOfUsers();
        setOfusers.add(user);
                
        Server server = new Server();
        server.setSetOfUsers(setOfusers);
        server.setSetOfFarms(setOfFarms);
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FormLogin loginForm = new FormLogin(server);
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(loginForm);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
}
