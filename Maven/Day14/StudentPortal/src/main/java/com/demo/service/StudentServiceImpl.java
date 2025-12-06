package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentDao sdao;
	@Override
	public List<Student> getAllStudents() {
		return sdao.findAllStudents();
	}
	@Override
	public Student getById(int sid) {
		// TODO Auto-generated method stub
		return sdao.update(sid);
	}

}
