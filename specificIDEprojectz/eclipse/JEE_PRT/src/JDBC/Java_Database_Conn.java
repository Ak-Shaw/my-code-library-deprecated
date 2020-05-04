package JDBC;

import java.sql.*;

class TConnection{
	
	Connection cn=null;//establish connection
	
	Statement st=null;//execute sql statement
	//used in case of static
	
	PreparedStatement ps=null;
	ResultSet rs=null;//retrieve data from database
	String select_sql="select * from customer";
	String insert_sql="insert into customer values(?,?,?)";//where '?' represents placeholder
	String delete_sql="delete from customer where cid=?";
	String update_sql="update customer set cname=?, cphno=? where cid=?";
	
	public void getData() {
		
		try {
			
			//Class.forName("oracle.jdbc.driver.OracleDriver");//register and load the driver
			
			//cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","wvt1","wvt1");//establish the connection
			//machine name: localhost
			//machine name will be ip address for other machine
			//port no. : 1521
			//database: XE
			
			ConnectionFactory con=new ConnectionFactory();
			//cn=con.getConn();
			
			//st=cn.createStatement();//creation of statement
			
			//st=con.getStatement();
			
			rs=con.getResultSet(select_sql);
			while(rs.next()) {
				
				System.out.println(rs.getString(1)+"===>"+rs.getString(2)+"===>"+rs.getString(3));
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
public void insertData() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");//register and load the driver
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","wvt1","wvt1");//establish the connection
			
			ps=cn.prepareStatement(insert_sql);
			ps.setString(1, "C3");
			ps.setString(2, "SUMAN");
			ps.setString(3, "9856678");
			ps.executeUpdate();
			cn.commit();
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}

	public void deleteData() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");//register and load the driver
			
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","wvt1","wvt1");//establish the connection
			
			ps=cn.prepareStatement(delete_sql);
			ps.setString(1, "C3");
			ps.executeUpdate();//returns int, as in the number of lines executed
			cn.commit();
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public void updateData() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");//register and load the driver
			
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","wvt1","wvt1");//establish the connection
			
			ps=cn.prepareStatement(update_sql);
			ps.setString(1, "AYUSH");
			ps.setString(2, "9831284491");
			ps.setString(3, "C2");
			ps.executeUpdate();
			cn.commit();
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
}
public class Java_Database_Conn {

	public static void main(String[] args) {

		TConnection tc=new TConnection();
		//tc.insertData();
		//tc.deleteData();
		//tc.updateData();
		tc.getData();
	}

}
