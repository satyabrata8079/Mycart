<%-- 
    Document   : updateproduct
    Created on : 26 Nov, 2022, 7:20:21 AM
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
        <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>
        <div class="modal-dialog modal-lg">
    
      <!-- Modal content-->
      <div class="modal-content">
        
        <div class="modal-body">
            <form action="updatep.jsp" method="post">
                <%
                 String id=request.getParameter("r");
                 try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
            PreparedStatement pst = conn.prepareStatement("select * from products where pid=? ");
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                %>
               <div class="form-group">
                   <input type="text" class="form-control" name="id" value="<%= rs.getString("pid") %>" placeholder="enter the product name" readonly=""/>
            </div> 
            <div class="form-group">
                <input type="text" class="form-control" name="pname" value="<%= rs.getString("productname") %>" placeholder="enter the product name" required=""/>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="pdesc" value="<%= rs.getString("productdesc") %>" placeholder="enter the product  dresc" required=""/>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="pprice" value="<%= rs.getString("productcolprice") %>" placeholder="enter the product price" required=""/>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="pdiscount" value="<%= rs.getString("productdiscount") %>" placeholder="enter the product discount" required=""/>
            </div>
            <div class="container text-center">
                <button class="btn btn-outline-success">
                    update product 
                </button>
            </div>
                <%
            }
                 }
                 catch(Exception e){
                    
                }
                %>
           </form>
        </div>
        
      </div>
      
    </div>
    </body>
</html>
