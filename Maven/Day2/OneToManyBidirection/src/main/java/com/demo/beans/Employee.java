package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue
	private int eid;
	private String ename;
	private double sal;
	private LocalDate hiredate;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptNo")
	
	private Department dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String ename, double sal, LocalDate hiredate, Department dept) {
		super();
		this.ename = ename;
		this.sal = sal;
		this.hiredate = hiredate;
		this.dept = dept;
	}

	public Employee(int eid, String ename, double sal, LocalDate hiredate, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.hiredate = hiredate;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", hiredate=" + hiredate + ", dept="
				+ dept + "]";
	}
	

}
