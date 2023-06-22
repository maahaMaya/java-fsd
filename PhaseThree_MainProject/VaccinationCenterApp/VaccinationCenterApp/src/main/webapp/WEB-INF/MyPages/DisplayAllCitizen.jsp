<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DisplayAllCitizen</title>
</head>
<body>
<div style="width: 46vw; height: 8vh; border: 1px solid black; padding: 1vw;"> 
    <a href="${viewAll }">Vaccination Center</a> &nbsp; &nbsp; &nbsp; 
    <a href="${viewAllC }">Citizens</a>  &nbsp; &nbsp; &nbsp; 
    <a href="${s }">Logout</a> &nbsp; &nbsp; &nbsp; 
    Welcome Admin 
</div><br/><br/>
<button><a href="${sa }">Add New Citizen</a></button><br/><br/>
	<h1 style="text-align: center; width: 100%">View All Citizens</h1>
	<table width="100%" border="1">
		<tr>
			<th>Citizen ID</th>
			<th>Citizen Name</th>
			<th>Citizen City</th>
			<th>Vaccination Dose</th>
			<th>Citizen Status</th>
			<th>Citizen Clinic</th>
			<th>Action</th>
		</tr>
		<c:forEach var="crk" items="${lC }">
			<c:url var="deleteLink" value="/deleteCitizen">
				<c:param name="CitizenId"
					value="${crk.citizenid}" />
			</c:url>
			<c:url var="viewLink" value="/viewCitizen">
				<c:param name="CitizenId" value="${crk.citizenid}" />
			</c:url>
			<c:url var="updateLink" value="/updateCall">
				<c:param name="CitizenId" value="${crk.citizenid}" />
			</c:url>
			<tr>
				<td>${crk.citizenid }</td>
				<td>${crk.ctizenname }</td>
				<td>${crk.ctizecity }</td>
				<td>${crk.numberofdose }</td>
				<td>${crk.status }</td>
				<td>${crk.ctizencliniccity }</td>
				<td><a href="${deleteLink}"
					onclick="if (!(confirm('Are you sure you want to delete this Cricketer?'))) return false">Delete</a> &nbsp; &nbsp; 
					<a href="${viewLink}">View</a> &nbsp; &nbsp; <a href="${updateLink}">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>