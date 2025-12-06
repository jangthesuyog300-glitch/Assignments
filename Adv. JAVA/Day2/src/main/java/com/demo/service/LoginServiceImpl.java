package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;

public class LoginServiceImpl implements LoginService{
	UserDao ldao;
	

	public LoginServiceImpl() {
		ldao=new UserDaoImpl();
	}


	@Override
	public MyUser ValidateUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return ldao.checkUser(uname,pass);
	}


	@Override
	public boolean upass(String uname, String email, String pass) {
		// TODO Auto-generated method stub
		return ldao.upass(uname,email,pass);
	}

}
