package com.aswath.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aswath.JdbcConnection;
import com.aswath.model.InventoryModel;
import com.aswath.model.VendorListModel;
import com.aswath.model.VendorModel;

public class VendorDaoImpl implements VendorDao {

	@Override
	public int login(VendorModel vendor) {
		Connection con=null;
		int i=0;
		try 
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select username from vendor where username=? and password=?");
			ps.setString(1,vendor.getUsername());
			ps.setString(2,vendor.getPassword());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) 
			{
				i++;
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
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		return i;
	}

	@Override
	public VendorModel fetchVendor(String username) {
		Connection con=null;
		VendorModel tempvendor=new VendorModel();
		try 
		{
			con=JdbcConnection.getConnection();
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery("select vendorid,username,contact,adderess from vendor ");
			while(rs.next()) 
			{
				tempvendor.setVendorid(rs.getInt(1));
				tempvendor.setUsername(rs.getString(2));
				tempvendor.setContact(rs.getString(3));
				tempvendor.setAddress(rs.getString(4));
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try 
			{
				con.close();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		return   tempvendor;
	}

	@Override
	public int addVendorList(VendorListModel vendorListModel) {
		Connection con=null;
		int i=0;
		try 
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into vendorlist(productid,quantity)values(?,?)");
			ps.setInt(1, vendorListModel.getProductid());
			ps.setInt(2, vendorListModel.getQuantity());
			i=ps.executeUpdate();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally 
		{
			try 
			{
				con.close();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		
		return i;
	}

	@Override
	public List<InventoryModel> inventorylist() {
		Connection con=null;
		List<InventoryModel> inventoryList=new ArrayList<>();
		try 
		{
			con=JdbcConnection.getConnection();
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery("select products.productname,products.availablity,vendorlist.quantity as required,products.price,products.rating from products left join vendorlist ON products.productid=vendorlist.productid ");
			while(rs.next()) 
			{
				InventoryModel temp=new InventoryModel();
				temp.setProductname(rs.getString(1));
				temp.setAvailablity(rs.getInt(2));
				temp.setRequired(rs.getInt(3));
				temp.setPrice(rs.getFloat(4));
				temp.setPrice(rs.getFloat(5));
				inventoryList.add(temp);
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
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		return inventoryList;
	}

}
