<%@page import="master.LoginBean"%>
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
	
		LoginBean lbn=(LoginBean)session.getAttribute("lbs");
	
	%>
WELCOME : <%=lbn.getUname() %>
<br>
YOUR PASSWORD IS : <%=lbn.getPass() %>

</body>
</html>