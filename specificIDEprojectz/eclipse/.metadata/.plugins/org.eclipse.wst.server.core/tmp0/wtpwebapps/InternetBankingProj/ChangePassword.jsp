<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="ChangePasswordServe" method="post">
	
		<table>
		
			<tr>
			
				<td><label>Customer ID</label></td>
				<td><input type="text" name="cid"></td>
				
			</tr>
			
			<tr>
			
				<td><label>New Password</label></td>
				<td><input type="password" name="pass"></td>
				
			</tr>
			
			<tr>
			
				<td><input type="submit" value="CHANGE PASSWORD"></td>
		
			</tr>
			
		</table>
	
	</form>
	
</body>
</html>