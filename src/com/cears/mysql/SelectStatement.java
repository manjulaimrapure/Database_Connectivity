package com.cears.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SelectStatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///db_jdbc","root",null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("Connected successfully");
		
	}

}
