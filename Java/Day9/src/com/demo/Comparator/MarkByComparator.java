package com.demo.Comparator;

import java.util.Comparator;

import com.demo.beans.Student;

public class MarkByComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int) (o1.getM1()-o2.getM1());
	}

}
