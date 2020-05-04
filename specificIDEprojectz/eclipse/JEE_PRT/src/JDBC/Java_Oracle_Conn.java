package JDBC;

import java.sql.*;

class TestConnection{
	
	Connection cn=null;
	Statement st=null;
	ResultSet rs=null;
	String select_sql="select * from student";
	
	public void getData() {
		
		try {
			//static method
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//register and load the driver
			
			//first occurance of wvt1 is username and second is password
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","wvt1","wvt1");
			//establish the connection
			
			st=cn.createStatement();//create the statement
			
			rs=st.executeQuery(select_sql);
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
}

public class Java_Oracle_Conn {

	public static void main(String[] args) {
		
		TestConnection ob=new TestConnection();
		ob.getData();
	}

}
