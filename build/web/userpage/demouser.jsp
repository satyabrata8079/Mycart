<%-- 
    Document   : demouser
    Created on : 23 Nov, 2022, 12:48:26 AM
    Author     : satyabrata jena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            out.print("username"+ session.getAttribute("username"));
            out.print("email"+ session.getAttribute("email"));
            %>
    </body>
</html>
