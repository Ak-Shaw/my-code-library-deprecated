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

	%>
	
	<form action="Show.jsp" method="post">
	
		<table>
		
		    <tr>
			
				<td><label>City</label></td>
				<td><input type="text" name="city"></td>
				
			</tr>
			
			<tr>
			
				<td><label>Hobbies</label></td>
				<td><input type="text" name="hob"></td>
				
			</tr>
			
			<tr>
			
				<td><label>Email</label></td>
				<td><input type="email" name="email"></td>
				
			</tr>
			
			<tr>
			
				<td><label>Phone No.</label></td>
				<td><input type="text" name="phno"></td>
				
			</tr>
		    
		    <tr>
			
				<td><input type="submit" value="FINISH"></td>
				
			</tr>
		    
		</table>
		
		<input type="hidden" name="rollno" value="<%=rollno %>">
		<input type="hidden" name="sname" value="<%=sname %>">
		<input type="hidden" name="sem" value="<%=sem %>">
		<input type="hidden" name="cgpa" value="<%=cgpa %>">
		<input type="hidden" name="dept" value="<%=dept %>">
	</form>
	
</body>
</html>