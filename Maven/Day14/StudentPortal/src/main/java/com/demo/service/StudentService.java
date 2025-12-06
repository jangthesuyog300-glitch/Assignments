package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	List<Student> getAllStudents();


	Student getById(int sid);

}
