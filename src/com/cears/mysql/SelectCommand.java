package com.cears.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class SelectCommand {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///db_jdbc","root",null);
			if(con!=null)
			{
				System.out.println("Connection created successfully");
			}
			else
			{
				System.out.println("Connection not created");
			}
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery("select * from db_jdbc");
			while(rs.next())
			{
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

		
	}
	
}
