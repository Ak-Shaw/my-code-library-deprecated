package master.DAO;

import java.sql.*;

import master.DTO.FundTransferDTO;
import master.utilities.ConnectionFactory;

public class FundTransferDAO {

	Connection cn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Statement st=null;
	String insert_sql="INSERT INTO FUND_TRANSFER VALUES(?,?,?,?,?,?)";
	
	public void insertData(FundTransferDTO ftdto) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
			ps.setString(1, ftdto.getSaccno());
			ps.setString(2, ftdto.getBaccno());
			ps.setString(3, ftdto.getIfcs());
			ps.setString(4, ftdto.getBank());
			ps.setString(5, Double.toString(ftdto.getAmount()));
			ps.setString(6, ftdto.getTdate());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
}
