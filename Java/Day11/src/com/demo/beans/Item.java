package com.demo.beans;

public class Item {

	private int iid;
    private String iname;
	private int qyt;
	private double price;
	public Item() {
		super();
	}
	public Item(int iid, String iname, int qyt, double price) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.qyt = qyt;
		this.price = price;
	}
	
	public Item(int iid) {
		super();
		this.iid = iid;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getQyt() {
		return qyt;
	}
	public void setQyt(int qyt) {
		this.qyt = qyt;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", qyt=" + qyt + ", price=" + price + "]";
	}
	
	
}
