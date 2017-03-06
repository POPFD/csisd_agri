/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

/**
 *
 * @author student
 */
public class DataHandlerMethod implements java.io.Serializable{
    
    public Reading handleRawData(Reading rawReading){
        
        /* Standard data handler just returns the original reading */    
        
        return rawReading;   
    }
    
}
