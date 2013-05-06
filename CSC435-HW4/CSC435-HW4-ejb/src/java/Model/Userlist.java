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
 * @author Ben Gordon
 */
@Entity
@Table(name = "userlist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userlist.findAll", query = "SELECT u FROM Userlist u"),
    @NamedQuery(name = "Userlist.findByFName", query = "SELECT u FROM Userlist u WHERE u.fName = :fName"),
    @NamedQuery(name = "Userlist.findByLName", query = "SELECT u FROM Userlist u WHERE u.lName = :lName"),
    @NamedQuery(name = "Userlist.findByOccupation", query = "SELECT u FROM Userlist u WHERE u.occupation = :occupation"),
    @NamedQuery(name = "Userlist.findByJobTitle", query = "SELECT u FROM Userlist u WHERE u.jobTitle = :jobTitle"),
    @NamedQuery(name = "Userlist.findByEMail", query = "SELECT u FROM Userlist u WHERE u.eMail = :eMail"),
    @NamedQuery(name = "Userlist.findByUsername", query = "SELECT u FROM Userlist u WHERE u.username = :username"),
    @NamedQuery(name = "Userlist.findByPassword", query = "SELECT u FROM Userlist u WHERE u.password = :password"),
    @NamedQuery(name = "Userlist.findBySkills", query = "SELECT u FROM Userlist u WHERE u.skills = :skills"),
    @NamedQuery(name = "Userlist.findByHobbies", query = "SELECT u FROM Userlist u WHERE u.hobbies = :hobbies"),
    @NamedQuery(name = "Userlist.findByCurrentLocation", query = "SELECT u FROM Userlist u WHERE u.currentLocation = :currentLocation"),
    @NamedQuery(name = "Userlist.findByEducation", query = "SELECT u FROM Userlist u WHERE u.education = :education"),
    @NamedQuery(name = "Userlist.findByCertifications", query = "SELECT u FROM Userlist u WHERE u.certifications = :certifications")})
public class Userlist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 20)
    @Column(name = "fName")
    private String fName;
    @Size(max = 20)
    @Column(name = "lName")
    private String lName;
    @Size(max = 40)
    @Column(name = "occupation")
    private String occupation;
    @Size(max = 40)
    @Column(name = "jobTitle")
    private String jobTitle;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 40)
    @Column(name = "eMail")
    private String eMail;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "username")
    private String username;
    @Size(max = 25)
    @Column(name = "password")
    private String password;
    @Size(max = 140)
    @Column(name = "skills")
    private String skills;
    @Size(max = 140)
    @Column(name = "hobbies")
    private String hobbies;
    @Size(max = 40)
    @Column(name = "currentLocation")
    private String currentLocation;
    @Size(max = 40)
    @Column(name = "education")
    private String education;
    @Size(max = 140)
    @Column(name = "certifications")
    private String certifications;

    public Userlist() {
    }

    public Userlist(String username) {
        this.username = username;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userlist)) {
            return false;
        }
        Userlist other = (Userlist) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Userlist[ username=" + username + " ]";
    }
    
}
