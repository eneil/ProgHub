/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Message;
import java.util.ArrayList;

/**
 *
 * @author shawnkrecker
 */
public class MessageList {
    
    private ArrayList<Message> messages;
    
    public MessageList(){
        messages = new ArrayList<Message>(); 
        this.addMessage("Ben Gordon","Welcome", "Hi");
        this.addMessage("Ethan Neil","Welcome" ,"Hi");
        
    }
    
    public ArrayList<Message> getMessages(){
        return messages;
    }
    
    public void addMessage(String sender,String title,String content){
        Message tempMessage = new Message(sender,title, content);
        
        messages.add(tempMessage);
    }
    
    public void removeMessage(String message){
        messages.remove(message);
    }
    
    public void clearMessages(){
        messages.clear();
        messages = new ArrayList<Message>();
    }
    
    public int count(){
        return messages.size();
    }
    
    public String unreadCount(){
        int count = 0;
        for(Message m:messages){
            if(m.isUnread()){
                count++;
            }
        }
        if(count == 0){
            return "";
        }
        Integer tempInt = count;
        return "("+tempInt.toString()+")";
    }
    
    public void makeUnread(String message){
        if(messages.contains(message)){
            
        }
    }
    
}
