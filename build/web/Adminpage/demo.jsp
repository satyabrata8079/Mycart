<%-- 
    Document   : demo.jsp
    Created on : 6 Nov, 2022, 10:31:08 PM
    Author     : satyabrata jena
--%>

<%@page import="java.util.*"%>
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
    
        
         
        
        <% 
        try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("select productphoto from product");
            
            ResultSet rs = pst.executeQuery();
          
            while(rs.next()){
                %>
                 <div class="account2">
                    <div class="image img-cir img-120">
                        <img src="images2/IMG-20200120-WA0002.jsp" alt="John Doe" />
                    </div>
                    <h4 class="name">sneha mohanty</h4>
                    <a href="#">Sign out</a>
                </div>
        
                 <%
            }
        }
        catch(Exception e){
           
        }
        %>
    
</html>
