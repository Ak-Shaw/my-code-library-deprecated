package master.DAO;

import java.sql.*;

import master.utilities.ConnectionFactory;

public class StudentDAO {

	Connection cn=null;
	PreparedStatement ps=null;
	String insert_sql="insert into student values(?,?,?,?)";
	
	public void insertData(int id,String nm,String addr,String em) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
			ps.setInt(1,id);
			ps.setString(2,nm);
			ps.setString(3,addr);
			ps.setString(4,em);
			ps.executeUpdate();
			cn.commit();
			
		} catch(SQLException se) {
			se.printStackTrace();
		}
	}
}
