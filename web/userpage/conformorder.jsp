<%-- 
    Document   : conformorder
    Created on : 25 Nov, 2022, 9:36:36 PM
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
        
        String mail=request.getParameter("email");
        String totalamount=request.getParameter("amt");
        String adress=request.getParameter("address");
        String pin=request.getParameter("pin");
        String phno=request.getParameter("phone");
        String payment=request.getParameter("payment");
        int sts=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("insert into order(umail,amount,adress,pincode,contact,paymentmode)values(?,?,?,?,?,?)");
            pst.setString(1, mail);
            pst.setString(2, totalamount);
            pst.setString(3, adress);
            pst.setString(4, pin);
            pst.setString(5, phno);
            pst.setString(6, payment);
            
             sts = pst.executeUpdate();
             if(sts>0){
                  
                 response.sendRedirect("index.jsp");
             }
            else{
                out.print("error");
            }
        }
        catch(Exception e){
            out.print(e);
        }
         %>
    </body>
</html>
