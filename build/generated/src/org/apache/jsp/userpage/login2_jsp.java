package org.apache.jsp.userpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("<?xml version='1.0' encoding='UTF-8' ?>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"\n");
      out.write("      xmlns:h=\"http://xmlns.jcp.org/jsf/html\">\n");
      out.write("    <h:head>\n");
      out.write("        <title>Facelet Title</title>\n");
      out.write("        <script\n");
      out.write("      src=\"https://kit.fontawesome.com/64d58efce2.js\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("    </h:head>\n");
      out.write("    <h:body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("      <div class=\"forms-container\">\n");
      out.write("        <div class=\"signin-signup\">\n");
      out.write("            <form action=\"login.jsp\" class=\"sign-in-form\" method=\"post\">\n");
      out.write("            <h2 class=\"title\">Sign in</h2>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-user\"></i>\n");
      out.write("              <input type=\"text\" placeholder=\"Username\" required=\"\" id=\"user\" name=\"user\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-lock\"></i>\n");
      out.write("              <input type=\"password\" placeholder=\"Password\" required=\"\" id=\"pass\" name=\"pass\"/>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Login\" class=\"btn solid\" />\n");
      out.write("            <p class=\"social-text\">Or Sign in with social platforms</p>\n");
      out.write("            <div class=\"social-media\">\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-twitter\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-google\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("            <form action=\"resistration.jsp\" class=\"sign-up-form\" method=\"post\">\n");
      out.write("            <h2 class=\"title\">Sign up</h2>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-user\"></i>\n");
      out.write("              <input type=\"text\" placeholder=\"Username\" required=\"please enter your number\" name=\"username\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-envelope\"></i>\n");
      out.write("              <input type=\"email\" placeholder=\"Email\" required=\"\" name=\"email\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-lock\"></i>\n");
      out.write("              <input type=\"password\" placeholder=\"Password\" required=\"\" name=\"pass\" />\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" class=\"btn\" value=\"Sign up\" />\n");
      out.write("            <p class=\"social-text\">Or Sign up with social platforms</p>\n");
      out.write("            <div class=\"social-media\">\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-twitter\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-google\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"panels-container\">\n");
      out.write("        <div class=\"panel left-panel\">\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>New here ?</h3>\n");
      out.write("            <p>\n");
      out.write("              Lorem ipsum, dolor sit amet consectetur adipisicing elit. Debitis,\n");
      out.write("              ex ratione. Aliquid!\n");
      out.write("            </p>\n");
      out.write("            <button class=\"btn transparent\" id=\"sign-up-btn\">\n");
      out.write("              Sign up\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <img src=\"img/log.svg\" class=\"image\" alt=\"\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel right-panel\">\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>One of us ?</h3>\n");
      out.write("            <p>\n");
      out.write("              Lorem ipsum dolor sit amet consectetur adipisicing elit. Nostrum\n");
      out.write("              laboriosam ad deleniti.\n");
      out.write("            </p>\n");
      out.write("            <button class=\"btn transparent\" id=\"sign-in-btn\">\n");
      out.write("              Sign in\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <img src=\"img/register.svg\" class=\"image\" alt=\"\" />\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"app.js\"></script>\n");
      out.write("    </h:body>\n");
      out.write("</html>\n");
      out.write("\n");
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
