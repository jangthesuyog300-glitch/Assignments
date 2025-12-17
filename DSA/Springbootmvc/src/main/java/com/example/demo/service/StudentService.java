package com.example.demo.service;

import java.util.List;

import com.example.demo.beans.Student;





public interface StudentService {

	List<Student> getAllstudents();



	Student updateById(int sid);

	void updatestudent(Student s);



	void delete(int sid);



	void addstud(Student stud);

	

	

}
