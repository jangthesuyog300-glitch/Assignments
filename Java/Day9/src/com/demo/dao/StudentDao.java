package com.demo.dao;
import java.util.*;
import java.util.stream.Collectors;

import com.demo.beans.Student;


public class StudentDao implements StudentD{
	static List<Student> elist;
	static {
		elist=new ArrayList<>();
	}
	

	@Override
	public List<Student> Findall() {
		
		return elist;
	}


	@Override
	public boolean save(Student s) {
		elist.add(s);
		return true;
	}


	@Override
	public Student FindById(int eid) {
		int pos = elist.indexOf(new Student(eid));
        if (pos != -1) {
            return elist.get(pos);
        }
        return null;
	}


	@Override
	public boolean updateMarks(int id,  float m1) {
		int pos = elist.indexOf(new Student(id));
		if(pos !=-1)
		{
			Student e =elist.get(pos);
			e.setM1(m1);
			return true;
		}
		return false;
	}


	@Override
	public List<Student> FindByName(String nm) {
		List<Student> temp = elist.stream()
				.filter(emp -> emp.getName().equals(nm))
				.collect(Collectors.toList());
		return temp;
	}


	@Override
	public List<Student> sortByNm() {
		List<Student> lst=new ArrayList<>();
				
	    for(Student s:elist)
		    {
				lst.add(s);
			}
				
		Comparator<Student> c=(o1,o2)->
		{
			return o1.getName().compareTo(o2.getName());
		};
		lst.sort(c);
		return lst;
		
	}


	@Override
	public List<Student> SortById() {

        List<Student> lst =new ArrayList<>();
        for(Student s:elist)
        {
        	lst.add(s);
        }
	
	lst.sort(Comparator.comparingInt(Student::getId));
		return lst;
	}


	@Override
	public List<Student> SortByMark() {
		List<Student> lst =new ArrayList<>();
        for(Student s:elist)
        {
        	lst.add(s);
        }
	
	lst.sort(Comparator.comparing(Student::getM1));
		return lst;
	}
}

