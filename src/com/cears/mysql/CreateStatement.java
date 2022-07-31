package com.cears.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class CreateStatement {
	private static String CREATE_QUERY = "create table Emp(EmployeeID INT(10),FirstName varchar(20), LastName varchar(20), City varchar(20))";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		java.sql.Statement st = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:///db_jdbc", "root", null);
			if (con != null) {
				System.out.println("Connection created successfully");
			} else {
				System.out.println("Connection not created");
			}
			st = con.createStatement();
			st.executeUpdate(CREATE_QUERY);
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

		System.out.println("Table created successfully");
	}

}
