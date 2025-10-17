package com.demo.beans;

import java.util.Objects;

public class Customer {
	private int id;
	private String Name;
	private String mob;
	public Customer() {
		super();
	}
	public Customer(int id, String name, String mob) {
		super();
		this.id = id;
		Name = name;
		this.mob = mob;
	}
	
	public Customer(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
	    return this.id==((Customer)obj).id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + ", mob=" + mob + "]";
	}

	

}
