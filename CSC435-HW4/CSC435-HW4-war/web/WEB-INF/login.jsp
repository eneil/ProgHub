<%-- 
    Document   : login
    Created on : Mar 5, 2013, 10:52:00 PM
    Author     : Ben Gordon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <link href="css/global.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page for Programmers' Social Network</title>
    </head>
    <body>
        <div id="wrapper">
    
            <div id="header">
                <h1>
                     <a href="Home">Programmer Meet Up</a>
                </h1>
                <div id ="userSignLog">
                    <a href="Home">Login</a>
                    |
                    <a href="SignUp">Sign Up</a>
                    
                            
                </div>
                
            </div>
            <div id="content">
                <h2><img src="images/home_32.gif"> Home Page for Programmers' Social Network</h2>
                <hr><img src="images/home.gif"><a href=Home>Home</a>  |  <img src="images/check.gif">
                <a href=SignUp>Sign Up</a>  |  <img src="images/users.gif"><a href=ListMembers>All Members</a><hr><br>
                <div><fieldset>
                    <legend><img src="images/locked.gif"> Login</legend>
                    <% if (request.getAttribute("msg") != null) out.print("<font color=red><b>" + (String)request.getAttribute("msg") + "</b></font><br>"); %>
                    <form method=POST>
                        <table>
                            <tr><td>Username:</td><td><input type=text name=username></td></tr>
                            <tr><td>Password:</td><td><input type=password name=password></td></tr>
                            <tr><td></td><td><input type=submit value=Login></td></tr>
                        </table>
                    </form>
                </fieldset></div>
                <br>
                If you don't have an account <a href=SignUp>sign up</a> for one!
            </div>
        </div>

    </body>
</html>
