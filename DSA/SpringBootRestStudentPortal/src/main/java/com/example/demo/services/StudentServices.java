package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repositories.MyStudent;

@Service
public class StudentServices {
	
	@Autowired
	MyStudent mrepo;
	
	public List<Student> getAll(){
		return mrepo.findAll();
	}


}
