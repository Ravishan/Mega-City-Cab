<%-- 
    Document   : index
    Created on : Mar 2, 2025, 1:59:35 PM
    Author     : Ravishan
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login - Mega City Cab</title>
</head>
<body>
    <h2>Login</h2>
    <form action="LoginServlet" method="post">
    <input type="text" name="username" placeholder="Enter Username" required>
    <input type="password" name="password" placeholder="Enter Password" required>
    <input type="submit" value="Login">
</form>

</body>
</html>

