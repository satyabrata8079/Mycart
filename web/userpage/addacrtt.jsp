<%-- 
    Document   : addacrtt
    Created on : 24 Nov, 2022, 8:45:46 PM
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
            String product=request.getParameter("pname");
        String price=request.getParameter("price");
        String name=(String) session.getAttribute("username");
        String email=(String) session.getAttribute("email");
        String photo=request.getParameter("photo");;
        int sts=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("insert into cart(username,productname,productphoto,price,uemail)values(?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, product);
            pst.setString(3, photo);
            pst.setString(4, price);
            pst.setString(5, email);
            
             sts = pst.executeUpdate();
             if(sts>0){
                 session.setAttribute("email", email);
                 response.sendRedirect("cart.jsp");
             }
        }
        catch(Exception e){
            
        }
        
            %>
            
    </body>
</html>
