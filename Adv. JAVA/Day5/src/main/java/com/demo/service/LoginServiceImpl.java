package com.demo.service;
import com.demo.dao.*;

import com.demo.beans.MyUser;

public class LoginServiceImpl implements LoginService {
		static LoginDao ldao;
		
		public LoginServiceImpl() {
			ldao=new LoginDaoImpl();
		}
	@Override
	public MyUser validateuser(String uname, String pass) {
		// TODO Auto-generated method stub
		return ldao.valid(uname,pass);
	}
	
	@Override
	public boolean adduser(MyUser u) {
		// TODO Auto-generated method stub
		return ldao.save(u);
	}

}
