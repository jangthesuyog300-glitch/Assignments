package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.demo.Dao.EmployeeDao;
import com.demo.Dao.EmployeeDaoImpl;
import com.demo.beans.Employee;
import com.demo.exception.NegativeSalary;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
private EmployeeDao edao;
Scanner sc=new Scanner(System.in);
    
    
	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}
 
	@Override
	public boolean addNewEmployee() {
		
		System.out.println("Enter Name");
		String nm=sc.next();
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		System.out.println("Joining Date (dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=new Employee(id,nm,sal,ldt);
		return edao.save(e);
	}

	@Override
	public List<Employee> displayAll() {
		
		return edao.display();
	}

	@Override
	public Employee searchById(int eid) {
		
		return edao.FindById(eid);
	}

	@Override
	public List<Employee> findByName(String nm) {
		
		return edao.FindByName(nm);
	}

	@Override
	public boolean updateById(int eid, double sal) throws NegativeSalary {
		
		return edao.updateById(eid,sal);
	}

	@Override
	public boolean deleteById(int eid) {
		
		return edao.removeById(eid);
	}

	@Override
	public boolean deleteBySalary(double sal) {
		
		return edao.DeleteBySal(sal);
	}

	@Override
	public List<Employee> searchBySal(double sal) {
		
		return edao.findBysal(sal);
	}

	@Override
	public List<Employee> sortBySal() {
		
		return edao.SortBySal();
	}

	@Override
	public List<Employee> sortByName() {
		
		return edao.SortByname();
	}

}
