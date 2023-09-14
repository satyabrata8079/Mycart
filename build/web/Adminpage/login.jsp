<%-- 
    Document   : login
    Created on : 26 Nov, 2022, 9:32:33 AM
    Author     : satyabrata jena
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             
//         PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if(email.isEmpty()&&password.isEmpty())
            out.println("id and password shouldnot be empty");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("select adminid,password from admin where adminid=? and password=?");
            pst.setString(1, email);
            pst.setString(2, password);
           
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                
                response.sendRedirect("index2demo.jsp");
            } 
            else {
                out.println("Incorrect login credentials");
            }
        } 
        catch (Exception e) {
//            throws new ServletException("something went wrong",e);
        out.println("Something went wrong !! Please try again"+e);
        }
    
            %>
    </body>
</html>
