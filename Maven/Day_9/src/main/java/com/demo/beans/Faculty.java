package com.demo.beans;

public class Faculty {
	private int fid;
	private String fname;
	private String skill;
	private Course cor;
	public Faculty() {
		super();
	}
	
	public Faculty(int fid, String fname, String skill, Course cor) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.skill = skill;
		this.cor = cor;
	}

	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Course getCor() {
		return cor;
	}
	public void setCor(Course cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", skill=" + skill + ", cor=" + cor + "]";
	}
	
	
	

}
