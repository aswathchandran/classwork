package com.aswath.service;

import java.util.List;

import com.aswath.dao.ProductDaoImpl;
import com.aswath.model.ProductModel;

public class ProductServiceImpl implements ProductService {

	@Override
	public List<ProductModel> fetchAllProduct() {
		return new ProductDaoImpl().fetchAllProduct();
	}

}
