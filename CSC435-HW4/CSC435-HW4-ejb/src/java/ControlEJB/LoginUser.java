/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.User;
import Model.Userlist;
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
public class LoginUser implements LoginUserLocal {

    @PersistenceContext
    EntityManager em;
    
    @Override
    public User loginAttempt(String userName, String password) {
        
        User correctUser = null;
        Userlist tempUserlist = null;
        User tempUser = new User();
 
        try {
            tempUserlist = (Userlist)em.createNamedQuery("Userlist.findByUsername")
                    .setParameter("username", userName)
                    .getSingleResult();
        }
        catch (NoResultException e) {}

        if (tempUserlist != null) {
            if (tempUserlist.getPassword().equals(password)) {
                tempUser.setFirstName(tempUserlist.getFName());
                tempUser.setLastName(tempUserlist.getLName());
                tempUser.setEmail(tempUserlist.getEMail());
                tempUser.setUsername(tempUserlist.getUsername());
                tempUser.setJobTitle(tempUserlist.getJobTitle());
                tempUser.setOccupation(tempUserlist.getOccupation());
                tempUser.setSkills(tempUserlist.getSkills());
                tempUser.setCertifications(tempUserlist.getCertifications());
                tempUser.setCurrentLocation(tempUserlist.getCurrentLocation());
                tempUser.setHobbies(tempUserlist.getHobbies());
                tempUser.setEducation(tempUserlist.getEducation());
                tempUser.setPassword(tempUserlist.getPassword());
                correctUser = tempUser;
            }
        }

// OLD EJB LOGIN CODE
//        for(User temp: Model.AllUsers.allUsers){            
//                if(temp.getUsername().equals(userName)){
//                    if (temp.getPassword().equals(password)){
//                            correctUser = temp;
//                        }
//                }
//        }
        
        if (correctUser == null) {
            return null;
        } else {
            return correctUser;
        }
    }

}
