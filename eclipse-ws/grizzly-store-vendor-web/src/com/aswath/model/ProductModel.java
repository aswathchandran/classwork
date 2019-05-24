package com.aswath.model;

public class ProductModel {


	private int productid;
	private String productname;
	private String category;
	private String description;
	private float price;
	private String image;
	private String brand;
	private float rating;
	
	
	
	public ProductModel() {
		
		System.out.println("Default constructor called and object created");
	}



	public ProductModel(int productid,String productname, String category, String description, float price,
			String image, String brand, float rating) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.category = category;
		this.description = description;
		this.price = price;
		this.image = image;
		this.brand = brand;
		this.rating = rating;
	}
	
	
	public ProductModel(String productname, String category, String description, float price,
			String image, String brand, float rating) {
		super();
		this.productname = productname;
		this.category = category;
		this.description = description;
		this.price = price;
		this.image = image;
		this.brand = brand;
		this.rating = rating;
	}



	public int getProductid() {
		return productid;
	}
	
	


	public void setProductid(int productid) {
		this.productid = productid;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public float getRating() {
		return rating;
	}



	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
	
	



}
