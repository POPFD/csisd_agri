/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class SetOfFields extends ArrayList<Field>{
    
    public SetOfFields()
    {
        super();
    }
    
    public void addField(Field aField){
        super.add(aField);
    }
    
    public void removeField(Field aField){
        super.remove(aField);
    }
    
}
