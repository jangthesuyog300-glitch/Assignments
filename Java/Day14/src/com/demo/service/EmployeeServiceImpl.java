package com.demo.service;

import com.demo.Dao.EmployeeDao;
import com.demo.Dao.EmployeeDaoImpl;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.*;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	Scanner sc = new Scanner(System.in);
	

	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}


	@Override
	public void readFile(String ename) {
		edao.readData(ename);
	}


	@Override
	public boolean addEmployee() {
		System.out.println("enter id:");
		int id =sc.nextInt();
		System.out.println("enter name:");
		String name = sc.next();
		System.out.println("enter designation:");
		String desg =sc.next();
		System.out.println("enter salary:");
		double sal = sc.nextDouble();
		Employee e =new Employee(id,name,desg,sal);
		return edao.save(e);
	}


	@Override
	public void writeToFile(String string) {
		 edao.writeData(string );
	}


	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}


	@Override
	public boolean modifyById(int id, double sal) {
		// TODO Auto-generated method stub
		return edao.updateBySal(id,sal);
	}


	@Override
	public List<Employee> displayAll() {
		return edao.findAll();
	}


	@Override
	public Employee displayById(int id) {
		return edao.findById(id);
	}

}
 