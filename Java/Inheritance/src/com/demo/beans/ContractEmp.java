package com.demo.beans;

import java.time.LocalDate;
import java.util.Date;

public class ContractEmp extends Person {
	private float hr;
	private double Charges;
	public ContractEmp(int id, String name, LocalDate ldt,float hr,double Charges) {
		super(id, name, ldt);
		this.hr = hr;
		this.Charges = Charges;
	}
	public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractEmp(int id, String name, LocalDate bdate) {
		super(id, name, bdate);
		// TODO Auto-generated constructor stub
	}
	public float getHr() {
		return hr;
	}
	public void setHr(float hr) {
		this.hr = hr;
	}
	public double getCharges() {
		return Charges;
	}
	public void setCharges(double charges) {
		Charges = charges;
	}
	@Override
	public String toString() {
		return "ContractEmp [hr=" + hr + ", Charges=" + Charges + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getBdate()=" + getBdate() + ", toString()=" + super.toString() +  "]";
	}
	

	
	
	

}
