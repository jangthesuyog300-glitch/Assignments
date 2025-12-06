package com.demo.Dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.exception.NegativeSalary;

public interface EmployeeDao {
	void readData(String fname);

	boolean save(Employee e);

	List<Employee> display();

	Employee FindById(int eid);

	List<Employee> FindByName(String nm);

	boolean updateById(int eid, double sal) throws NegativeSalary;

	boolean removeById(int eid);

	boolean DeleteBySal(double sal);

	List<Employee> findBysal(double sal);

	List<Employee> SortBySal();

	List<Employee> SortByname();
	void writeData(String fname);

}
