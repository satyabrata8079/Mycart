<%-- 
    Document   : OrderSucess
    Created on : 24 Aug, 2023, 8:41:20 PM
    Author     : satyabrata jena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .success-container {
            text-align: center;
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            max-width: 400px;
        }

        .success-icon {
            font-size: 48px;
            color: #4CAF50;
            margin-bottom: 20px;
        }

        .success-message {
            font-size: 24px;
            color: #333;
            margin-bottom: 20px;
        }

        .continue-button {
            background-color: #4CAF50;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .continue-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="success-container">
        <div class="success-icon">&#10004;</div>
        <div class="success-message">Order Successful</div>
        <form action="cart.jsp" method="post">
            <% 
            session.setAttribute("email", session.getAttribute("email"));
            %>
        <!--<button class="continue-button">Continue Shopping</button>-->
        <input type="submit" href=""  value="Continue Shopping" class="continue-button">  
        </form>
    </div>
</body>
</html>
