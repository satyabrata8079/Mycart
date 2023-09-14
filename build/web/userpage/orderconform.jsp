<%-- 
    Document   : orderconform
    Created on : 26 Nov, 2022, 12:04:07 AM
    Author     : satyabrata jena
--%>

<%@page import="java.sql.Statement"%>
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
         
        
        String email=(String) session.getAttribute("email");
        String totalamount=request.getParameter("tamount");
        String adress=request.getParameter("address");
        String pin=request.getParameter("zip");
        String phno=request.getParameter("phone");
        String city=request.getParameter("city");
        String state=request.getParameter("state");
        
//         out.print(totalamount);
//        int sts=0;
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
    PreparedStatement pstt = conn.prepareStatement("select * from cart where uemail=?");
    pstt.setString(1, email);
    ResultSet rs = pstt.executeQuery();
    PreparedStatement pst = conn.prepareStatement("INSERT INTO `order` (email, mob, adress, city, state, pin, amount) VALUES (?, ?, ?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);
    pst.setString(1, email);
    pst.setString(2, phno);
    pst.setString(3, adress);
    pst.setString(4, city);
    pst.setString(5, state);
    pst.setString(6, pin);
    pst.setString(7, totalamount);
    int sts = pst.executeUpdate();
    int orderId = -1;
    if (sts > 0) {
      ResultSet generatedKeys = pst.getGeneratedKeys();
      if (generatedKeys.next()) {
        orderId = generatedKeys.getInt(1); // Get the generated order ID
      }
    }
    if (orderId != -1) {
        while(rs.next()){
    int id = rs.getInt("catid");
    String pname = rs.getString("productname");
    String price = rs.getString("price");
    PreparedStatement qst = conn.prepareStatement("INSERT INTO `order_details` (oid,productname,price) VALUES (?,?,?)");
    qst.setInt(1, orderId);
    qst.setString(2, pname);
    qst.setString(3, price);
    int rts = qst.executeUpdate();
    if(rts>0){
      PreparedStatement deleteStmt = conn.prepareStatement("DELETE FROM cart WHERE uemail = ?");
      deleteStmt.setString(1, email);
    
    int deletedRows = deleteStmt.executeUpdate();
    if(deletedRows>0){
        response.sendRedirect("OrderSucess.jsp");
    }
    }
    
    }
    }
        
    
} catch (Exception e) {
    out.print(e);
}

        %>
    </body>
</html>
