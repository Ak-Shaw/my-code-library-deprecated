package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.CustomerDAO;
import master.DTO.CustomerDTO;

/**
 * Servlet implementation class CustomerUPD_Serve
 */
public class CustomerUPD_Serve extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		String cid=request.getParameter("cid");
		String phno=request.getParameter("phno");
		String email=request.getParameter("email");
		
		CustomerDTO cdto=new CustomerDTO();
		
		cdto.setCid(cid);
		cdto.setPhno(phno);
		cdto.setEmail(email);
		
		CustomerDAO cdao=new CustomerDAO();
		
		cdao.updatePhnoAndEmail(cdto);
		
		response.sendRedirect("CustomerUPDSuccess.jsp");

	}

}
