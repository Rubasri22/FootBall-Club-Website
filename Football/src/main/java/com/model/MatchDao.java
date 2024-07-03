// MatchDao.java

package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class MatchDao {

		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		public MatchDao() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vsbdb", "root", "root");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		}
	//	static int i=0;
		public void storeData(Match m) {
			String sql="insert into matchdetails(title, place, mdate) values (?,?,?)";
			try {
				pst=con.prepareStatement(sql);
				pst.setString(1, m.getTitle());
				pst.setString(2, m.getPlace());
				pst.setString(3, m.getDt());
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
		}
			
			public ResultSet retriveMatch() {
				String sql="select * from matchdetails";
				try {
					pst=con.prepareStatement(sql);
					rs=pst.executeQuery();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
					return  rs;	
			
			
		

}
}
