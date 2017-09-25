package com.database;

import org.testng.annotations.Test;

import java.sql.*;
//import java.util.ArrayList;

public class DatabaseTesting {
	//protected static String list[] = new String[3];
	
	
	@Test
	
	public static String[] getDatafromDatabase() {
		String list[] = new String[3];
		String l = null;
		String dbUrl = "jdbc:mysql://localhost:3306/goalplan";
		String username = "root";
		String password = "amra@123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		Statement stmt = con.createStatement();
		
		
		 

		
		ResultSet rs= stmt.executeQuery("Select goalone,goaltwo,goalthree from goalsheet");
		
		while(rs.next()) {
		list[0]=rs.getString(1);
		list[1] =  rs.getString(2);
		list[2]= rs.getString(3);
		}
		System.out.println(list.toString());
		
		
	    con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// l = list.toString();
		 return list;
		
		
		
	}
  }
	
