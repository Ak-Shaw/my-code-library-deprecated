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
	
		String pass=request.getParameter("pass");
		
		if(pass.equals("admin")){
			
			
			%>
			
			<jsp:forward page="Show.jsp"></jsp:forward>
			
			<%
		} else {
	
	%>
	
	<jsp:forward page="Display.jsp"></jsp:forward>
	
	<%
	
	}
	
	%>

</body>
</html>