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
   public String language;
   public String description;
   public String dueDate;
   public String numOfPeople;
   public String compensation;
   public String contact;
    
    public Project(String title, String date, String desc, String lang, String groupSize, String comp, String contact) {
        this.title = title;
        this.dueDate = date;
        this.description = desc;
        this.compensation = comp;
        this.language = lang;
        this.numOfPeople = groupSize;
        this.contact = contact;
        
    }
}
