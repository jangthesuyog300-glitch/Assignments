package com.demo.SpringBootRestWebService.service;

import java.util.List;

import com.demo.SpringBootRestWebService.dto.Studentdto;

public interface StudentService {

	List<Studentdto> getAllstudents();

	boolean addstudent(Studentdto s);

	Studentdto getById(int sid);

	boolean updatestudent(Studentdto s);

}
