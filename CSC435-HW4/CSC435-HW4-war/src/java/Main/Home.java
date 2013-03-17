package Main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Ben Gordon
 */
public class Home extends HttpServlet {

    boolean loggedIn = false;
    public static ArrayList<User> users = new ArrayList<User>();
    public String userId;
    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            loggedIn = false;
            
            HttpSession session = request.getSession();
            synchronized(session){
                
                
                if (request.getParameter("username") != null) {
                    boolean found = false;
                    for (int curUser = 0; (curUser < users.size()); curUser++){
                        if (users.get(curUser).username.equals(request.getParameter("username"))){
                            if (users.get(curUser).password.equals(request.getParameter("password"))){
                                loggedIn = true;
                                session.setAttribute("userId", String.valueOf(curUser));
                                //out.println("login via form<br>");
                                found = true;
                            }
                        }
                    }
                    if (found == false) {
                        request.setAttribute("msg", "Invalid Username and Password Combination<br>");
                    }
                }
                if (request.getParameter("logout") != null) {
                    session.setAttribute("userId", null);
                    request.setAttribute("msg", "User Logged Out<br>");
                }
                
                userId = (String)(session.getAttribute("userId"));
                
                if (userId != null) {
                    loggedIn = true;
                    //out.println("logged in via cookie<br>");
                }

            }
            String address;
            if (loggedIn == true) {
                
                //SHOW LOGGED IN PAGE
                
                request.setAttribute("user", users.get(Integer.parseInt(userId)));
                address = "/WEB-INF/home.jsp";
                
            } else {
                
                //SHOW LOGIN PAGE
                address = "/WEB-INF/login.jsp";
                
            }
            
            RequestDispatcher dispatcher = request.getRequestDispatcher(address);
                dispatcher.forward(request, response);

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
        return "Home Page";
    }// </editor-fold>
}
