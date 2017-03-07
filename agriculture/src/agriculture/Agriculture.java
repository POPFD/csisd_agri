/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author user
 */
public class Agriculture {
  
    private static Server server = null;
    private static Persistence pers = new Persistence();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                   
        /* Load our saved server, if fails load a default */
        server = pers.loadServer();
        if (server == null)
            server = pers.loadDefaultServer();
              
        //sets up the REST endpoints
        new RestEndpoints(server);
        
        //launches login form
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                
                JFrame frame = new JFrame();
                FormLogin loginForm = new FormLogin(server, frame);
                
                frame.addWindowListener(new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        pers.saveServer(server);
                        System.exit(0);
                    }
                });
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(loginForm);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }       
}
