package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void readFile(String string);

	boolean addEmployee();

	void writeToFile(String string);

	boolean deleteById(int id);

	boolean modifyById(int id, double sal);

	List<Employee> displayAll();

	Employee displayById(int id);

}
