package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentServices;

@RestController
public class StudentController {

	@Autowired
	StudentServices sservice; 
	
	@GetMapping("/getall")
	public List<Student> getAll(){
		
		List<Student> list = sservice.getAll();
		for (Student l: list) {
			System.out.println(l.toString());
		}
		
		return list;
	}
}
