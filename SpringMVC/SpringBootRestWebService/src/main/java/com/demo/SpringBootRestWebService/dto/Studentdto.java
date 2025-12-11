package com.demo.SpringBootRestWebService.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Studentdto {
	private int sid;
	private String sname;
	private String email;
	private String dob;
	private String addr;
	public Studentdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentdto(int sid, String sname, String email, String dob, String addr) {
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
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
		return "Studentdto [sid=" + sid + ", sname=" + sname + ", email=" + email + ", dob=" + dob + ", addr=" + addr
				+ "]";
	}
	
	
}
