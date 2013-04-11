<%-- 
    Document   : editprofile
    Created on : Mar 20, 2013, 12:57:23 AM
    Author     : shawnkrecker
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
         <link rel="stylesheet" type="text/css" href="css/global.css">
    </head>
   <body>
        <div id="wrapper">
            
            <% Model.User user = Control.Home.currentUser;
             
                %>
            <div id="header">
                <h1>
                     <a href="Home">Programmer Meet Up</a>
                </h1>
                <div id ="userSignLog">
                    <a href="Profile"><%= user.getUsername() %></a> |
                    
                    <a href="SignOut">Sign Out</a>        
                </div>
                  <div id="navbar">
                        <ul>
                            <li><a href="Home">Home</a></li>
                            <li><a href="Profile">Profile</a></li>
                            <li><a href="ListMembers">Members</a></li>
                            <li><a href="ProjectServlet">Projects</a></li>
                            <li><a href="Messages">Messages <%= user.getMessageList().unreadCount()%></a></li>
                        </ul>
                    </div>
                
            </div>
            <div id="content">
               <h2 id="user_name"><%= user.getUsername() %></h2>
               
                <img id="profile_image" src="images/userunknown.jpeg">
                
                <div id="userinfo">
                    <form action="SetProfile" method="post">
                        
                        UserName<input type="text" name ="username" value="<%= user.getUsername() %>"><br>                      
                        First Name<input type="text" name ="firstname" value="<%= user.getFirstName() %>"><br>                      
                        Last Name<input type="text" name ="lastname" value="<%= user.getLastName() %>"><br>                     
                        Occupation<input type="text" name ="occupation" value="<%= user.getOccupation() %>"><br>                       
                        Job Title<input type="text" name ="jobtitle" value="<%= user.getJobTitle() %>"><br>                    
                        Email<input type="text" name ="email" value="<%= user.getEmail() %>"><br>                     
                        Skills<input type="text" name ="skills" value="<%= user.getSkills() %>"><br>
                        Hobbies<input type="text" name ="hobbies" value="<%= user.getHobbies() %>"><br>
                        <input id="submitbutton" type="submit" value="Submit">
                 <!--       <input id="cancel" type="submit" value="Cancel"> -->
                        
                    </form>
                    
                    
                </div>
               
              
              
            </div>
            
        </div>
    </body>
</html>

