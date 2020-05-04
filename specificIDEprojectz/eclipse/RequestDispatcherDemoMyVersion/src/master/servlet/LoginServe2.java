package master.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServe2
 */
public class LoginServe2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}
	
	private String uname;
	private String pass;
	private HttpServletResponse response;
	
	public LoginServe2(String uname, String pass, HttpServletResponse response) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.response = response;
	}
	
	public void printData()throws IOException {
		
		PrintWriter out=response.getWriter();
		out.println("login successful");
	}
	
	

}
