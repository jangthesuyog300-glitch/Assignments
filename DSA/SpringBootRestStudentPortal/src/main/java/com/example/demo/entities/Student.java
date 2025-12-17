package com.example.demo.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Column
	private String sname;
	@Column
	private String email;
	@Column
	private Date dob;
	@Column
	private String addr;
	
	/*
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, String email, Date dob, String addr) {
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
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
	*/
	
	

}
