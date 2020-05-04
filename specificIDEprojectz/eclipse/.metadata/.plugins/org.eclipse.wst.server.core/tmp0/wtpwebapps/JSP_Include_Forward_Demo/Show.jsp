<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:include page="img1.jsp"></jsp:include>
    
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
	
	%>
	
	<br><br>
	USERNAME IS : <%=uname %>
	<br><br>
	PASSWORD IS : <%=pass %>

</body>
</html>