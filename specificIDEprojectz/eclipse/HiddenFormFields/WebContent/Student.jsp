<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="Sem.jsp" method="post">
	
		<table>
		
			<tr>
			
				<td><label>Roll No</label></td>
				<td><input type="text" name="rollno"></td>
				
			</tr>
		    
		    <tr>
			
				<td><label>Name</label></td>
				<td><input type="text" name="sname"></td>
				
			</tr>
		    
		    <tr>
			
				<td><label>Semester</label></td>
				
				<td>
				
					<select name="sem">
					
						<option value="I" selected>Semester I</option>
						<option value="II">Semester II</option>
						<option value="III">Semester III</option>
						<option value="IV">Semester IV</option>
						<option value="V">Semester V</option>
						<option value="VI">Semester VI</option>
						<option value="VII">Semester VII</option>
						<option value="VIII">Semester VIII</option>
						
					</select>
				
				</td>
				
			</tr>
		    
		    <tr>
			
				<td><input type="submit" value="CONTINUE"></td>
				
			</tr>
		    
		</table>
	
	</form>
	
</body>
</html>