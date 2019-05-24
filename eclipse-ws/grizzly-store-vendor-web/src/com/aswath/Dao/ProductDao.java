package com.aswath.Dao;

import java.util.List;

import com.aswath.model.ProductModel;

public interface ProductDao {

	public List<ProductModel> fetchAllProduct();
	
	public int insertNewProduct(ProductModel product);
	
	public ProductModel getProduct(String productname);


}
