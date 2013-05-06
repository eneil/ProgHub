/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.User;
import Model.Userlist;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ben Gordon
 */
@Stateless
public class ListUsers implements ListUsersLocal {
    
    @PersistenceContext
    EntityManager em;

    @Override
    public String listUsers() {

        List<Userlist> allUsers = new ArrayList<Userlist>();
        try {
            allUsers = em.createQuery("SELECT u FROM Userlist u")
                    .getResultList();
        }
        catch (NoResultException e) {}
        
        String userTable = "";
            for (Userlist u: allUsers) {
                    userTable += "<tr><td><img src=\"images/user.gif\"></td><td>" + u.getFName() + " " + u.getLName() + "</td><td>" + u.getJobTitle() + " at " + u.getOccupation() + "</td></tr>";
            }
        return userTable;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
