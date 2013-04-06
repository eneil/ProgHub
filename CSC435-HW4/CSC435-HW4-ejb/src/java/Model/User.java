package Model;

import Model.MessageList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben Gordon
 */
public class User {
    private String fName;
    private String lName;
    private String occupation;
    private String jobTitle;
    private String eMail;
    private String username;
    private String password;
    private String skills;
    private String hobbies;
    private String currentLocation;
    private String education;
    private String certifications;
    
    private MessageList messages = new MessageList();
    
    public void User(){
    
    }
    
    public void setFirstName(String fName){
        this.fName = fName;
    }
    
    public String getFirstName(){
        return fName;
    }
    
    public void setLastName(String lName){
        this.lName = lName;
    }
    
    public String getLastName(){
        return lName;
    }
    
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
    
    public String getOccupation(){
        return occupation;
    }
    
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    
    public String getJobTitle(){
        return jobTitle;
    }
    
    public void setEmail(String email){
        this.eMail = email;
    }
    
    public String getEmail(){
        return eMail;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setSkills(String skills){
        this.skills = skills;
    }
    
    public String getSkills(){
        return skills;
    }
    
    public void setHobbies(String hobbies){
        this.hobbies = hobbies;
    }
    
    public String getHobbies(){
        return hobbies;
    }
    
    public void setCurrentLocation(String location){
        this.currentLocation = location;
    }
    
    public String getCurrentLocation(){
        return currentLocation;
    }
    
    public void setEducation(String education){
        this.education = education;
    }
    
    public String getEducation(){
        return education;
    }
    
    public void setCertifications(String certifications){
        this.certifications = certifications;
    }
    
    public String getCertifications(){
        return certifications;
    }
    
    public MessageList getMessageList(){
        return this.messages;
    }
    
    
    public String getJob(){
        return jobTitle + " at " + occupation;
    }
    
    public String getFullName(){
        return fName + " " + lName;
    }
}
