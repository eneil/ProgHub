package Main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben Gordon
 */
public class User {
    String fName;
    String lName;
    String occupation;
    String jobTitle;
    String eMail;
    String username;
    String password;
    
    public void User(){
    
    }
        
    public String getFirstName(){
        return fName;
    }
    
    public String getJob(){
        return jobTitle + " at " + occupation;
    }
    
    public String getFullName(){
        return fName + " " + lName;
    }
}
