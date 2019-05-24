package com.aswath.service;

import java.util.List;

import com.aswath.model.ProductModel;

public interface ProductService {
	
	public List<ProductModel> fetchAllProduct();
	
	public int insertNewProduct(ProductModel product);
	
	public ProductModel getProduct(String productname); 

}
