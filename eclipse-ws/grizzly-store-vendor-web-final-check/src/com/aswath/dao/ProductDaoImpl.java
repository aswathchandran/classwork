package com.aswath.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aswath.JdbcConnection;
import com.aswath.model.ProductModel;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<ProductModel> fetchAllProduct() {
		
		Connection con=null;
		List<ProductModel>productList=new ArrayList<ProductModel>();
		try 
		{
			con=JdbcConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select productid,productname,category,description,price,image,brand,rating from products");
			
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1));
				ProductModel productTemp=new ProductModel();
				productTemp.setProductid(rs.getInt(1));
				productTemp.setProductname(rs.getString(2));
				productTemp.setCategory(rs.getString(3));
				productTemp.setDescription(rs.getString(4));
				productTemp.setPrice(rs.getFloat(5));
				productTemp.setBrand(rs.getString(7));
				productTemp.setRating(rs.getFloat(8));
				productTemp.setImage(rs.getString(6));
				productList.add(productTemp);
			}			
		}
		catch (Exception e) {
			System.out.println("==>asa>"+e);
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
		return productList;
	}

}
