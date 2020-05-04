<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="Controller.jsp" method="post">
	
		<table>
		
			<tr>
			
				<td><label>Product ID : </label></td>
				<td><input type="text" name="pid"></td>
				
			</tr>
			
			<tr>
			
				<td><label>Product Name : </label></td>
				<td><input type="text" name="pname"></td>
				
			</tr>
			
			<tr>
			
				<td><label>Quantity : </label></td>
				<td><input type="text" name="qty"></td>
				
			</tr>
			
			<tr>
			
				<td><label>Price : </label></td>
				<td><input type="text" name="price"></td>
				
			</tr>
			
			<tr>
			
				<td><input type="submit" value="PURCHASE"></td>
				
			</tr>
			
		</table>
	
	</form>

</body>
</html>