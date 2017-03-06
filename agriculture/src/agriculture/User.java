/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

/**
 *
 * @author user
 */
public class User implements java.io.Serializable {
    
    private final String username;
    private final String name;
    private final String password;
    
    private SetOfFarmAccess permissions;
    
    public User(String username, String name, String password)
    {
        this.username = username;
        this.name = name;
        this.password = password;     
        this.permissions = new SetOfFarmAccess();
    }
    
    public SetOfFarmAccess getPermissions()
    {
        return permissions;
    }
    
    public boolean checkPassword(String inputPass)
    {
        return password.equals(inputPass);
    }
    
    
    public String getUsername()
    {
        /* 
         * Instead of using checkUsername made a getUsername method,
         * responsibility of checking username should not be in this class.
         */
        return username;
    }
    
    public String getName()
    {
        return name;
    }
    
}
