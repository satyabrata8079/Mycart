<%-- 
    Document   : order
    Created on : 25 Nov, 2022, 8:23:21 AM
    Author     : satyabrata jena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        
    <div class="modal-dialog modal-lg">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          
          
        </div>
        <div class="modal-body">
            <form action="orderconform.jsp" method="post">
                <%
                
                out.print(session.getAttribute("email"));
               session.setAttribute("email", session.getAttribute("email"));
               
                %>
                <input type="hidden" name="mail" value="<% out.print(session.getAttribute("email")); %>"
            <div class="form-group">
                <h1>Your total amount is:</h1>
                <input type="text" class="form-control" name="amt" placeholder="" value="<% out.print(session.getAttribute("amount")); %>" readonly=""/>
            </div>
            <div class="form-group">
                <input type="text" class="form-control" name="address" placeholder="enter  your address" required=""/>
            </div>
                <div class="form-group">
                <input type="number" class="form-control" name="pin" placeholder="enter your pin code" required=""/>
                <div class="form-group">
                <input type="number" class="form-control" name="phn" placeholder="enter the phone no" required=""/>
            </div>
            </div>
            <div class="form-group">
                <span>Please select payment mode</span>
                <select name="payment" id="" class="form-control">
                    <option value="cod">cod</option>
                 
                </select>
            </div>
            <div class="container text-center">
                <button class="btn btn-outline-success">
                   Conform Order
                </button>
                <button class="btn btn-outline-success">
                   Cancle Order
                </button>
            </div>
                
           
        </div>
       </form>

      </div>
      
    </div>
  

    </body>
</html>
