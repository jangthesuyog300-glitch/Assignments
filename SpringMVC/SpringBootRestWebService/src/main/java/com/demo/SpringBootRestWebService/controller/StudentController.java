package com.demo.SpringBootRestWebService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootRestWebService.dto.Studentdto;
import com.demo.SpringBootRestWebService.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService sservice;
	
	@GetMapping("/student")
	public ResponseEntity<List<Studentdto>> getAllStudents(){
		List<Studentdto> slist=sservice.getAllstudents();
		return ResponseEntity.ok(slist);
	}
	
	@PostMapping("/student")
	public ResponseEntity<String> addStudent(@RequestBody Studentdto s){
		boolean status=sservice.addstudent(s);
		if(status) {
			return ResponseEntity.ok("data added successfully");
		}
		else {
			return ResponseEntity.ok("Error occurred");
		}
	}
	
	@GetMapping("/student/{sid}")
	public ResponseEntity<Studentdto> getById(@PathVariable int sid ){
		Studentdto s=sservice.getById(sid);
		if(s!=null) {
			return ResponseEntity.ok(s);
		}
		else {
			return (ResponseEntity<Studentdto>) ResponseEntity.notFound(); 
		}
	}
	
	@PutMapping("/student/{sid}")
	public ResponseEntity<String> updateStudent(@RequestBody Studentdto s){
		boolean status=sservice.updatestudent(s);
		if(status) {
			return ResponseEntity.ok("data update successfully");
		}
		else {
			return ResponseEntity.ok("Error occurred");
		} 
	}
}
