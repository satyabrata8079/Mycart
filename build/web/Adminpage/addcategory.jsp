<%-- 
    Document   : addcategory.jsp
    Created on : 5 Nov, 2022, 10:52:17 AM
    Author     : satyabrata jena
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        
        String catt=request.getParameter("cat");
        String desc=request.getParameter("desc");
        int sts=0;
         if(catt.isEmpty()&&desc.isEmpty())
            out.println("catt and desc shouldnot be empty");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("insert into category(categoryname,categorydesp)values(?,?)");
            pst.setString(1, catt);
            pst.setString(2, desc);
           
             sts = pst.executeUpdate();
             if(sts > 0){
//                 JOptionPane.showMessageDialog(null, "Your shopping bag is empty");
                 %>
                 <script>
                     alert("sucess");
                     <% response.sendRedirect("index2demo.jsp"); %>
                 </script>
                 <%
                    
             }
            else{
            out.print("error");
            }
             
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
