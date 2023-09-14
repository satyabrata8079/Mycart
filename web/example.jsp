<%-- 
    Document   : example
    Created on : 9 Aug, 2023, 10:13:25 PM
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
        <form action="AddImage2" method="post" enctype="multipart/form-data">
        <input type="file" name="file" >
        <input type="submit" value="submit">
        </form>
    </body>
</html>
