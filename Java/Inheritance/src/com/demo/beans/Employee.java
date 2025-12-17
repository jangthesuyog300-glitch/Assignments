package com.demo.beans;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person{
	
	private String dept;
	private String desg;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, LocalDate bdate) {
		super(id, name, bdate);
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, LocalDate bdate,String dept, String desg) {
		super(id, name, bdate);
		this.dept = dept;
		this.desg = desg;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	

}
