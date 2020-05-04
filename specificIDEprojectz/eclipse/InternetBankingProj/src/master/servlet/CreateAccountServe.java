package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.AccountDAO;
import master.DTO.AccountDTO;

/**
 * Servlet implementation class CreateAccountServe
 */
public class CreateAccountServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String accountno=request.getParameter("accountno");
		String account_type=request.getParameter("account_type");
		String date_of_open=request.getParameter("date_of_open");
		String balance=request.getParameter("balance");
		String cid=request.getParameter("cid");
		
		AccountDTO adto=new AccountDTO();
		
		adto.setAccountno(accountno);
		adto.setAccount_type(account_type);
		adto.setDate_of_open(date_of_open);
		adto.setBalance(balance);
		adto.setCid(cid);
		
		AccountDAO adao=new AccountDAO();
		
		adao.insertData(adto);
		
		response.sendRedirect("AccountCreationSuccess.jsp");

	}

}
