<%-- 
    Document   : listMembers
    Created on : Mar 10, 2013, 11:12:40 PM
    Author     : Ben Gordon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="style.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listing of Members</title>
    </head>
    <body>
        <h1><img src="images/users_32.gif"> Listing of Members</h1>
                <hr><img src="images/home.gif"><a href=Home>Home</a>  |  <img src="images/check.gif">
                <a href=SignUp>Sign Up</a>  |  <img src="images/users.gif"><a href=ListMembers>All Members</a><hr>
                <h2>A full list of our users:</h2>
                <br>
                
                <table>
                <tr><td></td><td width="120"><b>Full Name</b>     </td><td><b>Occupation</b></td></tr>
                
                <%= request.getAttribute("userTable") %>

                </table>
                <br><br>If you don't have an account <a href=SignUp>sign up</a> for one!
    </body>
</html>
