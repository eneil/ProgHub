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
public class AddUser implements AddUserLocal {

    @Override
    public void addUser(User newUser) {
        Model.AllUsers.allUsers.add(newUser);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
