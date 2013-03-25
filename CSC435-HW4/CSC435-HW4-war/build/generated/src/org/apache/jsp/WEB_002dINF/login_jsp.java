package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/global.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page for Programmers' Social Network</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("    \n");
      out.write("            <div id=\"header\">\n");
      out.write("                <h1>\n");
      out.write("                     <a href=\"Home\">Programmer Meet Up</a>\n");
      out.write("                </h1>\n");
      out.write("                <div id =\"userSignLog\">\n");
      out.write("                    <a href=\"Home\">Login</a>\n");
      out.write("                    |\n");
      out.write("                    <a href=\"SignUp\">Sign Up</a>\n");
      out.write("                    \n");
      out.write("                            \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <h2><img src=\"images/home_32.gif\"> Home Page for Programmers' Social Network</h2>\n");
      out.write("                <hr><img src=\"images/home.gif\"><a href=Home>Home</a>  |  <img src=\"images/check.gif\">\n");
      out.write("                <a href=SignUp>Sign Up</a><hr><br>\n");
      out.write("                <div><fieldset>\n");
      out.write("                    <legend><img src=\"images/locked.gif\"> Login</legend>\n");
      out.write("                    ");
 if (request.getAttribute("msg") != null) out.print("<font color=red><b>" + (String)request.getAttribute("msg") + "</b></font><br>"); 
      out.write("\n");
      out.write("                    <form method=POST>\n");
      out.write("                        <table>\n");
      out.write("                            <tr><td>Username:</td><td><input type=text name=username></td></tr>\n");
      out.write("                            <tr><td>Password:</td><td><input type=password name=password></td></tr>\n");
      out.write("                            <tr><td></td><td><input type=submit value=Login></td></tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </fieldset></div>\n");
      out.write("                <br>\n");
      out.write("                If you don't have an account <a href=SignUp>sign up</a> for one!\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
