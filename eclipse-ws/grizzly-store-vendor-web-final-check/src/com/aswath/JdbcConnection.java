package com.aswath;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	
	static Connection con=null;
	public static Connection getConnection() 
	{
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grizzly_store","root","root");			
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		return con;
	}

}
