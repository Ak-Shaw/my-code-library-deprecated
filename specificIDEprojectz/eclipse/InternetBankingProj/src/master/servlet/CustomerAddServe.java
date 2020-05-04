package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.CustomerDAO;
import master.DTO.CustomerDTO;

/**
 * Servlet implementation class CustomerAddServe
 */
public class CustomerAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		String cid=request.getParameter("cid");
		String cname=request.getParameter("cname");
		String phno=request.getParameter("phno");
		String email=request.getParameter("email");
		String dob=request.getParameter("dob");
		String plotno=request.getParameter("plotno");
		String streetnm=request.getParameter("streetnm");
		String pincode=request.getParameter("pincode");
		String pass=request.getParameter("pass");
		
		CustomerDTO cdto=new CustomerDTO();
		
		cdto.setCid(cid);
		cdto.setCname(cname);
		cdto.setPhno(phno);
		cdto.setEmail(email);
		cdto.setDob(dob);
		cdto.setPlotno(plotno);
		cdto.setStreetnm(streetnm);
		cdto.setPincode(pincode);
		cdto.setPass(pass);
		
		CustomerDAO cdao=new CustomerDAO();
		
		cdao.insertData(cdto);
		
		response.sendRedirect("CustomerAddSuccess.jsp");

	}

}
