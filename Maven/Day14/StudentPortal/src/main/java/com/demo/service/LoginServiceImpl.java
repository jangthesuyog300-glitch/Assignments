package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.User;
import com.demo.dao.LoginDao;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired	
	LoginDao ldao;
	
	@Override
	public User validateUser(String uname, String password) {

		return ldao.authentication(uname,password);
	}

}
