package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmpDao {

	   boolean save(Employee e);
	    boolean savep(Project p);
	    Employee findById(int eid);
	    Employee FindById(int eid);
	    boolean addExtraProject(Project p, Employee e);
	    boolean addExtraProject(int pid, int eid);
	    boolean deleteEmployee(int eid);
	    List<Employee> getAllEmployees();
}
