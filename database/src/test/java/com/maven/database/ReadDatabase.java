package com.maven.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.ArrayList;
import java.util.ArrayList;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import com.mysql.jdbc.Connection;

public class ReadDatabase {
	
   
	@Test
	public static void getDatafromDatabase() {
		ArrayList<String> list = new ArrayList<String>();
		//String l = null;
		//ArrayList<String> list = new ArrayList<String>();
		String dbUrl = "jdbc:mysql://localhost:3306/goalplan";
		String username = "root";
		String password = "amra@123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		Statement stmt = con.createStatement();						
		ResultSet rs= stmt.executeQuery("Select goalone,goaltwo,goalthree from goalsheet");
		
		while(rs.next()) {
			list.add(rs.getString(1));
			list.add(rs.getString(2));
			list.add(rs.getString(2));
		}
		System.out.println(list);
		// l = list.toString();
		
	    con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
	
	
}
