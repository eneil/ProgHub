/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import ControlEJB.ChangeProfileLocal;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ejb.EJB;

/**
 *
 * @author shawnkrecker
 */
@WebServlet(name = "SetProfile", urlPatterns = {"/SetProfile"})
public class SetProfile extends HttpServlet {

  @EJB
  ChangeProfileLocal changeProfileInterface;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
               User user = Control.Home.currentUser;

                if(user != null){
                   
                    user.setUsername(request.getParameter("username"));
                    HttpSession session = request.getSession();
                    
                    if(session != null){
                        if(session.getAttribute("currentUser") != null){
                            session.setAttribute("currentUser", user.getUsername());
                            changeProfileInterface.setProfile(user, request);
                        }
                    }                   
               
                   
                    RequestDispatcher dispatcher = request.getRequestDispatcher("Profile");
                    dispatcher.forward(request,response);
                }
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
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
