package com.demo.Dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void readData(String ename);

	boolean save(Employee e);

	void writeData(String string);

	boolean removeById(int id);

	boolean updateBySal(int id, double sal);

	List<Employee> findAll();

	Employee findById(int id);

}
