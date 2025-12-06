package com.demo.beans;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable{
  private int empid;
  private String ename;
  private String desg;
  private double sal;
public Employee() {
	super();
}
public Employee(int empid, String ename, String desg, double sal) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.desg = desg;
	this.sal = sal;
}



@Override
public boolean equals(Object obj) {

	Employee other = (Employee) obj;
	return empid == other.empid;
}
public Employee(int empid) {
	super();
	this.empid = empid;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + "]";
}
  
}
