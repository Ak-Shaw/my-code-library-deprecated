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
	
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
	
		//session.setAttribute("username",uname);
		//session.setAttribute("password",pass);
		
		LoginBean lb=new LoginBean();
		lb.setUname(uname);
		lb.setPass(pass);
		session.setAttribute("lbs", lb);
	
	%>
	
	<a href="Second2.jsp">CONTINUE</a>

</body>
</html>