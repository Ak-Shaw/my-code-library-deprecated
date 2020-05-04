package master.DAO;

import java.sql.*;

import master.DTO.AccountDTO;
import master.utilities.ConnectionFactory;

public class AccountDAO {
	
	Connection cn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Statement st=null;
	String insert_sql="INSERT INTO ACCOUNT VALUES(?,?,?,?,?)";
	String del_sql="DELETE FROM ACCOUNT WHERE ACCOUNTNO=?";
	String upd_balance_sql="UPDATE ACCOUNT SET BALANCE=? WHERE ACCOUNTNO=?";
	String select_sql="SELECT * FROM ACCOUNT";

	public void insertData(AccountDTO adto) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
			ps.setString(1, adto.getAccountno());
			ps.setString(2, adto.getAccount_type());
			ps.setString(3, adto.getDate_of_open());
			ps.setString(4, adto.getBalance());
			ps.setString(5, adto.getCid());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public void deleteData(AccountDTO adto) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(del_sql);
			ps.setString(1, adto.getAccountno());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public void updateBalance(AccountDTO adto) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(upd_balance_sql);
			ps.setString(1, adto.getBalance());
			ps.setString(2, adto.getAccountno());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public void addBalance(AccountDTO adto,String balance,String accountno) {
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(upd_balance_sql);
			rs=con.getResultSet(select_sql);

			String bal="";
			
			while(rs.next()) {
				
				if(rs.getString(1).equals(accountno)) {
					
					bal=rs.getString(4);
					break;
				}
	
			}
			
			double newBalance=Double.parseDouble(bal)+Double.parseDouble(balance);
			String newBalanceString=Double.toString(newBalance);
			
			ps.setString(1, newBalanceString);
			ps.setString(2, adto.getAccountno());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public double getBalance(String accno) {
		
		String sql="select balance from account where accountno='"+accno+"'";
		double balance=0.0;
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			st=cn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()) 
				balance=rs.getDouble(1);
			
		} catch(SQLException se) {
			
			se.printStackTrace();
		}
		
		return balance;
	}
	
	public boolean checkAccount(String accno) {
		
		boolean flag=false;
		String sql="select accountno from account where accountno='"+accno+"'";
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			st=cn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next())
				flag=true;
			
		} catch(SQLException se) {
			se.printStackTrace();
		}
		
		return flag;
	}

}
