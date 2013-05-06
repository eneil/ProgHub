/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author shawnkrecker
 */
@Entity
@Table(name = "messages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MessagesEntity.findAll", query = "SELECT m FROM MessagesEntity m"),
    @NamedQuery(name = "MessagesEntity.findById", query = "SELECT m FROM MessagesEntity m WHERE m.id = :id"),
    @NamedQuery(name = "MessagesEntity.findBySender", query = "SELECT m FROM MessagesEntity m WHERE m.sender = :sender"),
    @NamedQuery(name = "MessagesEntity.findByRecipient", query = "SELECT m FROM MessagesEntity m WHERE m.recipient = :recipient"),
    @NamedQuery(name = "MessagesEntity.findByTitle", query = "SELECT m FROM MessagesEntity m WHERE m.title = :title"),
    @NamedQuery(name = "MessagesEntity.findByContent", query = "SELECT m FROM MessagesEntity m WHERE m.content = :content"),
    @NamedQuery(name = "MessagesEntity.findByMessageDate", query = "SELECT m FROM MessagesEntity m WHERE m.messageDate = :messageDate")})
public class MessagesEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 35)
    @Column(name = "sender")
    private String sender;
    @Size(max = 35)
    @Column(name = "recipient")
    private String recipient;
    @Size(max = 35)
    @Column(name = "title")
    private String title;
    @Size(max = 250)
    @Column(name = "content")
    private String content;
    @Column(name = "messageDate")
    @Temporal(TemporalType.DATE)
    private Date messageDate;

    public MessagesEntity() {
    }

    public MessagesEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MessagesEntity)) {
            return false;
        }
        MessagesEntity other = (MessagesEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.MessagesEntity[ id=" + id + " ]";
    }
    
}
