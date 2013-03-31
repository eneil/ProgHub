/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//servlets go in control package
//ProjServ
package Control;

import Model.ProjList;
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
    
    ProjList projects = new ProjList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        PrintWriter out = response.getWriter();        
        try {
//            
            if (request.getParameter("title") != null && request.getParameter("due") != null && request.getParameter("desc") != null
                    && request.getParameter("lang") != null && request.getParameter("comp") != null && request.getParameter("group") != null && request.getParameter("contact") != null) {
                
                projects.addProject(request.getParameter("title"), request.getParameter("due"), request.getParameter("desc"), request.getParameter("lang"),
                        request.getParameter("group"), request.getParameter("comp"), request.getParameter("contact"));
//             
            }
            request.setAttribute("projList", projects.getProjects());
            RequestDispatcher dispatcher = request.getRequestDispatcher("ProjTable");
            dispatcher.forward(request, response);
        } finally {
            out.close();
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
