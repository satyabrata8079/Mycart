package org.apache.jsp.userpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- CSS only -->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <div class=\"modal-dialog modal-lg\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <form>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"cat\" placeholder=\"enter the category title\" required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"address\" placeholder=\"enter  your address\" required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <input type=\"number\" class=\"form-control\" name=\"pin\" placeholder=\"enter your pin code\" required=\"\"/>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <input type=\"number\" class=\"form-control\" name=\"phn\" placeholder=\"enter the phone no\" required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <span>Please select payment mode</span>\n");
      out.write("                <select name=\"cat\" id=\"\" class=\"form-control\">\n");
      out.write("                    <option value=\"cod\">cod</option>\n");
      out.write("                    <option value=\"other\">other</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <button class=\"btn btn-outline-success\">\n");
      out.write("                   Conform Order\n");
      out.write("                </button>\n");
      out.write("                <button class=\"btn btn-outline-success\">\n");
      out.write("                   Cancle Order\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("           </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  \n");
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