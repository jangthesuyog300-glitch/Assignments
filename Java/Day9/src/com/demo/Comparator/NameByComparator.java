package com.demo.Comparator;

import java.util.Comparator;

import com.demo.beans.Student;

public class NameByComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

	
}
