package master.DAO;

import java.sql.*;
import java.util.ArrayList;

import master.DTO.StudentDTO;
import master.utilities.ConnectionFactory;

public class StudentDAO {

	Connection cn=null;
	PreparedStatement ps=null;
	Statement st=null;
	ResultSet rs=null;
	String insert_sql="insert into student values(?,?,?,?)";
	String select_sql="select id from student order by id";

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
	
	public ArrayList getData() {
		
		ArrayList arr=new ArrayList();
		
		try {
			
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			st=cn.createStatement();
			rs=st.executeQuery(select_sql);
			
			while(rs.next()) {
				
				StudentDTO sdto=new StudentDTO();
				
				sdto.setId(Integer.parseInt(rs.getString(1)));
				
				arr.add(sdto);
			}
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		return arr;
	}
	
	public ArrayList getStudent(int id)
	{
		ArrayList arr1=new ArrayList();
		String sql1="select nm,addr,em from student where id="+id+"";
		try
		{
			cn=ConnectionFactory.getConnection();
			System.out.println(cn);
			st=cn.createStatement();
			rs=st.executeQuery(sql1);
			while(rs.next())
			{
				StudentDTO sdto1=new StudentDTO();
				sdto1.setNm(rs.getString(1));
				sdto1.setAddr(rs.getString(2));
				sdto1.setEm(rs.getString(3));
				arr1.add(sdto1);
			}
		}
		catch(SQLException se1)
		{
			se1.printStackTrace();
		}
		return arr1;
	}
}
