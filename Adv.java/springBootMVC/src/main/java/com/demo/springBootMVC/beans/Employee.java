package com.demo.springBootMVC.beans;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	@Id
	private int id;
	private String ename;
	private double sal;
	private Date hireDate;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String ename, double sal, Date string) {
		super();
		this.id = id;
		this.ename = ename;
		this.sal = sal;
		this.hireDate = string;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", sal=" + sal + ", hireDate=" + hireDate + "]";
	}
	
}
