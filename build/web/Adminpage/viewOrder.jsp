<%-- 
    Document   : viewOrder
    Created on : 25 Aug, 2023, 1:35:47 PM
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
        <style>
        /* Center the table */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        
        /* Style for the close button */
        .close-button {
            display: block;
            text-align: center;
            margin-top: 20px;
        }
    </style>
    </head>
    <body>
 
            <section>
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-xl-8">
                                <!-- RECENT REPORT 2-->
                                
      <table class="order-table table-bordered">
        <thead>
            <tr>
                <th>Oid</th>
                <th>Product Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <%
           try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycart?useSSL=false", "root", "root");
           String id=request.getParameter("oid");
           PreparedStatement pst = conn.prepareStatement("SELECT * FROM order_details WHERE oid = ?");
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
          
            while(rs.next()){
                
               %>
        <tbody>
            <!-- Sample order data, replace with dynamic data from your database -->
            <tr>
                <td><%= rs.getString("oid") %></td>
                <td><%= rs.getString("productname") %></td>
                <td><%= rs.getString("price") %></td>
            <!-- Add more rows for additional orders -->
        </tbody>
        <%
//                             out.print(rs.getString("categoryname"));
                
            }
        }
        catch(Exception e){
           out.print(e);
        }
        %>   
    </table>
                                <!-- END RECENT REPORT 2             -->
                            </div>
                            
                        </div>
                    </div>
                </div>

        <!-- Close button to hide the table -->
        <a href="/E_Commerce/Adminpage/ShoworderDetails.jsp" class="confirm-button btn-danger">Back to home</a>
    </div>
        
    </body>
</html>
