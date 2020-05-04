package master.DAO;

import java.sql.*;

import master.DTO.CustomerDTO;
import master.utilities.ConnectionFactory;

public class CustomerDAO {
	
	Connection cn=null;
	PreparedStatement ps=null;
	String insert_sql="INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?,?,?,?)";
	String del_sql="DELETE FROM CUSTOMER WHERE CID=?";
	String change_pass_sql="UPDATE CUSTOMER SET PASS=? WHERE CID=?";
	String upd_email_phno_sql="UPDATE CUSTOMER SET PHNO=?, EMAIL=? WHERE CID=?";
	
	public void insertData(CustomerDTO cdto) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
			ps.setString(1, cdto.getCid());
			ps.setString(2, cdto.getCname());
			ps.setString(3, cdto.getPhno());
			ps.setString(4, cdto.getEmail());
			ps.setString(5, cdto.getDob());
			ps.setString(6, cdto.getPlotno());
			ps.setString(7, cdto.getStreetnm());
			ps.setString(8, cdto.getPincode());
			ps.setString(9, cdto.getPass());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public void deleteData(CustomerDTO cdto) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(del_sql);
			ps.setString(1, cdto.getCid());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public void changePassword(CustomerDTO cdto) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(change_pass_sql);
			ps.setString(1, cdto.getPass());
			ps.setString(2, cdto.getCid());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public void updatePhnoAndEmail(CustomerDTO cdto) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(upd_email_phno_sql);
			ps.setString(1, cdto.getPhno());
			ps.setString(2, cdto.getEmail());
			ps.setString(3, cdto.getCid());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}

}
