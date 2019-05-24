package com.aswath.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.aswath.JdbcConnection;
import com.aswath.model.LoginModel;
import com.aswath.model.UserModel;

public class LoginDaoImpl implements LoginDao {

	@Override
	public int Login(LoginModel loginModel) {
		
		
		
		Connection con=null;
		int i=0;
		try 
		{
			con=JdbcConnection.getConnection();
			System.out.println("con->>"+con);
			PreparedStatement ps= con.prepareStatement("select username from admin where username=? and password=?" );
			ps.setString(1,loginModel.getUsername());
			ps.setString(2,loginModel.getPassword());
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				i++;				
			}
			System.out.println(i);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		finally 
		{
			try 
			{
				con.close();
				System.out.println("the Connection closed sucessfully");
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		
		return i;
	}

	@Override
	public UserModel FetchUser(String username) {
		
		Connection con=null;
		
		UserModel userModel=null;
		try 
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("Select userid,username,destignition,office,imagesrc from admin where username=?");
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) 
			{
				userModel=new UserModel();
				userModel.setUserid(rs.getInt(1)); 
				userModel.setUsername(rs.getString(2));
				userModel.setDestignition(rs.getString(3));
				userModel.setOffice(rs.getString(4));
				userModel.setImagesrc(rs.getString(5));				
			}			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		finally 
		{
			try 
			{
				con.close();
				System.out.println("the Connection closed sucessfully");
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		return userModel;
	}

}
