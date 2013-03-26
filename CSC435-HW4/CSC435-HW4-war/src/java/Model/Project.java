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
   private String groupSize;
   private String description;
   private String lang;
    
    public Project() {
        
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setLang(String language) {
        this.lang = language;
    }
    
    public void setSize(String size) {
        this.groupSize = size;
    }
    
    public String getSize() {
        return groupSize;
    }
    public String getLang() {
        return lang;
    }
    
    public void setDesc(String desc) {
        this.description = desc;
    }
    
    public String getDesc() {
        return description;
    }
}
