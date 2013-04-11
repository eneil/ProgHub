package ControlEJB;

import Model.User;
import java.util.ArrayList;
import javax.ejb.Stateful;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shawnkrecker
 * 
 * Session Bean with business logic for sending a message to another user.
 * 
 */
@Stateful
public class SendMessageBean implements SendMessageBeanLocal {

    
    
    public void deliverMessage(ArrayList<User> users, HttpServletRequest request){
        
        HttpSession session = request.getSession();
        
        String tempUserName = request.getParameter("recipient");
                for(User u: users){
                    if(u.getUsername().equals(tempUserName)){
                        u.getMessageList().addMessage((String)session.getAttribute("currentUser"), 
                        request.getParameter("title"), 
                        request.getParameter("content"));
                        
                        session.setAttribute("msg", "Message Sent");
            
                    }
                }
    }
    
}
