<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="CreateAccountServe" method="post">
	
		<table>
		
			<tr>
			
				<td><label>Account No.</label></td>
				<td><input type="text" name="accountno"></td>
			
			</tr>
			
			<tr>
			
				<td><label>Account Type</label></td>
				
				<td>
				
					<select name="account_type">
					
						<option selected value="Savings">Savings</option>
						<option value="Current">Current</option>
						
					</select>	
				</td>
			
			</tr>
			
			<tr>
			
				<td><label>Date Of Open</label></td>
				<td><input type="text" name="date_of_open"></td>
			
			</tr>
			
			<tr>
			
				<td><label>Balance</label></td>
				<td><input type="text" name="balance"></td>
			
			</tr>
			
			<tr>
			
				<td><label>CID</label></td>
				<td><input type="text" name="cid"></td>
			
			</tr>
			
			<tr>
			
				<td><input type="submit" value="OPEN ACCOUNT"></td>
			
			</tr>
			
		</table>
		
	</form>

</body>
</html>