<%@ page import="master.DAO.StudentDAO" %>
<%@ page import="master.DTO.StudentDTO" %>
<%@ page import="java.util.*"%>

<%
int id=Integer.parseInt(request.getParameter("id"));
StudentDAO sdao=new StudentDAO();
ArrayList details=sdao.getStudent(id);
System.out.println("Details::"+details);
Iterator itr=details.iterator();
while(itr.hasNext())
{
   //System.out.println(rs.getString(1));
 StudentDTO s=(StudentDTO)itr.next();
   out.println(s.getNm() +"#");
   out.println(s.getAddr() +"#");
   out.println(s.getEm());
 }

%>
