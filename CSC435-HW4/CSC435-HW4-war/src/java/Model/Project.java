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
public class Project {
   public String title;
   public String dueDate;
   public String description;
    
    public Project(String title, String date, String desc) {
        this.title = title;
        this.dueDate = date;
        this.description = desc;
        
    }
}
