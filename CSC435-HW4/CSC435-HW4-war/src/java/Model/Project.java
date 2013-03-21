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
   private String title;
   private String dueDate;
   private String description;
    
    public Project() {
        
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setDate(String date) {
        this.dueDate = date;
    }
    
    public String getDate() {
        return dueDate;
    }
    
    public void setDesc(String desc) {
        this.description = desc;
    }
    
}
