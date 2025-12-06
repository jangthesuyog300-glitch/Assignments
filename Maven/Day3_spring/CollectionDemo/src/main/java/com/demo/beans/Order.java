package com.demo.beans;

import java.util.List;

public class Order {
	private int ord_id;
	private String oname;
	List<Product> plist;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int ord_id, String oname, List<Product> plist) {
		super();
		this.ord_id = ord_id;
		this.oname = oname;
		this.plist = plist;
	}
	public int getOrd_id() {
		return ord_id;
	}
	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Order [ord_id=" + ord_id + ", oname=" + oname + ", plist=" + plist + "]";
	}
	

}
