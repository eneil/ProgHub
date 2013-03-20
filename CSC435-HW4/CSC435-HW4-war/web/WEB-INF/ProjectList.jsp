<%-- 
    Document   : ProjectList
    Created on : Mar 7, 2013, 6:34:14 PM
    Author     : ethan
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Project"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     ArrayList<Project> projList  = null;
     
    if(request.getAttribute("projList") != null) {
         projList = (ArrayList<Project>)request.getAttribute("projList");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project List</title>
    </head>
    <body>
        <h1 style="text-align: center"><font color="green" size="4">Project Center</font></h1>
        <%
        if (projList != null && !projList.isEmpty()) {
        %>
        <table align="center" border="1" width="80%"> 
            <tr>
                <!--<td>Test Size:</td>-->
                <td>Title:</td>
                <td>Due Date:</td>
                <td>Description:</td>
            </tr>
            <%
            for (Project p:projList) {
                 
            
            %>
            <tr>   
                <!--<td><%=projList.size()%></td>-->
                <td><%=p.title %></td>
                <td><%=p.dueDate%></td>
                <td><%=p.description%></td>
            </tr>
        
        <% } 
            } %>
        </table>
        <a href="ProjectCreate.jsp">Create Project</a>
    </body>
</html>
