package com.aswath.model;

public class VendorListModel {
	
	
	private int productid;
	private int quantity;
	
	
	
	
	public VendorListModel(int productid, int quantity) {
		super();
		this.productid = productid;
		this.quantity = quantity;
	}
	
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
