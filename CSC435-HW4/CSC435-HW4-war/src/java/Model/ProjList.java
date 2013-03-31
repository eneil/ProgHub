/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ethan
 */
public class ProjList {
  private ArrayList<Project> projects;
    
    public ProjList() {
        projects = new ArrayList<Project>();
    }
    
    public ArrayList<Project> getProjects() {
        return projects;
    }
    
    public void addProject(String title, String due, String desc) {
        Project tmpProj = new Project(title, due, desc);
        projects.add(tmpProj);
    }
    
    public int getSize() {
        return projects.size();
    }   
}

