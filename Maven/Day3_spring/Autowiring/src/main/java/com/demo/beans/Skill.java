package com.demo.beans;

public class Skill {
	private String sname;
	private int exp;
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(String sname, int exp) {
		super();
		this.sname = sname;
		this.exp = exp;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Skill [sname=" + sname + ", exp=" + exp + "]";
	}
	

}
