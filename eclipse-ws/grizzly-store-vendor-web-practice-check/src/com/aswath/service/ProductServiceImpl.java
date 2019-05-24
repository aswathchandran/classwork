package com.aswath.service;

import java.util.List;

import com.aswath.Dao.ProductDaoImpl;
import com.aswath.model.ProductModel;

public class ProductServiceImpl implements ProductService {

	@Override
	public List<ProductModel> fetchAllProduct() {
		
		return new ProductDaoImpl().fetchAllProduct();
	}

	@Override
	public int insertNewProduct(ProductModel product) {
		
		return new ProductDaoImpl().insertNewProduct(product);
	}

	@Override
	public ProductModel getProduct(String productname) {
		
		return new ProductDaoImpl().getProduct(productname);
	}
	
	
	
	

}
