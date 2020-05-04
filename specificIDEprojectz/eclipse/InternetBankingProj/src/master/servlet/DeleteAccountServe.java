package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.AccountDAO;
import master.DTO.AccountDTO;

/**
 * Servlet implementation class DeleteAccountServe
 */
public class DeleteAccountServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		String accountno=request.getParameter("accountno");
		
		AccountDTO adto=new AccountDTO();
		
		adto.setAccountno(accountno);
		
		AccountDAO adao=new AccountDAO();
		
		adao.deleteData(adto);
		
		response.sendRedirect("AccountDeleted.jsp");
		
	}

}