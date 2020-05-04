package master.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import master.DTO.FD_DTO;
import master.utilities.ConnectionFactory;

public class FD_DAO {

	Connection cn=null;
	PreparedStatement ps=null;
	String insert_sql="INSERT INTO FD VALUES(?,?,?,?)";

	public void insertData(FD_DTO fdDto) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
			ps.setString(1, Double.toString(fdDto.getFd_amount()));
			ps.setString(2, Double.toString(fdDto.getYr()));
			ps.setString(3, fdDto.getAccno());
			ps.setString(4, fdDto.getOpen_date());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
}
