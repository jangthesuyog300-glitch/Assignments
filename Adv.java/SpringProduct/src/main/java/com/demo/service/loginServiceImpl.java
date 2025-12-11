package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.logindao;

@Service
public class loginServiceImpl implements loginService {
	
	@Autowired
	logindao ldao;

}
