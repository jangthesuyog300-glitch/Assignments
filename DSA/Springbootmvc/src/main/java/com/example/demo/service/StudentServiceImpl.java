package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Student;
import com.example.demo.dao.StudentDao;



@Service
public class StudentServiceImpl implements StudentService {
    
	@Autowired
    private StudentDao sdao;

    @Override
    public List<Student> getAllstudents() {
        return sdao.findAll();
    }

    @Override
    public Student updateById(int sid) {
        return sdao.findById(sid)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

  

 
  

	@Override
	public void updatestudent(Student s) {
		Optional<Student> op=sdao.findById(s.getSid());
    	if(op.isPresent())
    	{
    		Student s1=op.get();
    		s1.setSname(s.getSname());
    		s1.setEmail(s.getEmail());
    		s1.setDob(s.getDob());
    		s1.setAddr(s.getAddr());
    		sdao.save(s1);
    	}
        sdao.save(s);	
	}

	@Override
	public void delete(int sid) {
		sdao.deleteById(sid);
		
	}

	@Override
	public void addstud(Student stud) {
		sdao.save(stud);
		
	}
}
