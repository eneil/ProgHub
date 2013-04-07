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
public class ListUsers implements ListUsersLocal {

    @Override
    public String listUsers() {

        String userTable = "";
            for (User u: Model.AllUsers.allUsers) {
                    userTable += "<tr><td><img src=\"images/user.gif\"></td><td>" + u.getFirstName() + " " + u.getLastName() + "</td><td>" + u.getJobTitle() + " at " + u.getOccupation() + "</td></tr>";
            }
        return userTable;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
