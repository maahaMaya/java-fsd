<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminLogin</title>
</head>
<body>
<div style="width: 46vw; height: 8vh; border: 1px solid black; padding: 1vw;"> 
    <a href="${viewAll }">Vaccination Center</a> &nbsp; &nbsp; &nbsp; 
    <a href="${viewAllC }">Citizens</a>  &nbsp; &nbsp; &nbsp; 
    <a href="${s }">Logout</a> &nbsp; &nbsp; &nbsp; 
    Welcome Admin 
</div><br/><br/>

	<div style="width: 45vw; height: 35vh; border: 1px solid black;">
		<form method="post" action="userLogin" style="padding-left: 3vw;">
			<h1>Login</h1><br /> 
            <label>Username </label> <input type="text" style="width: 80%;" name="username"><br /><br /> 
            <label>Password : </label> <input type="text" style="width: 80%;" name="password"><br /><br />

			<button>Login</button> &nbsp;
			<a href="RegisterAdminPage" style="color: black; text-decoration: none;">Register</a>
		</form>
	</div>
	<h2 style="color: red;">${incorrectCredentailsMressage }</h2>
</body>
</html>