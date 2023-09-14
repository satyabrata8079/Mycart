<%-- 
    Document   : Payment
    Created on : 10 Aug, 2023, 10:54:04 PM
    Author     : satyabrata jena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="Payment.css">
    </head>
    <body>
        <div class="row">
  <div class="col-75">
    <div class="container">
      <form action="orderconform.jsp" method="post">
          <%
                
//                out.print(session.getAttribute("email"));
               session.setAttribute("email", session.getAttribute("email"));
              
               
                %>

        <div class="row">
          <div class="col-50">
            <h3>Billing Address</h3>
            <label for="email"><i class="fa fa-envelope"></i> Email</label>
            <input type="text" id="email" name="email" value="<% out.print(session.getAttribute("email")); %>" readonly="">
            <label for="fname"><i class="fa fa-user"></i> phone number</label>
            <input type="text" id="fname" name="phone" placeholder="+91-06378854" required="">
            <label for="adr"><i class="fa fa-address-card-o"></i> Address</label>
            <input type="text" id="adr" name="address" placeholder="542 W. 15th Street" required="">
            <label for="city"><i class="fa fa-institution"></i> City</label>
            <input type="text" id="city" name="city" placeholder="New York" required="">

            <div class="row">
              <div class="col-50">
                <label for="state">State</label>
                <input type="text" id="state" name="state" placeholder="NY" required="">
              </div>
              <div class="col-50">
                <label for="zip">Zip</label>
                <input type="text" id="zip" name="zip" placeholder="10001" required="">
                <input type="hidden" id="city" name="tamount" value="<% out.print(session.getAttribute("amount")); %>">
              </div>
            </div>
          </div>
            
            <div class="col-50" id="payment">
            <h3>Payment</h3>
            <label for="fname">Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
            <label for="cname">Name on Card</label>
            <input type="text" id="cname" name="cardname" placeholder="John More Doe">
            <label for="ccnum">Credit card number</label>
            <input type="text" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444">
            <label for="expmonth">Exp Month</label>
            <input type="text" id="expmonth" name="expmonth" placeholder="September">

            <div class="row">
              <div class="col-50">
                <label for="expyear">Exp Year</label>
                <input type="text" id="expyear" name="expyear" placeholder="2018">
              </div>
              <div class="col-50">
                <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" placeholder="352">
              </div>
            </div>
          </div>

        </div>
        
        <input type="submit" value="Confirm order" class="btn" name="confirm">
       <input type="submit" href="" name="cancel" value="Cancel the order" class="btn">  
      </form>
          
       
               
    </div>
  </div>

  <div class="col-25">
    <div class="container">
      <h4>Cart
        <span class="price" style="color:black">
          <i class="fa fa-shopping-cart"></i>
          <b></b>
        </span>
      </h4>
        
      <p>Total <span class="price" style="color:black"><b>$<% out.print(session.getAttribute("amount")); %></b></span></p>
    </div>
  </div>
</div>
        <script>
            var pay = document.getElementById('payment');
            pay.style.display = "none";
        </script>
    </body>
</html>
