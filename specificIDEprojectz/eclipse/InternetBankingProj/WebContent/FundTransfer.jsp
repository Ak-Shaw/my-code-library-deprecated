<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="FundTransferServe" method="post">
	
		<table>
		
			<tr>
			
				<td><label>Source Account No.</label></td>
				<td><input type="text" name="saccno"></td>
			
			</tr>
			
			<tr>
			
				<td><label>Beneficiary Account No.</label></td>
				<td><input type="text" name="baccno"></td>
			
			</tr>
			
			<tr>
			
				<td><label>IFCS Code</label></td>
				<td><input type="text" name="ifcs"></td>
			
			</tr>
			
			<tr>
			
				<td><label>Bank Name</label></td>
				<td><input type="text" name="bank"></td>
			
			</tr>
			
			<tr>
			
				<td><label>Amount</label></td>
				<td><input type="number" name="amount"></td>
			
			</tr>
			
			<tr>
			
				<td><label>Date</label></td>
				<td><input type="text" name="tdate"></td>
			
			</tr>
			
			<tr>
			
				<td><input type="submit" value="TRANSFER"></td>
			
			</tr>
			
		</table>
		
	</form>

</body>
</html>