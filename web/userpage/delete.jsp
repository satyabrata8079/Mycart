<%-- 
    Document   : delete
    Created on : 25 Nov, 2022, 1:41:25 AM
    Author     : satyabrata jena
--%>

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
            int sts=0;
            String id=request.getParameter("d");
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("delete from cart where catid=?");
            pst.setString(1, id);
            sts = pst.executeUpdate();
            if(sts>0){
                response.sendRedirect("cart.jsp");
            }
            }
        catch(Exception e){
            
        }
            %>
    </body>
</html>
