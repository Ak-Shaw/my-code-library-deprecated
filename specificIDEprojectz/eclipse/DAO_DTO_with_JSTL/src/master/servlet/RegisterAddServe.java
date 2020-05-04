package master.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import master.DAO.RegisterDAO;
import master.DTO.RegisterDTO;

/**
 * Servlet implementation class RegisterAddServe
 */
public class RegisterAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String nm=request.getParameter("nm");
		String phno=request.getParameter("phno");
		String email=request.getParameter("email");
		
		RegisterDTO rdto=new RegisterDTO();
		
		rdto.setUname(uname);
		rdto.setPass(pass);
		rdto.setNm(nm);
		rdto.setPhno(phno);
		rdto.setEmail(email);
		
		RegisterDAO rdao=new RegisterDAO();
		
		rdao.insertData(rdto);
		
		ArrayList results=rdao.getData();
		HttpSession session=request.getSession();
		session.setAttribute("res", results);
		
		response.sendRedirect("Show_jstl.jsp");
		
	}

}
