/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.User;
import Model.Userlist;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ben Gordon
 */
@Stateless
public class AddUser implements AddUserLocal {
    
    @PersistenceContext
    EntityManager em;

    @Override
    public void addUser(User newUser) {
    //    Model.AllUsers.allUsers.add(newUser);  OLD EJB CODE
        
        Userlist tempUser = new Userlist();
        tempUser.setFName(newUser.getFirstName());
        tempUser.setLName(newUser.getLastName());
        tempUser.setUsername(newUser.getUsername());
        tempUser.setPassword(newUser.getPassword());
        tempUser.setEMail(newUser.getEmail());
        tempUser.setCertifications(newUser.getCertifications());
        tempUser.setCurrentLocation(newUser.getCurrentLocation());
        tempUser.setEducation(newUser.getEducation());
        tempUser.setHobbies(newUser.getHobbies());
        tempUser.setOccupation(newUser.getOccupation());
        tempUser.setJobTitle(newUser.getJobTitle());
        tempUser.setSkills(newUser.getSkills());
        em.persist(tempUser);
        
        
    }



}
