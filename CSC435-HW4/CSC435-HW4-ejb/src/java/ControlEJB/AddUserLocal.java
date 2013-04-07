/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.User;
import javax.ejb.Local;

/**
 *
 * @author Ben Gordon
 */
@Local
public interface AddUserLocal {

    void addUser(User newUser);
    
}
