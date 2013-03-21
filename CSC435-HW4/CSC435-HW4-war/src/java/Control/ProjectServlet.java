/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//servlets go in control package
//ProjServ
package Control;

import Model.Project;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;


/**
 *
 * @author ethan
 */
public class ProjectServlet extends HttpServlet {
    Project proj = new Project();
    ArrayList<Project> projList = new ArrayList<Project>();
    String path = "ProjectList.jsp";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
         proj.setTitle(request.getParameter("title"));
        proj.setDate(request.getParameter("due"));
        proj.setDesc(request.getParameter("desc")); 
        if (proj.getTitle() != null && proj.getDate() != null && proj.getTitle() != null) {
                    projList.add(proj);

        }
        if (request.getParameter("debug") != null) {
            //for loop here
            //out.print
        } else {
        request.setAttribute("projList", projList);
        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
   
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
   
}
