<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="AccountUPD_II_Serve" method="post">
	
		<table>
		
			<tr>
			
				<td><label>Account No.</label></td>
				<td><input type="text" name="accountno"></td>
				
			</tr>
			
			<tr>
			
				<td><label>Update Balance Option</label></td>
				
				<td>
				
					<select name="updateBalOpt">
					
						<option value="addBalance" selected>Add Balance</option>
						<option value="modifyBalance">Modify Balance</option>
					
					</select>
				
				</td>
				
			</tr>
			
			<tr>
			
				<td><label>Balance</label></td>
				<td><input type="text" name="balance"></td>
				
			</tr> 
			
			<tr>
			
				<td><input type="submit" value="UPDATE"></td>
				
			</tr>
			
		</table>
	
	</form>
	
</body>
</html>