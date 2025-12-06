package com.demo.beans;

public class Course {
	private int cid;
	private String cname;
	private String cduration;
	
	public Faculty fact;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String cname, String cduration, Faculty fact) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cduration = cduration;
		this.fact = null;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCduration() {
		return cduration;
	}

	public void setCduration(String cduration) {
		this.cduration = cduration;
	}

	public Faculty getFact() {
		return fact;
	}

	public void setFact(Faculty fact) {
		this.fact = fact;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cduration=" + cduration + ", fact=" + fact + "]";
	}
	
	

}
