/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import javax.ejb.Local;

/**
 *
 * @author Ben Gordon
 */
@Local
public interface ListUsersLocal {

    String listUsers();
    
}
