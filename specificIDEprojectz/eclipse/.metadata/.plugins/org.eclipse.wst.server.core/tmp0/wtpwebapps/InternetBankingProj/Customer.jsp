<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="CustomerAddServe" method="post">
		
		<table>
		
			<tr>
			
			<td><label>Customer ID</label></td>
			<td><input type="text" name="cid"></td>
			
			</tr>
		
			<tr>
			
			<td><label>Customer Name</label></td>
			<td><input type="text" name="cname"></td>
			
			</tr>
			
			<tr>
			
			<td><label>Phone Number</label></td>
			<td><input type="text" name="phno"></td>
			
			</tr>
			
			<tr>
			
			<td><label>Email</label></td>
			<td><input type="email" name="email"></td>
			
			</tr>
			
			<tr>
			
			<td><label>Date Of Birth</label></td>
			<td><input type="text" name="dob"></td>
			
			</tr>
			
			<tr>
			
			<td><label>Plot No.</label></td>
			<td><input type="text" name="plotno"></td>
			
			</tr>
			
			<tr>
			
			<td><label>Street Name</label></td>
			<td><input type="text" name="streetnm"></td>
			
			</tr>
			
			<tr>
			
			<td><label>Pincode</label></td>
			<td><input type="text" name="pincode"></td>
			
			</tr>
			
			<tr>
			
			<td><label>Password</label></td>
			<td><input type="password" name="pass"></td>
			
			</tr>
			
			<tr>
			
			<td><input type="submit" value="ADD"></td>
			
			</tr>
			
		
		</table>
		
	</form>
</body>
</html>