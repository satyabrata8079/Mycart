<%-- 
    Document   : resistration
    Created on : 27 Oct, 2022, 8:20:52 PM
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
        String username=request.getParameter("username");
        String email=request.getParameter("email");
        String password=request.getParameter("pass");
        int sts=0;
         if(username.isEmpty()&&password.isEmpty())
            out.println("id and password shouldnot be empty");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("insert into user(email_id,password,username)values(?,?,?)");
            pst.setString(1, email);
            pst.setString(2, password);
            pst.setString(3, username);
           
             sts = pst.executeUpdate();
             response.sendRedirect("login2.jsp");
             
//            if (sts.next()) {
//                out.println("login successful...");
////                response.sendRedirect("homepage.html");
//            } 
//            else {
//                out.println("Incorrect login credentials");
//            }
        } 
        catch (Exception e) {
//            throws new ServletException("something went wrong",e);
        out.println("Something went wrong !! Please try again"+e);
        }
        
        %>
        
    </body>
</html>
