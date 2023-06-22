<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AfterLoginPage</title>
</head>
<body>
	<h1 style="text-align: center; width: 100%">View All Cricketers</h1>
	<table width="100%" border="1">
		<tr>
			<th>Crk ID</th>
			<th>Crk Name</th>
			<th>Game</th>
		</tr>

		<c:forEach var="crk" items="${listOfVaccinationCenter }">
			<c:url var="deleteLink" value="/deleteVc">
				<c:param name="vaccinationCenterId"
					value="${crk.vaccinationcenterid}" />
			</c:url>
			<c:url var="updateLink" value="/updateCall">
				<c:param name="vaccinationCenterId" value="${crk.vaccinationcenterid}" />
			</c:url>
			<tr>
				<td>${crk.vaccinationcenterid }</td>
				<td>${crk.centername }</td>
				<td>${crk.centercity }</td>
				<td><a href="${deleteLink}"
					onclick="if (!(confirm('Are you sure you want to delete this Cricketer?'))) return false">Delete</a></td>
				<td><a href="${updateLink}">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>