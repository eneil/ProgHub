package Control;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import ControlEJB.LoginUserLocal;
import Model.AllUsers;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
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
    //public static ArrayList<User> users = new ArrayList<User>();
    public String userId;
    
    public static AllUsers currentUsers = new AllUsers();
    public static User currentUser;
    
    @EJB
    LoginUserLocal loginInterface;
    
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
            

            HttpSession session1 = request.getSession();
            if(session1.getAttribute("currentUser")!= null){
                
                RequestDispatcher dispatcher1 = request.getRequestDispatcher("/WEB-INF/home.jsp");
                dispatcher1.forward(request, response);
            }
            
            loggedIn = false;
            String address1 = "/WEB-INF/login.jsp";

            synchronized(session1){
                
               String userName = (String)request.getParameter("username");
               String password = (String)request.getParameter("password");
                
               if (userName != null) {
                   
                   

                    User tempUser = loginInterface.loginAttempt(userName, password);
                    if(tempUser == null){
                         
                        request.setAttribute("msg", "Invalid Username and Password Combination<br>");
                        loggedIn = false;                
                        address1 = "/WEB-INF/login.jsp"; 
                    } else {
                        loggedIn = true;
                        session1.setAttribute("currentUser", (String)request.getParameter("username"));    
                        currentUser = tempUser;
                        address1 = "/WEB-INF/home.jsp";
                    }
                   
                    
//                    if(tempUser != null){
//                        if(tempUser.getPassword().equals((String)request.getParameter("password"))){
//                            loggedIn = true;
//                            session1.setAttribute("currentUser", (String)request.getParameter("username"));
//                            
//                            
//                            currentUser = currentUsers.getUser((String)session.getAttribute("currentUser"));
//                            address1 = "/WEB-INF/home.jsp";
//                        }else{
//                            request.setAttribute("msg", "Invalid Username and Password Combination<br>");
//                        }
//                    } else{
//                        request.setAttribute("msg", "Invalid Username and Password Combination<br>");
//                        loggedIn = false;                
//                        address1 = "/WEB-INF/login.jsp"; 
//                    }

                }
           
            
                
//               if (request.getParameter("logout") != null) {
//                    session1.setAttribute("userId", null);
//                    request.setAttribute("msg", "User Logged Out<br>");
//                }

            

            RequestDispatcher dispatcher1 = request.getRequestDispatcher(address1);
            dispatcher1.forward(request, response);
            
            
       //Code done by ben     
//            loggedIn = false;
//
//            HttpSession session = request.getSession();
//            synchronized(session){
//                
//                
//                if (request.getParameter("username") != null) {
//                    boolean found = false;
//                    for (int curUser = 0; (curUser < users.size()); curUser++){
//                        if (users.get(curUser).getUsername().equals(request.getParameter("username"))){
//                            if (users.get(curUser).getPassword().equals(request.getParameter("password"))){
//                                loggedIn = true;
//                                session.setAttribute("userId", String.valueOf(curUser));
//                                
//                                //Shawn Krecker added User to a currentUser attribute to the session for profile purposes
//                                session.setAttribute("currentUser", (String)request.getParameter("username"));
//                                
//                                
//                                
//                                //out.println("login via form<br>");
//                                found = true;
//                            }
//                        }
//                    }
//                    if (found == false) {
//                        request.setAttribute("msg", "Invalid Username and Password Combination<br>");
//                    }
//                }
//                if (request.getParameter("logout") != null) {
//                    session.setAttribute("userId", null);
//                    request.setAttribute("msg", "User Logged Out<br>");
//                }
//                
//                userId = (String)(session.getAttribute("userId"));
//                
//                if (userId != null) {
//                    loggedIn = true;
//                    //out.println("logged in via cookie<br>");
//                }
//
//            }
//            String address;
//            if (loggedIn == true) {
//                
//                //SHOW LOGGED IN PAGE
//                
//                request.setAttribute("user", users.get(Integer.parseInt(userId)));
//                address = "/WEB-INF/home.jsp";
//                
//            } else {
//                
//                //SHOW LOGIN PAGE
//                address = "/WEB-INF/login.jsp";
//                
//            }
//            
//            RequestDispatcher dispatcher = request.getRequestDispatcher(address);
//                dispatcher.forward(request, response);
//        }
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
        return "Home Page";
    }// </editor-fold>
}
