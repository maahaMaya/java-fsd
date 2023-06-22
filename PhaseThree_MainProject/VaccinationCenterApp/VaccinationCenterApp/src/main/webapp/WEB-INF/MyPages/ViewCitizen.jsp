<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="width: 46vw; height: 8vh; border: 1px solid black; padding: 1vw;"> 
    <a href="${viewAll }">Vaccination Center</a> &nbsp; &nbsp; &nbsp; 
    <a href="${viewAllC }">Citizens</a>  &nbsp; &nbsp; &nbsp; 
    <a href="${s }">Logout</a> &nbsp; &nbsp; &nbsp; 
    Welcome Admin 
</div><br/><br/>
	<h1>Citizen Information</h1>
	<h3>${cD.ctizenname }</h3>
	<p>Id : ${cD.citizenid }</p>
	<p>City : ${cD.ctizecity }</p>
	<p>Number Of Vacciness : ${cD.numberofdose }</p>
	<p>Vaccination Status : ${cD.status }</p>
	<p>Allocated Vaccination Center : ${cD.ctizencliniccity }</p>
</body>
</html>