<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="2">
	
		<tr>
		
		<td>USERNAME</td>
		<td>PASSWORD</td>
		<td>NAME</td>
		<td>PHONE NO</td>
		<td>EMAIL</td>
	
		</tr>
		
		<c:forEach var="data" items="${res}">
		
			<tr>
				<td><c:out value="${data.uname}"></c:out></td>
				<td><c:out value="${data.pass}"></c:out></td>
				<td><c:out value="${data.nm}"></c:out></td>
				<td><c:out value="${data.phno}"></c:out></td>
				<td><c:out value="${data.email}"></c:out></td>
			</tr>	
		
		</c:forEach>		
		
	</table>

</body>
</html>