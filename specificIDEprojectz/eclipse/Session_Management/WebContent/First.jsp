<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
		String uname=request.getParameter("uname");
		session.setAttribute("username",uname);
		String pass=request.getParameter("pass");
		session.setAttribute("password",pass);
	
	%>
	
	<a href="Second.jsp">CONTINUE</a>

</body>
</html>