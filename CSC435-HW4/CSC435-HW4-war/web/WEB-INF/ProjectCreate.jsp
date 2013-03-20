<%-- 
    Document   : ProjectCreate
    Created on : Mar 6, 2013, 6:10:32 PM
    Author     : ethan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project Create</title>
    </head>
    <body>
        <h1 style="text-align:center"><font size="5" color="green">Create Your Project!</font></h1>
        <form method="POST" action="ProjServ">Project Title: <input type="text" name="title"/><br>
                                Due Date:  <input type="date" name="due"/><br>
                                Description:<br> 
                                <textarea rows="5" cols="50" name="desc"> </textarea><br>
                                <input type="submit" value="save"/> </form>
    </body>
</html>
