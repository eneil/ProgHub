package Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


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
    
    public void addProject(String title, String due, String desc, String lang, String group, String comp, String contact) {
        Project tmpProj = new Project();
        tmpProj.setTitle(title);
        tmpProj.setDue(due);
        tmpProj.setDescription(desc);
        tmpProj.setLang(lang);
        tmpProj.setContributors(group);
        tmpProj.setCompensation(comp);
        tmpProj.setContact(contact);
        projects.add(tmpProj);
    }
    
    public int getSize() {
        return projects.size();
    }   
}

