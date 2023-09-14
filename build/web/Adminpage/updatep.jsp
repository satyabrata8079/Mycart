<%-- 
    Document   : updatep
    Created on : 26 Nov, 2022, 8:19:53 AM
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
            
         String id=request.getParameter("id");
         String name=request.getParameter("pname");
         String desc=request.getParameter("pdesc");
         String price=request.getParameter("pprice");
         String discount=request.getParameter("pdiscount");
         int sts=0;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("update products set productname=?,productdesc=?,productcolprice=?,productdiscount=? where pid=?");
            pst.setString(1, name);
            pst.setString(2, desc);
            pst.setString(3, price);
            pst.setString(4, discount);
            pst.setString(5, id);
            sts=pst.executeUpdate();
            if(sts>0){
                response.sendRedirect("index2demo.jsp");
            }
            
         }
         catch(Exception e){
             
         }
            %>
    </body>
</html>
