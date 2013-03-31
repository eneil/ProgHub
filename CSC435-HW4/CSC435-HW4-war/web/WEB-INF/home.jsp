<%-- 
    Document   : home
    Created on : Mar 5, 2013, 10:52:17 PM
    Author     : Ben Gordon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <link href="css/global.css" rel="stylesheet"> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page for Programmer Meet Up</title>
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
                    <a href="Profile">${currentUser}</a>
                    |
                    <a href="SignOut">Sign Out</a>        
                </div>
                    
                    <div id="navbar">
                        <ul>
                            <li><a href="Home">Home</a></li>
                            <li><a href="Profile">Profile</a></li>
                            <li><a href="ListMembers">Members</a></li>
                            <li><a href="ProjCreate">Projects</a></li>
                            <li><a href="Messages">Messages <%= user.getMessageList().unreadCount()%> </a></li>
                        </ul>
                    </div>
                
            </div>
            <div id="content">
        <h2><img src="images/home_32.gif"> Home Page for Programmer Meet Up</h2>
        <hr><%--<img src="images/home.gif"><a href=Home>Home</a>  |  <img src="images/check.gif">
        <a href=SignUp>Sign Up</a>  |  <img src="images/users.gif"><a href=ListMembers>All Members</a><hr>--%>
        
        <h2>Welcome <i>${currentUser}</i>!</h2>
        <br>

        <table><tr><td width="200">
        <table>
            <tr><td><img src="images/user.gif"> <a href="Profile">Profile</a></td>
                <td><img src="images/folder_box.gif"> <a href="ProjCreate">Projects</a></td></tr>
            <tr><td><img src="images/email_open.gif"> <a href="Messages">Messages</a> <%= user.getMessageList().unreadCount()%></td><td>
                    <img src="images/locked.gif"> <a href="SignOut">Log Out</a>
                </td></tr>
        </table>
                </td>
                <td valign="top">
                    
                    This is your online home for collaborating on projects and sending messages.  First, make sure your profile is up to date, then create projects and check out our list of members.
                    
                </td></tr></table>
            </div>
        </div>
    </body>
</html>
