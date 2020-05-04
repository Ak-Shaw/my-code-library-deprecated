<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="AccountUPD_Serve" method="post">
	
		<table>
		
			<tr>
			
				<td><label>Account No.</label></td>
				<td><input type="text" name="accountno"></td>
				
			</tr>
			
			<tr>
			
				<td><label>New Balance</label></td>
				<td><input type="text" name="balance"></td>
				
			</tr>
			
			<tr>
			
				<td><input type="submit" value="MODIFY"></td>
		
			</tr>
			
		</table>
	
	</form>
	
</body>
</html>