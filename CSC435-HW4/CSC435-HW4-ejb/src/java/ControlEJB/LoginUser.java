/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.User;
import javax.ejb.Stateless;

/**
 *
 * @author Ben Gordon
 */
@Stateless
public class LoginUser implements LoginUserLocal {

    @Override
    public User loginAttempt(String userName, String password) {
        
        User correctUser = null;

        for(User temp: Model.AllUsers.allUsers){            
                if(temp.getUsername().equals(userName)){
                    if (temp.getPassword().equals(password)){
                            correctUser = temp;
                        }
                }
        }
        if (correctUser == null) {
            return null;
        } else {
            return correctUser;
        }
    }

}
