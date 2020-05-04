package master.utilities;

import java.sql.*;

public class ConnectionFactory {

	Connection cn=null;
	Statement st=null;
	ResultSet rs=null;
	
	public Connection getConn() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");//register and load the driver
			
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","INTERNET_BANKING_PROJ","akshaw000");//establish the connection
			
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		return cn;
	}
	
	public Statement getStatement() {
		
		try {
			
			cn=this.getConn();
			st=cn.createStatement();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		return st;
	}
	
	public ResultSet getResultSet(String sql) {
		
		try {
			
			st=this.getStatement();
			rs=st.executeQuery(sql);
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		return rs;
	}
}
