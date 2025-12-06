package com.demo.beans;

public class Faculty {
	private int id;
	private String name;
	private Skill sk;
	private Address add;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int id, String name, Skill sk, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.sk = sk;
		this.add = add;
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
	public Skill getSk() {
		return sk;
	}
	public void setSk(Skill sk) {
		this.sk = sk;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", sk=" + sk + ", add=" + add + "]";
	}
	
	

}
