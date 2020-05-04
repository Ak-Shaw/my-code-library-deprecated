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
<!-- param below represents an object while uname represents a field -->
USERNAME IS : <c:out value="${param.uname}"></c:out>
<br><br>
PASSWORD IS : <c:out value="${param.pass}"></c:out>
<br><br>

	<c:forEach var="number" begin="5" end="10">
	
		<c:out value="${number }"></c:out>
	
	</c:forEach>
</body>
</html>