package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.AccountDAO;
import master.DAO.FD_DAO;
import master.DTO.FD_DTO;

/**
 * Servlet implementation class CreateFD_Serve
 */
public class CreateFD_Serve extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		double fd_amount=Double.parseDouble(request.getParameter("fd_amount"));
		double yr=Double.parseDouble(request.getParameter("yr"));
		String accno=request.getParameter("accno");
		String open_date=request.getParameter("open_date");
		
		AccountDAO adao=new AccountDAO();
		
		if(!adao.checkAccount(accno)) {
			
			response.sendRedirect("InvalidAccount.jsp");
			
		} else if(adao.getBalance(accno)<fd_amount) {
			
			response.sendRedirect("InsufficientBalance.jsp");
			
		} else {
			
		FD_DTO fdDto=new FD_DTO();
		
		fdDto.setFd_amount(fd_amount);
		fdDto.setYr(yr);
		fdDto.setAccno(accno);
		fdDto.setOpen_date(open_date);
		
		FD_DAO fdDao=new FD_DAO();
		
		fdDao.insertData(fdDto);
		
		response.sendRedirect("FD_CreationSuccess.jsp");
		}
	}

}
