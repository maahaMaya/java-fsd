<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Vaccination Center</title>
</head>
<body>
<div style="width: 46vw; height: 8vh; border: 1px solid black; padding: 1vw;"> 
    <a href="${viewAll }">Vaccination Center</a> &nbsp; &nbsp; &nbsp; 
    <a href="${viewAllC }">Citizens</a>  &nbsp; &nbsp; &nbsp; 
    <a href="${s }">Logout</a> &nbsp; &nbsp; &nbsp; 
    Welcome Admin 
</div><br/><br/>
	<h1 style="text-align: center; width: 100%">Modify Vaccination Center</h1>
	<frm:form method="get" action="updateMethod" modelAttribute="crk">
		<p style="text-align: center; width: 100%">

			<frm:input type="text" path="vaccinationcenterid"
				value="${crk.vaccinationcenterid }" readonly="readonly" />
			<br /> <br />
			<frm:input type="text" path="centername" value="${crk.centername }" />
			<br /> <br /> <span style="text-align: center; width: 100%">${crk.centercity }</span>
			<frm:select path="centercity">
				<option value="Bangalore">Bangalore</option>
				<option value="Mumbai">Mumbai</option>
				<option value="Pune">Pune</option>
				<option value="Delhi">Delhi</option>
			</frm:select>
			<br /> <br /> <input type="submit"
				value="Modify Vaccination Center" />
		</p>
	</frm:form>
</body>
</html>