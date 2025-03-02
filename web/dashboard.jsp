<%-- 
    Document   : dashboard
    Created on : Mar 2, 2025, 2:02:48 PM
    Author     : Ravishan
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession sessionObj = request.getSession(false);
    if (sessionObj == null || sessionObj.getAttribute("user") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard - Mega City Cab</title>
</head>
<body>
    <h2>Welcome, <%= sessionObj.getAttribute("user") %></h2>
    <a href="booking.jsp">Book a Cab</a> |
    <a href="bill.jsp">View Bill</a> |
    <a href="help.jsp">Help</a> |
    <a href="LogoutServlet">Logout</a>
</body>
</html>

