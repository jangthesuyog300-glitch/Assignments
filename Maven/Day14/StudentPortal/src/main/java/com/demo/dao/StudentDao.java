package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	List<Student> findAllStudents();

	Student update(int sid);

}
