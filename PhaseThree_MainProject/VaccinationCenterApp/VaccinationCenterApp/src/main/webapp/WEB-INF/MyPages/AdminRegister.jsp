<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
    <div style="width: 45vw;  border: 1px solid black;">
        <h1 >Admin Registration</h1>
		<form method="post" action="RegisterAdminPageMethod" style="margin: 1vw; border: 1px solid black; font-size: 20px;" >
			<h6 style="text-align: center; border-bottom: 1px solid black;padding-bottom: 1vw; ">Registration</h6> 
            <label>Name &nbsp;  &nbsp; &nbsp; : </label> <input type="text" style="width: 80%;" name="adminName"><br /><br /> 
            <label>Email &nbsp; &nbsp; &nbsp;   : </label> <input type="text" style="width: 80%;" name="adminEmail"><br /><br /> 
            <label>Password : </label> <input type="text" style="width: 80%;" name="adminPassword"><br /><br />
            <hr/>
			<button style="margin-left: 45%; margin-bottom: 1vw;">Register</button>
		</form>
	</div>
</body>
</html>