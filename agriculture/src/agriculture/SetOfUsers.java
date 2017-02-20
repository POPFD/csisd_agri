/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.ArrayList;
import java.util.Collection;
import java.io.Serializable;

/**
 *
 * @author user
 */
public class SetOfUsers extends ArrayList<User> implements Serializable {
   
    public SetOfUsers()
    {
        super();
    }
    
    public SetOfUsers(Collection<? extends User> c)
    {
        super(c);
    }
    
    public void addUser(User user)
    {
        super.add(user);
    }
    
    public void removeUser(User user)
    {
        super.remove(user);
    }
    
    public User getUserByUsername(String username)
    {
        User result = null;
        
        for (User tmp: this)
        {
            if (tmp.getUsername().equals(username))
            {
                result = tmp;
                break;
            }
        }
        
        return result;
    }
}
