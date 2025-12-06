package com.demo.beans;
import com.demo.exception.*;


import java.time.LocalDate;

public class Employee {
	private int id;
	private String name;
	private double sal;
	private LocalDate data;
	public Employee() {
		super();
	
	}
	public Employee(int id, String name, double sal, LocalDate data) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.data = data;
	}
	
	public Employee(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) throws NegativeSalary {
		 if(sal<0)
		 {
			 throw new NegativeSalary("Negative salary");
		 }
		 else if(sal<2000)
		 {
			 throw new NegativeSalary("Salary  greter than 2000 ");
		 }
			this.sal = sal;
			

		
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", data=" + data + "]";
	}
	


}
