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
	
		String pid=request.getParameter("pid");
		String pname=request.getParameter("pname");
		int qty=Integer.parseInt(request.getParameter("qty"));
		double price=Double.parseDouble(request.getParameter("price"));
		
		double totalPrice=qty*price;
		String company=request.getParameter("company");
		
		
	%>
	
	COMPANY : <%=company %>
	
	<br><br>
	
	PRODUCT ID : <%=pid %>
	
	<br><br>
	
	PRODUCT NAME : <%=pname %>
	
	<br><br>
	
	QUANTITY : <%=qty %>
	
	<br><br>
	
	PRICE : <%=price %>
	
	<br><br>
	
	TOTAL PRICE : <%=totalPrice %>
	
	<br><br>
	

</body>
</html>