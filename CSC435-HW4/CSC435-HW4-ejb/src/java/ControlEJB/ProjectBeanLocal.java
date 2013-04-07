/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.Project;
import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author Eneil
 */
@Local
public interface ProjectBeanLocal {
    
   public ArrayList<Project> addProject(String title, String due, String desc, String lang, String group, String comp, String contact);

   
}
