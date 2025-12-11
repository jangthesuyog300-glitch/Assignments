package com.demo.SpringBootRestWebService.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.SpringBootRestWebService.beans.Student;
import com.demo.SpringBootRestWebService.dto.Studentdto;

public class StudentdtoMapper {
	
	public static  Student maptostudent(Studentdto s) {
		return new Student(s.getSid(),s.getSname(),s.getEmail(),LocalDate.parse(s.getDob(),DateTimeFormatter.ofPattern("dd/MM/yyyy")),s.getAddr());

	}
	public static Studentdto maptostudentdto(Student s) {
		if(s.getDob()!=null) {
			return new Studentdto(s.getSid(),s.getSname(),s.getEmail(),s.getDob().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),s.getAddr());
		}
		return new Studentdto(s.getSid(),s.getSname(),s.getEmail(),null,s.getAddr());

	}
	
}
