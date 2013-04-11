<%-- 
    Document   : compose_message
    Created on : Mar 20, 2013, 1:01:24 PM
    Author     : shawnkrecker
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Messages</title>
        <link rel="stylesheet" type="text/css" href="css/global.css">
        <link rel="stylesheet" type="text/css" href="css/profile.css">
        <link rel="stylesheet" type="text/css" href="css/messages.css">

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
                <h2>Messages</h2>
                <div id ="message_area">
                    <form action="SendMessage" method="post">
                        To:<input id="message_recipient" type="text" name="recipient"><br>
                        Title:
                        <input id="message_compose_title" type="text" name="title"  ><br>
                        Message:<br>
                        <input id ="message_compose_content" type="text" name="content" ><br>
                        <input type="submit" value="Send">
                    </form>
                    
                </div>    
               

            </div>
               
              
              
            </div>
            
        </div>
    </body>
</html>
