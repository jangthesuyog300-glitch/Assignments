<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
</head>
<body>

<h2>Edit Student</h2>
<form action="/stud/update" method="post">

    Student ID: <input type="text" name="sid" id="sid" value="${stud.sid}" readonly /><br/>
    Name: <input type="text" name="sname" id="sname" value="${stud.sname}" /><br/>
    Email: <input type="text" name="email" id="email" value="${stud.email}" /><br/>
    B.Date: <input type="date" name="dob" id="dob" value="${stud.dob}" /><br/>
    Address: <input type="text" name="addr" id="addr" value="${stud.addr}" /><br/>

    <button type="submit" name="btn" id="btn" value="update">Update</button>

</form>

</body>
</html>
