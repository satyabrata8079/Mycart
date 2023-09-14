<%-- 
    Document   : confirmOrder
    Created on : 25 Aug, 2023, 12:55:34 PM
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
            String id=request.getParameter("oid");
            String newStatus = "Confirmed"; 
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            String updateQuery = "UPDATE `order` SET satatus = ? WHERE oid = ?";
            PreparedStatement pst = conn.prepareStatement(updateQuery);
            pst.setString(1, newStatus);
            pst.setString(2, id);
            sts = pst.executeUpdate();
            if(sts>0){
                response.sendRedirect("ShoworderDetails.jsp");
            }
            }
        catch(Exception e){
            
        }   

        %>
    </body>
</html>
