<%-- 
    Document   : ProjectList
    Created on : Mar 7, 2013, 6:34:14 PM
    Author     : ethan
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Project"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link href="css/global.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project List</title>
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h1>
                    <a href="Home">Programmer Meet Up</a>
                </h1>
                <div id="userSignLog">
                    <a href="Profile">${currentUser}</a>
                    <a href="SignOut">Sign Out</a>
                </div>
                    <div id="navbar">
                         <ul>
                            <li><a href="Home">Home</a></li>
                            <li><a href="Profile">Profile</a></li>
                            <li><a href="ListMembers">Members</a></li>
                            <li><a href="Messages">Messages</a></li>
                        </ul>
                    </div>
            </div>
            <div id="content">
                <h2><img src="images/users_32.gif"> Listing of Members</h2>
                <hr><img src="images/home.gif"><a href=Home>Home</a>  |  <img src="images/check.gif">
                <a href=SignUp>Sign Up</a>  |  <img src="images/users.gif"><a href=ListMembers>All Members</a><hr>
                <h3><font color="blue">Project List</font></h3>
                <div id="project_list">
                 <table>
                    <tr><td><b>Title</b></td><td><b>Description</b></td><td><b>Due Date</b></td></tr>
                    <%= request.getAttribute("projTable") %>
                 </table>
                    <a href="ProjCreate">Create Project</a>
                </div>
            </div>
        </div>
   </body>
</html>
