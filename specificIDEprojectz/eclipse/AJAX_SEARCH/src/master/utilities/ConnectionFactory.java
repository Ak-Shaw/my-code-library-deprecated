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
	
	public static Connection getConnection()
    {
        Connection con=null;
       try
       {
    	   //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
    	   //con=DriverManager.getConnection("jdbc:odbc:myoracle","gopal","gopal");
    	  Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
          con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:XE", "wvt1", "wvt1");
           System.out.println("Connected:"+con);

       } catch(Exception e)
       {
           System.out.println("exception:"+e.getMessage());
       }
        return con;
    }
	
}
