/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//servlets go in control package
//ProjServ
package Control;

import ControlEJB.AddProjectLocal;
import ControlEJB.ProjectBeanLocal;
import Model.Project;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ethan
 */
public class ProjectServlet extends HttpServlet {
    
    @EJB
    AddProjectLocal projCreator;
    ProjectBeanLocal projBean;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        PrintWriter out = response.getWriter();        
        try {
//            
            if (request.getParameter("title") != null && request.getParameter("due") != null && request.getParameter("desc") != null
                    && request.getParameter("lang") != null && request.getParameter("comp") != null && request.getParameter("group") != null && request.getParameter("contact") != null) {
                  Project p = new Project(); 
                  p.setTitle(request.getParameter("title"));
                  p.setDue(request.getParameter("due"));
                  p.setDescription(request.getParameter("desc"));
                  p.setLang(request.getParameter("lang"));
                  p.setCompensation(request.getParameter("comp"));
                  p.setContributors(request.getParameter("group"));
                  p.setContact(request.getParameter("contact"));
                  projCreator.addProject(p);
                  List<Project> projList = projBean.listProject();
                  request.setAttribute("projList", projList);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ProjectList.jsp");
                dispatcher.forward(request, response);
//             
            }
            
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
