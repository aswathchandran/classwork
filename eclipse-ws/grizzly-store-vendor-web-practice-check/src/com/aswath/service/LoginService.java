package com.aswath.service;



import com.aswath.model.LoginModel;
import com.aswath.model.UserModel;

public interface LoginService {
	
	
	
	public int Login(LoginModel loginModel);
	
	public UserModel FetchUser(String username);
	
}
