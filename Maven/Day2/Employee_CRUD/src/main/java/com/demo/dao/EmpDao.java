package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmpDao {

	boolean add(Employee e);

	boolean addPro(Project p);

	Employee FindEmp(int eid);

	boolean assign(Employee e, Project p);

	List<Employee> showAllEmp();

	boolean update(int id, double sal);

	boolean remove(int id);

}
