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
	
		String rollno=request.getParameter("rollno");
		String sname=request.getParameter("sname");
		String sem=request.getParameter("sem");
		double cgpa=Double.parseDouble(request.getParameter("cgpa"));
		String dept=request.getParameter("dept");
		String city=request.getParameter("city");
		String hob=request.getParameter("hob");
		String email=request.getParameter("email");
		String phno=request.getParameter("phno");
		
	%>
	
	ROLLNO :<%=rollno %>
	
	<br><br>
	
	NAME :<%=sname %>
	
	<br><br>
	
	SEMESTER :<%=sem %>
	
	<br><br>
	
	CGPA :<%=cgpa %>
	
	<br><br>
	
	DEPARTMENT :<%=dept %>
	
	<br><br>
	
	CITY :<%=city %>
	
	<br><br>
	
	HOBBIES :<%=hob %>
	
	<br><br>
	
	EMAIL :<%=email %>
	
	<br><br>
	
	PHONE NO. :<%=phno %>
	
	<br><br>
	
	
</body>
</html>