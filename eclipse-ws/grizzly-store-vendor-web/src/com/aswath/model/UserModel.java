package com.aswath.model;

public class UserModel {

	private int userid;
	private String username;
	private String destignition;
	private String office;
	private String imagesrc;
	
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public UserModel(int userid, String username, String destignition, String office, String imagesrc) {
		super();
		this.userid = userid;
		this.username = username;
		this.destignition = destignition;
		this.office = office;
		this.imagesrc = imagesrc;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getDestignition() {
		return destignition;
	}


	public void setDestignition(String destignition) {
		this.destignition = destignition;
	}


	public String getOffice() {
		return office;
	}


	public void setOffice(String office) {
		this.office = office;
	}


	public String getImagesrc() {
		return imagesrc;
	}


	public void setImagesrc(String imagesrc) {
		this.imagesrc = imagesrc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
