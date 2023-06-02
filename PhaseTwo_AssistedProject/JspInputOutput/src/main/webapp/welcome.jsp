<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br>
<h1>Product Details is </h1><br><br>
<%= "Product Name is :  " + request.getParameter("pName") %><br><br>
<%= "Product Price is :  " + request.getParameter("pPrice") %><br><br>
<%= "Product Details is :  " + request.getParameter("pDetails") %><br><br>
</body>
</html>