/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.User;
import java.util.ArrayList;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author shawnkrecker
 */
@Local
@Remote
public interface SendMessageBeanLocal {
    
    public void deliverMessage(ArrayList<User> users, HttpServletRequest request);
    
    
}
