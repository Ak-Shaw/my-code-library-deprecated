<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="pd" class="master.ProductBean">
    
    	<jsp:setProperty name="pd" property="pid"></jsp:setProperty>
    	<!-- equivalent to pd.setPid(pid) -->
    	
    	<jsp:setProperty name="pd" property="pname"></jsp:setProperty>
    	<jsp:setProperty name="pd" property="qty"></jsp:setProperty>
    	<jsp:setProperty name="pd" property="price"></jsp:setProperty>

    </jsp:useBean>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

PID : <%=pd.getPid() %>

<br><br>

PNAME : <%=pd.getPname() %>

<br><br>

QTY : <%=pd.getQty() %>

<br><br>

PRICE : <%=pd.getPrice() %>

<br><br>


</body>
</html>