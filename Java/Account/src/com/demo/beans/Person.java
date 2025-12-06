package com.demo.beans;

public class Person {
	private String name;
	private String Lname;
	private String M;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getM() {
		return M;
	}
	public void setM(String m) {
		M = m;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person(String name, String lname, String m, String email) {
		super();
		this.name = name;
		Lname = lname;
		M = m;
		this.email = email;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", Lname=" + Lname + ", M=" + M + ", email=" + email + "]";
	}
}
