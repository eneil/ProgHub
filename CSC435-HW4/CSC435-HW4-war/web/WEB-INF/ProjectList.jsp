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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project List</title>
    </head>
    <body>
        <h1 style="text-align: center"><font color="green" size="4">Project Center</font></h1>
        <table>
            <tr><td><b>Title</b></td><td><b>Description</b></td><td><b>Due Date</b></td></tr>
            <%= request.getAttribute("projTable") %>
        </table>
                    
        <a href="ProjectCreate.jsp">Create Project</a>
    </body>
</html>
