package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MyUser21")
public class MyUser {
	@Id
	private int id;
	private String uname;
	private String mob;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="addrid")
	Address addr;
	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyUser(int id, String uname, String mob, Address addr) {
		super();
		this.id = id;
		this.uname = uname;
		this.mob = mob;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", uname=" + uname + ", mob=" + mob + ", addr=" + addr + "]";
	}
	
	

}
