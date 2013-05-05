package ControlEJB;

import Model.MessagesEntity;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

    @PersistenceContext
    EntityManager em;   
    
    public void deliverMessage(HttpServletRequest request){
        
        HttpSession session = request.getSession();

        MessagesEntity mE = new MessagesEntity();
        
        mE.setId((int)(Math.random() *100));
        mE.setRecipient(request.getParameter("recipient"));
        mE.setSender((String)session.getAttribute("currentUser"));
        mE.setTitle(request.getParameter("title"));
        mE.setContent(request.getParameter("content"));
        mE.setMessageDate(new java.util.Date());
        
        em.persist(mE);
        
        
        
//        String tempUserName = request.getParameter("recipient");
//                for(User u: users){
//                    if(u.getUsername().equals(tempUserName)){
//                        u.getMessageList().addMessage((String)session.getAttribute("currentUser"), 
//                        request.getParameter("title"), 
//                        request.getParameter("content"));
//                        
//                        session.setAttribute("msg", "Message Sent");
//            
//                    }
//                }
    }
    
}
