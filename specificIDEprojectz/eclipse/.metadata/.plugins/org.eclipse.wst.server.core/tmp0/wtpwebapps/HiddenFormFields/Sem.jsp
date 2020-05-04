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

	%>
	
	<form action="Personal.jsp" method="post">
	
		<table>
		
		    <tr>
			
				<td><label>CGPA</label></td>
				<td><input type="text" name="cgpa"></td>
				
			</tr>
		    
		    <tr>
			
				<td><label>Department</label></td>
				
				<td>
				
					<select name="dept">
					
						<option value="CSE" selected>Computer Science and Engineering</option>
						<option value="ECE">Electronics and Communication Engineering</option>
						<option value="EE">Electrical Engineering</option>
						<option value="ME">Mechanical Engineering</option>
						<option value="CE">Civil Engineering</option>
					
					</select>
				
				</td>
				
			</tr>
		    
		    <tr>
			
				<td><input type="submit" value="CONTINUE"></td>
				
			</tr>
		    
		</table>
		
		<input type="hidden" name="rollno" value="<%=rollno %>">
		<input type="hidden" name="sname" value="<%=sname %>">
		<input type="hidden" name="sem" value="<%=sem %>">
		
	</form>
	
</body>
</html>