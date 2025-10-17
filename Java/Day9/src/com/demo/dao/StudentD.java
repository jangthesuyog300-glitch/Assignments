package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentD {

	

	List<Student> Findall();

	boolean save(Student s);

	Student FindById(int eid);

	boolean updateMarks(int id, float m2);

	

	List<Student> FindByName(String nm);

	List<Student> sortByNm();

	List<Student> SortById();

	List<Student> SortByMark();

	

	

}
