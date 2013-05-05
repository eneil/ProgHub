package ControlEJB;

import Model.MessagesEntity;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author shawnkrecker
 */

@Stateful

public class GetMessagesBean implements GetMessagesBeanLocal {

    @PersistenceContext
    EntityManager em;
    
    public List<MessagesEntity> getMessageList(String user){
        
        
        List<MessagesEntity> list = em.createQuery("Select m from MessagesEntity m WHERE m.recipient LIKE :recipientName")
                .setParameter("recipientName", user)
                .getResultList();
        
        return list;

    }

}
