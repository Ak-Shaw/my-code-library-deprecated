package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.AccountDAO;
import master.DTO.AccountDTO;

/**
 * Servlet implementation class AccountUPD_II_Serve
 */
public class AccountUPD_II_Serve extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		String accountno=request.getParameter("accountno");
		String updateBalOpt=request.getParameter("updateBalOpt");
		String balance=request.getParameter("balance");
		
		AccountDTO adto=new AccountDTO();
		
		adto.setAccountno(accountno);
		
		AccountDAO adao=new AccountDAO();
		
		if(updateBalOpt.equals("modifyBalance")) {
			
			adto.setBalance(balance);
			
			adao.updateBalance(adto);
			
			response.sendRedirect("AccountUPDSuccess.jsp");

		} else if(updateBalOpt.equals("addBalance")) {
			
			adao.addBalance(adto,balance,accountno);
			
			response.sendRedirect("AccountUPD_II_Success.jsp");

		}
		
	}

}
