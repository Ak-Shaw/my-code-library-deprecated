package master.utilities;

import java.sql.*;

public class ConnectionFactory {

	Connection cn=null;
	
	public Connection getConn() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");//register and load the driver
			
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","wvt1","wvt1");//establish the connection
			
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		return cn;
	}
	
}
