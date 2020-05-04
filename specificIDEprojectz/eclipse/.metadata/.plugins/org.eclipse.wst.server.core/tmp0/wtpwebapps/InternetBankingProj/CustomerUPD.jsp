<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="CustomerUPD_Serve" method="post">
	
		<table>
		
			<tr>
			
				<td><label>Customer ID</label></td>
				<td><input type="text" name="cid"></td>
				
			</tr>
			
			<tr>
			
				<td><label>New Phone Number</label></td>
				<td><input type="text" name="phno"></td>
				
			</tr>
			
			<tr>
			
				<td><label>New Email</label></td>
				<td><input type="email" name="email"></td>
				
			</tr>
			
			<tr>
			
				<td><input type="submit" value="UPDATE"></td>
		
			</tr>
			
		</table>
	
	</form>

</body>
</html>