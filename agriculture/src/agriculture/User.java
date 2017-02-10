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
public class User {
    
    private final String username;
    private final String name;
    private final String password;
    
    private Permissions permissions = null;
    
    public User(String username, String name, String password)
    {
        this.username = username;
        this.name = name;
        this.password = password;
    }
    
    public void setPermissions(Permissions newPerms)
    {
        permissions = newPerms;
    }
    
    public Permissions getPermissions()
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
