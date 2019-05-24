package com.aswath.Dao;

import com.aswath.model.LoginModel;
import com.aswath.model.UserModel;

public interface LoginDao {
	
	
	public int Login(LoginModel loginModel);
	
	
	public UserModel FetchUser(String username);

}
