<%-- 
    Document   : myprofile
    Created on : Mar 19, 2013, 6:09:10 PM
    Author     : shawnkrecker
--%>

<%@page import="Control.Profile"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link rel="stylesheet" type="text/css" href="css/global.css">
        <link rel="stylesheet" type="text/css" href="css/profile.css">


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
                    <a href="Profile"><%= user.getUsername() %></a>
                    |
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
               
                <img id="userimage" src="images/userunknown.jpeg">

                <div id="userinfo">
                    <h2 id="user_name"><%= user.getUsername() %>   
                    </h2>
                    <div id="editbuttonlink"><a href="EditProfile">Edit Profile</a></div>
                    <ul>
                        <li class ="userinfo_title">First Name:</li>
                        <li class="userinfo_content"><%= user.getFirstName() %></li>
                        <li class ="userinfo_title">Last Name:</li>
                        <li class="userinfo_content"><%= user.getLastName() %></li>
                        <li class ="userinfo_title">Occupation</li>
                        <li class="userinfo_content"><%= user.getOccupation() %></li>
                        <li class ="userinfo_title">Job Title</li>
                        <li class ="userinfo_content"><%= user.getJobTitle() %></li>
                        <li class ="userinfo_title">E-Mail</li>
                        <li class ="userinfo_content"><%= user.getEmail() %></li>
                        <li class ="userinfo_title">Skills</li>
                        <li class ="userinfo_content"><%= user.getSkills() %></li>
                        <li class ="userinfo_title">Hobbies</li>
                        <li class ="userinfo_content"><%= user.getHobbies() %></li>
                    </ul>

                </div>
               
              
              
            </div>
            
        </div>
    </body>
</html>

