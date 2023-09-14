package org.apache.jsp.images2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class image_0020demo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Display Image</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1 style=\"color:red\" align=\"center\">DISPLAY IMAGE DETAIL</h1>\n");
      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write("\n");
      out.write("<form action=\"DisplayImage\" method=\"post\">\n");
      out.write("   Enter Image Id :\n");
      out.write("   <input type=\"number\" name=\"imageId\">\n");
      out.write("   <input type=\"submit\" value=\"Display Image\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");

    String productphoto=(String)request.getAttribute("productphoto");
    String pid=(String)request.getAttribute("pid");
    

      out.write("\n");
      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write("     <table border=\"5px\" style=\"width:600px\">\n");
      out.write("          <tr>\n");
      out.write("              <th>Image Id </th>\n");
      out.write("              <th>Image</th>\n");
      out.write("          </tr>\n");
      out.write("         \n");
      out.write("         ");

             if(productphoto!="" && pid!="")
             {
         
      out.write("\n");
      out.write("          \n");
      out.write("          <tr>\n");
      out.write("              <td>");
      out.print(pid );
      out.write("</td>\n");
      out.write("              <td><img src=\"images2/");
      out.print(productphoto);
      out.write("\" style=\"width:300px;height:250px\"></td>\n");
      out.write("          </tr>\n");
      out.write("        ");

             }
        
      out.write("  \n");
      out.write("     </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
