<%-- 
    Document   : messages
    Created on : Mar 20, 2013, 11:37:54 AM
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
                <h2 id="message_header">Messages</h2>
                <form id="create_message_submit"action="ComposeMessage" method="post"><input type="submit" value="Create Message"></form>
                <div id ="message_area">
                    ${messages}
                    
                </div>    
               

            </div>
               
              
              
            </div>
            
        </div>
    </body>
</html>
