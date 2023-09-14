<%-- 
    Document   : logout
    Created on : 26 Nov, 2022, 9:06:01 AM
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
        <%
         session.invalidate();
         response.sendRedirect("login2.jsp");
        %>
    </body>
</html>
