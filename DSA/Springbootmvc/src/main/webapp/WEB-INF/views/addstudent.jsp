<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/stud/addstudent" method="post">
    Student name <input type="text" name="sname"><br>
    Email <input type="text" name="email"><br>
    B.Date <input type="date" name="dob"><br>
    Address <input type="text" name="addr"><br>
    <button type="submit">Add</button>
</form>

</body>
</html>