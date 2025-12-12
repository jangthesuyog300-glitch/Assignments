package com.demo.springBootMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springBootMVC.beans.Employee;
import com.demo.springBootMVC.dao.EmployeeDao;

@Service
public  class EmpServiceImpl implements EmpService{
    @Autowired
    EmployeeDao edao;
	@Override
	public List<Employee> getAll() {
		
		return edao.findAll();
	}
	
	
		
	
	}
	
	


