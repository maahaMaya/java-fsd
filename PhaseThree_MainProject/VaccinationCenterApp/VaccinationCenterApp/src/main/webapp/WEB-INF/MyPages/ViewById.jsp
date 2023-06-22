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
<h1>Vaccination Center Infomation</h1>
<p>Id : ${vcById.vaccinationcenterid }</p>
<p>Id : ${vcById.centername }</p>
<p>Id : ${vcById.centercity }</p>

	<h1>Citizen Information</h1>
	<h3>${cDById.ctizenname }</h3>
	<p>Id : ${cDById.citizenid }</p>
	<p>City : ${cDById.ctizecity }</p>
	<p>Number Of Vacciness : ${cDById.numberofdose }</p>
	<p>Vaccination Status : ${cDById.status }</p>
	<p>Allocated Vaccination Center : ${cDById.ctizencliniccity }</p>
</body>
</html>