<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>

<th>Id</th>
<th>Name</th>
<th>salary</th>
<th>hiredate</th>
</tr>
<c:forEach var="emp" item="${elist}">
<tr>
<td>${emp.id}</td>
<td>${emp.ename}</td>
<td>${emp.sal}</td>
<td>${emp.hireDate}</td>
</tr>
</c:forEach>
</table>
</body>
</html>