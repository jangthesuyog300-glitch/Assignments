package com.demo.beans;

import java.time.LocalDate;
import java.util.Date;

public class Person {
	
	private int id;
	private String name;
	private LocalDate bdate;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, LocalDate bdate2) {
		super();
		this.id = id;
		this.name = name;
		this.bdate = bdate2;
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
	public LocalDate getBdate() {
		return bdate;
	}
	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", bdate=" + bdate + "]";
	}
	
	

}
