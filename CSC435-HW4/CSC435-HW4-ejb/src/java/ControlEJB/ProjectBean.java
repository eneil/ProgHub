/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import javax.ejb.Stateless;
import Model.ProjList;
import Model.Project;
import java.util.ArrayList;
/**
 *
 * @author Eneil
 */
@Stateless
public class ProjectBean implements ProjectBeanLocal {

    ProjList projects = new ProjList();
    
    @Override
    public ArrayList<Project> addProject(String title, String due, String desc, String lang, String group, String comp, String contact) {
       
        projects.addProject(title, due, desc, lang, group, comp, contact);
        
        return projects.getProjects();
        
    }
}
