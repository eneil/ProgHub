<%-- 
    Document   : home
    Created on : Mar 5, 2013, 10:52:17 PM
    Author     : Ben Gordon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <link href="style.css" rel="stylesheet"> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page for Programmers' Social Network</title>
    </head>
    <body>
        <h1><img src="images/home_32.gif"> Home Page for Programmers' Social Network</h1>
        <hr><img src="images/home.gif"><a href=Home>Home</a>  |  <img src="images/check.gif">
        <a href=SignUp>Sign Up</a>  |  <img src="images/users.gif"><a href=ListMembers>All Members</a><hr>
        
        <h2>Welcome <i>${user.firstName}</i>!</h2>
        <br>
        This is your online home for collaborating on projects and sending messages.<br><br>
        <table>
            <tr><td><img src="images/user.gif"> <a href="Profile">Profile</a></td>
                <td><img src="images/folder_box.gif"> <a href="Projects">Projects</a></td></tr>
            <tr><td><img src="images/email_open.gif"> <a href="Messages">Messages</a> (0)</td><td> <%-- Will have real message count in HW4 --%>
                    <form method="post"><input type=hidden name=logout>
                        <img src="images/locked.gif"> <input type=submit value='Log Out'>
                    </form>
                </td></tr>
        </table>

    </body>
</html>
