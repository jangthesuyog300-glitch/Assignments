package com.demo.beans;

public class Student implements Comparable<Student>{
	private int Id;
	private String name;
	private float m1,m2;
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getM1() {
		return m1;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public Student(int Id, String name, float m1, float m2) {
		super();
		this.Id = Id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
	}
	public Student(int Id) {
        this.Id = Id;
    }
	 public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Student student = (Student) obj;
	        return Id == student.Id;
	    }
	@Override
	public String toString() {
		return "Student [id=" + Id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return (int)(this.Id-o.Id);
	}

}
