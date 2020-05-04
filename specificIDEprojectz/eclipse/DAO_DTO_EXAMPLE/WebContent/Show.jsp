<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master.DTO.RegisterDTO"%>
<%@page import="master.DAO.RegisterDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="2">
	
		<tr>
		
		<td>USERNAME</td>
		<td>PASSWORD</td>
		<td>NAME</td>
		<td>PHONE NO</td>
		<td>EMAIL</td>
	
		</tr>
		
		<%
		RegisterDAO rdao=new RegisterDAO();
		
		ArrayList results=rdao.getData();
		
		Iterator itr=results.iterator();
		
		while(itr.hasNext()){
			
			RegisterDTO rdto=(RegisterDTO)itr.next();
			
			%>
			
			<tr>
			<td><%=rdto.getUname() %></td>
			<td><%=rdto.getPass() %></td>
			<td><%=rdto.getNm() %></td>
			<td><%=rdto.getPhno() %></td>
			<td><%=rdto.getEmail() %></td>
			</tr>
			
			<%
		}
		%>
	</table>

</body>
</html>