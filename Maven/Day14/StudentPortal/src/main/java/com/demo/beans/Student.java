package com.demo.beans;

import java.time.LocalDate;

public class Student {
	private int sid;
	private String sname;
	private String email;
	private LocalDate dob;
	private String addr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, String email, LocalDate dob, String addr, String password) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.dob = dob;
		this.addr = addr;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", dob=" + dob + ", addr=" + addr
				+ "]";
	}
	
	

}
