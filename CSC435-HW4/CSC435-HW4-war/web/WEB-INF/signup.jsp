<%-- 
    Document   : signup
    Created on : Mar 10, 2013, 8:14:42 PM
    Author     : Ben Gordon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/global.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up for Programmers' Social Network</title>
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
                <h2><img src="images/check_32.gif"> Sign Up for Programmers' Social Network</h2>
                        <hr><img src="images/home.gif"><a href=Home>Home</a>  |  <img src="images/check.gif">
                        <a href=SignUp>Sign Up</a><hr>
                        <% if (request.getAttribute("msg") != null) out.print("<font color=red><b>" + (String)request.getAttribute("msg") + "</b></font><br>"); %>

                        <br>
                        <div><fieldset>
                    <legend><img src="images/user.gif"> Create Your Programmer's Account</legend>
                        <form method='POST'>
                        <table>
                            <tr><td>First Name:</td><td><input type=text name=fname></tr>
                            <tr><td>Last Name:</td><td><input type=text name=lname></tr>
                            <tr><td>Job Title:</td><td><input type=text name=jobtitle></tr>
                            <tr><td>Current Company:</td><td><input type=text name=occupation></tr>
                            <tr><td>E-Mail Address:</td><td><input type=text name=email></tr>
                            <tr><td>Desired Username:</td><td><input type=text name=username></tr>
                            <tr><td>Desired Password:</td><td><input type=password name=password></tr>
                            <tr><td></td><td><input type=submit value='Sign Up'></td></tr>
                        </table>
                        </form>
                            </fieldset></div>
                        <br>Facebook Connect coming soon!
            </div>
        </div>
    </body>
</html>
