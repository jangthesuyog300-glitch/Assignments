<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
</head>
<body>
    <h2>Students</h2>
    
    <a href="${pageContext.request.contextPath}/stud/addstudent">Add Student</a><br/><br/>
    
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>DOB</th>
            <th>Address</th>
            <th>Action</th>
        </tr>
        
        <c:forEach var="stud" items="${slist}">
            <tr>
                <td>${stud.sid}</td>
                <td>${stud.sname}</td>
                <td>${stud.email}</td>
                <td>${stud.dob}</td>
                <td>${stud.addr}</td>
                <td>
    <a href="${pageContext.request.contextPath}/stud/editstudent/${stud.sid}">Edit</a> /
    <a href="${pageContext.request.contextPath}/stud/delete/${stud.sid}">Delete</a>
</td>

            </tr>
        </c:forEach>
    </table>
</body>
</html>
