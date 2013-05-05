package ControlEJB;

import Model.MessagesEntity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author shawnkrecker
 */
@Local
public interface GetMessagesBeanLocal {
    
    public List<MessagesEntity> getMessageList(String user);

    
}

