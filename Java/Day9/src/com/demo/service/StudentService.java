package com.demo.service;

import java.util.List;

import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentD;
import com.demo.dao.StudentDao;

public class StudentService implements StudentS {
	private StudentD eao;
	public StudentService()
	{
		eao=new StudentDao();
	}

	@Override
	public boolean AddStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID ");
		int id=sc.nextInt();
		
		System.out.println("Enter the name ");
		String n =sc.next();
		
		System.out.println("Enter the mark 1");
		float m1=sc.nextFloat();
		
		System.out.println("Enter the mark 2");
		float m2=sc.nextFloat();
		
		Student s= new Student(id,n,m1,m2);
		
		return eao.save(s);
	}



	@Override
	public List<Student> display() {
		
		return eao.Findall();
	}

	

    @Override
    public Student searchById(int eid) {
        return eao.FindById(eid);
    }

	@Override
	public boolean updateMark(int id, float m2) {
		
		return eao.updateMarks(id,m2);
	}

	@Override
	public List<Student> serchByname(String nm) {
		
		return eao.FindByName(nm);
	}

	@Override
	public List<Student> sortByName() {
		// TODO Auto-generated method stub
		return eao.sortByNm();
	}

	@Override
	public List<Student> sortById() {
		// TODO Auto-generated method stub
		return eao.SortById();
	}

	@Override
	public List<Student> sortByMark() {
		// TODO Auto-generated method stub
		return eao.SortByMark();
	}

	



	

}
