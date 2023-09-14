package org.apache.jsp.Adminpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class viewOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("        /* Center the table */\n");
      out.write("        body {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /* Style for the close button */\n");
      out.write("        .close-button {\n");
      out.write("            display: block;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

try {
    // Establish a database connection
    Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");

    String orderId = request.getParameter("oid"); 
    String query = "SELECT * FROM order_details WHERE oid = ?";
    PreparedStatement pstmt = conn.prepareStatement(query);
    pstmt.setString(1, orderId);
    
    // Execute the query
    ResultSet rs = pstmt.executeQuery();


    // Loop through the result set and append product details to modalContent
    while (rs.next()) {
       

      out.write("\n");
      out.write(" <div id=\"table-container\" style=\"display: none;\">\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Order ID</th>\n");
      out.write("                    <th>Product Name</th>\n");
      out.write("                    <th>Product Price</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <!-- Insert order details here using server-side code -->\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( rs.getString("oid") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString("productname") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString("price") );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <!-- Add more rows as needed -->\n");
      out.write("            </tbody>\n");
      out.write("            ");

        
    }
    conn.close();
} catch (Exception e) {
    out.print(e);
}

      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <!-- Close button to hide the table -->\n");
      out.write("        <button onclick=\"closeTable()\" class=\"close-button\">Back to home</button>\n");
      out.write("    </div>\n");
      out.write("        \n");
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
