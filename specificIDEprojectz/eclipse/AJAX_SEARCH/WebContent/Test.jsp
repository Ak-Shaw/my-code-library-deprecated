<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master.DTO.StudentDTO"%>
<%@page import="master.DAO.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
var req=false;
function initialize()
{
  if(window.XMLHttpRequest)
   {
    req=new XMLHttpRequest();
    }
    else if(window.ActiveXObject)
    {
     req=new ActiveXObject("Microsoft.XMLHTTP");
     }
  
    }

function getIDDetails()
{
	 initialize();
     alert("id:"+id);
     var id=document.f1.id.value;
    // alert("id:"+id);
   
     
     var url="StudentDetails.jsp?id="+id;
     if(req!=null)
     {
         req.open("post",url,true);
         req.onreadystatechange=process1;
         req.send(null);
     }
    
     else
     {
       //document.getElementById("test").innerHTML="";  
     }
  }
  function process1()
  {
   if(req.readyState==4)
   {
     if(req.status==200)
     {
    	 var result=req.responseText;
         alert(result);
      
         var name=result.substring(0, result.indexOf("#"));
         alert(name);

         document.getElementById("name").value=name;
         var temp=result.substring(result.indexOf("#")+1);
         //alert("dfsdfdgdfgdg");
         //alert(temp);
         var addr=temp.substring(0, temp.indexOf("#"));
         alert(addr);
         document.getElementById("addr").value=addr;
         var email=temp.substring(temp.indexOf("#")+1);
         alert(email);
         document.getElementById("email").value=email;
     }
  }
     
}
  function goUpdate()
  {
	  alert("HELLO");
  	 initialize();
       alert("id:"+id);
       var id=document.f1.id.value;
       alert(id);
       var name=document.f1.name.value;
       alert(name);
       var addr=document.f1.addr.value;
       alert(addr);
       var email=document.f1.email.value;
      // alert("id:"+id);
     
       
       var url="StudentUpd.jsp?id="+id+"&name="+name+"&addr="+addr+"&email="+email;
      alert(url);

       if(req!=null)
       {
           req.open("post",url,true);
           req.onreadystatechange=process2;
           req.send(null);
       }
      
       else
       {
         //document.getElementById("test").innerHTML="";  
       }
    }
    function process2()
    {
     if(req.readyState==4)
     {
       if(req.status==200)
       {
    	 document.getElementById("testing").innerHTML="DATA UPDATED SUCCESSFULLY";
      	 document.f1.id.value="";
      	 document.f1.name.value="";
      	 document.f1.addr.value="";
      	 document.f1.email.value="";

       }
    }
       
  }

    	</script>
<BODY>
    	<h1>Search record from database using AJAX</h1>
	<form name="f1">
	<table>
	<tr>
		<td>Id</td>
		
		<td>
		
		<select name="id" id="id" onchange="getIDDetails()"> 
		
		<option>-SELECT ID-</option>
		
		<%
		
			StudentDAO sdao=new StudentDAO();
		
			ArrayList results=sdao.getData();
		
			Iterator itr=results.iterator();
		
			while(itr.hasNext()){
			
				StudentDTO sdto=(StudentDTO)itr.next();
		
		%>
		
		<option value="<%=sdto.getId() %>"><%=sdto.getId() %></option>
		
		<%
		
			}
		
		%>
		
		</select>
		</td>
	</tr>
	<tr>
		<td>Name</td>
		<td><input type="text" name="nm" id="name"/>
		</td>
	</tr>
	<tr>
		<td>Address</td>
		<td><input type="text" name="add" id="addr"/>
		</td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="text" name="em" id="email"/>
		</td>
	</tr>
	</table>
	 <div id="test"></div>
	</form>
</BODY>

 </html>