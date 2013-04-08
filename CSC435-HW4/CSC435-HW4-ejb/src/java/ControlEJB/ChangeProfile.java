/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.User;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author shawnkrecker
 */
@Stateless
public class ChangeProfile implements ChangeProfileLocal {

    public void setProfile(User user, HttpServletRequest request){
        
        user.setUsername(request.getParameter("username"));
        user.setFirstName(request.getParameter("firstname"));
        user.setLastName(request.getParameter("lastname"));
        user.setEmail(request.getParameter("email"));
        user.setOccupation(request.getParameter("occupation"));
        user.setJobTitle(request.getParameter("jobtitle"));
        user.setSkills(request.getParameter("skills"));
        user.setHobbies(request.getParameter("hobbies"));
        
    }
    
}