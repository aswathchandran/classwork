package com.aswath.dao;

import java.util.List;

import com.aswath.model.ProductModel;

public interface ProductDao {
	
	public List<ProductModel> fetchAllProduct();
	
}
