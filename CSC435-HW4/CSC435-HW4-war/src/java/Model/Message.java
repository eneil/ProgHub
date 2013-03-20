/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;

/**
 *
 * @author shawnkrecker
 */
public class Message {
   
    
    private String sender;
    private String title;
    private String content;
    private Calendar date;

    private Boolean unread = true;
    
    public Message(String sender,String title, String content){
        this.sender = sender;
        this.title = title;
        this.content = content;
        date = Calendar.getInstance();
    }
    
    public Boolean isUnread(){
        if(unread){
            return true;
        }else{
            return false;
        }
    }
    
    public void setSender(String sender){
        this.sender = sender;
    }
    
    public String getSender(){
        return sender;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setContent(String content){
        this.content = content;
    }
    
    public String getContent(){
        return content;
    }
    
    public String getDate(){
        return date.toString();
    }
    
}
