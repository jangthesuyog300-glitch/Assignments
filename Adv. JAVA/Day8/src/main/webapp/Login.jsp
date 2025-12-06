<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="validateuser" method="post">
		user name: <input type ="text" name="uname" id="uname">
		Password : <input type ="password" name="pass" id="pass">
		<button type="submit" name="btn" id="btn">Login</button>
		<a href="register.html">Register</a>
		<a href="forgotPassword.html">Forgot Password</a>
	</form>
</body>
</html>