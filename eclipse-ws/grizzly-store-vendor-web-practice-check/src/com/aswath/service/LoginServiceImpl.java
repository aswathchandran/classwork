package com.aswath.service;


import com.aswath.Dao.LoginDaoImpl;
import com.aswath.model.LoginModel;
import com.aswath.model.UserModel;

public  class LoginServiceImpl implements LoginService {

	@Override
	public int Login(LoginModel loginModel) {
		return new LoginDaoImpl().Login(loginModel);
	}

	@Override
	public UserModel FetchUser(String username) {
		
		return new LoginDaoImpl().FetchUser(username);
	}

}
