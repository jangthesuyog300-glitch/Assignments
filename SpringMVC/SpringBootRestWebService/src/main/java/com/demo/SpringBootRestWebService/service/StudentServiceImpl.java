package com.demo.SpringBootRestWebService.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.SpringBootRestWebService.beans.Student;
import com.demo.SpringBootRestWebService.dao.StudentDao;
import com.demo.SpringBootRestWebService.dto.Studentdto;
import com.demo.SpringBootRestWebService.mapper.*;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao sdao;

	@Override
	public List<Studentdto> getAllstudents() {
		List<Student> slist=sdao.findAll();
		List<Studentdto> slist1=slist.stream()
				.map(stud->StudentdtoMapper.maptostudentdto(stud))
				.collect(Collectors.toList());
		return slist1;
	}
	
	@PostMapping("/student")
	public boolean addstudent(Studentdto s) {
		Student stud=StudentdtoMapper.maptostudent(s);
		Student s1=sdao.save(stud);
		return s1!=null;
	}

	@Override
	public Studentdto getById(int sid) {
		Optional<Student> s=sdao.findById(sid);
		if(s.isPresent()) {
			Studentdto stud=StudentdtoMapper.maptostudentdto(s.get());
			return stud;
		}
		return null;
	}

	

	@Override
	public boolean updatestudent(Studentdto s) {
		
		Student stud=StudentdtoMapper.maptostudent(s);
		Optional<Student> op=sdao.findAllById(s.getSid());
		
		if(op.isPresent())
		{
			Student st=op.get();
			st.setSname(s.getSname());
			st.setEmail(s.getEmail());
			st.setAddr(s.getAddr()s);
		}
		return false;
	}
}
