package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentS {

	boolean AddStudent();

	List<Student> display();

	Student searchById(int eid);

	boolean updateMark(int id,  float m2);



	List<Student> serchByname(String nm);

	List<Student> sortByName();

	List<Student> sortById();

	List<Student> sortByMark();

}
