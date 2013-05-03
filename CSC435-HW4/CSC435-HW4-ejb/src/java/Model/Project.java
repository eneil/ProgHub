/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ethan
 */
@Entity
@Table(name = "project")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Project.findAll", query = "SELECT p FROM Project p"),
    @NamedQuery(name = "Project.findByTitle", query = "SELECT p FROM Project p WHERE p.title = :title"),
    @NamedQuery(name = "Project.findByDescription", query = "SELECT p FROM Project p WHERE p.description = :description"),
    @NamedQuery(name = "Project.findByDue", query = "SELECT p FROM Project p WHERE p.due = :due"),
    @NamedQuery(name = "Project.findByContributors", query = "SELECT p FROM Project p WHERE p.contributors = :contributors"),
    @NamedQuery(name = "Project.findByCompensation", query = "SELECT p FROM Project p WHERE p.compensation = :compensation"),
    @NamedQuery(name = "Project.findByContact", query = "SELECT p FROM Project p WHERE p.contact = :contact"),
    @NamedQuery(name = "Project.findByLang", query = "SELECT p FROM Project p WHERE p.lang = :lang")})
public class Project implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "title")
    @Id
    private String title;
    @Size(max = 1000)
    @Column(name = "description")
    private String description;
    @Size(max = 15)
    @Column(name = "due")
    private String due;
    @Size(max = 20)
    @Column(name = "contributors")
    private String contributors;
    @Size(max = 15)
    @Column(name = "compensation")
    private String compensation;
    @Size(max = 50)
    @Column(name = "contact")
    private String contact;
    @Size(max = 75)
    @Column(name = "lang")
    private String lang;

    public Project() {
        
    }

  

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

 


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getContributors() {
        return contributors;
    }

    public void setContributors(String contributors) {
        this.contributors = contributors;
    }

    public String getCompensation() {
        return compensation;
    }

    public void setCompensation(String compensation) {
        this.compensation = compensation;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }



    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project)) {
            return false;
        }
        Project other = (Project) object;
        if ((this.title == null && other.title != null) || (this.title != null && !this.title.equals(other.title))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Project[ title=" + title + " ]";
    }
    
}
