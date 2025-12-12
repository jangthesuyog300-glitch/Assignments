package com.demo.springBootMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.springBootMVC.beans.Employee;
import com.demo.springBootMVC.service.EmpService;
@Controller
@RequestMapping("/show")
public class EmployeeController {
	@Autowired
	EmpService eserv;
	
	@GetMapping("/emp")
	public ModelAndView getall()
	{
		List<Employee> elist =eserv.getAll();
		return new ModelAndView("showEmp","elist",elist);
	}
	
	
	
	

}
