<%-- 
    Document   : ProjectCreate
    Created on : Mar 6, 2013, 6:10:32 PM
    Author     : ethan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/global.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project Create</title>
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
                            <li><a href="ProjectServlet">Projects</a></li>
                            <li><a href="Messages">Messages</a></li>
                        </ul>
                    </div>
            </div>
            <div id="content">
                <h2><img src="images/users_32.gif"> Listing of Members</h2>
                <hr><img src="images/home.gif"><a href=Home>Home</a>  |  <img src="images/check.gif">
                <a href=SignUp>Sign Up</a>  |  <img src="images/users.gif"><a href=ListMembers>All Members</a><hr>
                <h3 style="text-align:center"><font size="5" color="blue">Create Your Project!</font></h3>
                <form method="POST" action="ProjServ">Project Title: <input type="text" name="title"/><br>
                                Due Date:  <input type="date" name="due"/><br>
                                Description:<br> 
                                <textarea rows="5" cols="50" name="desc"> </textarea><br>
                                <input type="submit" value="save"/> </form>
           </div>
        </div>
    </body>
</html>
