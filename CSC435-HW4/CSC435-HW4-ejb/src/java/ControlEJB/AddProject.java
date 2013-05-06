/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.Project;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ethan
 */
@Stateless
public class AddProject implements AddProjectLocal {

     @PersistenceContext
     EntityManager em;
    
     @Override
    public void addProject(Project p) {
        em.persist(p);
    }
}
