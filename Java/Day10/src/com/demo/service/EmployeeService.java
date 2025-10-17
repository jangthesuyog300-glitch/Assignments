package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.exception.NegativeSalary;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> displayAll();

	Employee searchById(int eid);

	List<Employee> findByName(String nm);

	boolean updateById(int eid, double sal)  throws NegativeSalary;

	boolean deleteById(int eid);

	boolean deleteBySalary(double sal);

	List<Employee> searchBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

}
