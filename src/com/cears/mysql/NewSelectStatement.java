package com.cears.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

public class NewSelectStatement {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql:///db_jdbc";
	private static String user = "root";
	private static String pwd = null;
	private static String SELECT_QUERY = ("select * from movies where hero = 'sharukh'");


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
		    st = (Statement) con.createStatement();
		    rs = st.executeQuery(SELECT_QUERY);
		    
		    while(rs.next())
		    {
		    	System.out.println("NO = "+(rs.getInt("no"))+" Movie Name = "+(rs.getString("name"))+" Hero Name = "+(rs.getString("hero"))+" Herion Name = "+(rs.getString("herion")));
		    }
		    
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
