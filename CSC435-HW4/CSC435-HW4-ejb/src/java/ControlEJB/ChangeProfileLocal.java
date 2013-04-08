/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.User;
import javax.ejb.Local;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author shawnkrecker
 */
@Local
public interface ChangeProfileLocal {
    
    public void setProfile(User user,HttpServletRequest request);
}
