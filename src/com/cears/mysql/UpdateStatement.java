package com.cears.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
public class UpdateStatement {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql:///db_jdbc";
	private static String user = "root";
	private static String pwd = null;
	private static String UPDATE_QUERY = ("Update movies set hero = 'Jr.NTR' where hero = 'Ranbir'");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
		    st = (Statement) con.createStatement();
		    int recordCount = st.executeUpdate(UPDATE_QUERY);
		    System.out.println(recordCount+"record updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
