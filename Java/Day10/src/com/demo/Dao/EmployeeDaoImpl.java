package com.demo.Dao;

import java.util.List;
import java.io.EOFException;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.ObjectOutputStream;

import com.demo.beans.Employee;
import com.demo.exception.NegativeSalary; 

public class EmployeeDaoImpl implements EmployeeDao  {
	static List<Employee> list;
	
	
	@Override
	public void readData(String fname) {
		File f = new File(fname);
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname));){
			   while(true) {
				   Employee e=(Employee)ois.readObject();
				   list.add(e);
			   }
				
				
			} catch(EOFException e) {
				System.out.println("Reached to end of file");
				
				
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("size: "+list.size());
		
	}

	@Override
	public boolean save(Employee e) {
		list.add(e);
		return true;
	}

	@Override
	public List<Employee> display() {
		
		return list;
	}

	@Override
	public Employee FindById(int eid) {
		int pos =list.indexOf(new Employee(eid));
		if(pos != -1)
		{
			return list.get(pos);
		}
		return null;
	}

	@Override
	public List<Employee> FindByName(String nm) {
		List<Employee> temp= list.stream().filter(emp -> emp.getName().equals(nm))
				.collect(Collectors.toList());
		if(temp.size()>0)
		{
			return temp;
		}
		return null;
	}

	@Override
	public boolean updateById(int eid, double sal) throws NegativeSalary {
		int pos =list.indexOf(new Employee(eid));
		if(pos != -1)
		{
			Employee e=list.get(pos);
			e.setSal(sal);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeById(int eid) {
		
		return list.remove(new Employee(eid));
	}

	@Override
	public boolean DeleteBySal(double sal) {
		
		return list.removeIf(emp->emp.getSal()>sal);
	}

	@Override
	public List<Employee> findBysal(double sal) {
		List<Employee> temp =list.stream().filter(emp->emp.getSal()==sal)
				.collect(Collectors.toList());
		if(temp.size()>0)
		{
			return temp;
		}
		return null;
	}

	@Override
	public List<Employee> SortBySal() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e:list)
		{
			lst.add(e);
		}
		lst.sort(null);
		return lst;
	}

	@Override
	public List<Employee> SortByname() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e : list)
		{
			lst.add(e);
		}
		Comparator<Employee> c=(o1,o2)->{
			
			return o1.getName().compareTo(o2.getName());
		};
		lst.sort(c);
		return null;
	}

	@Override
	public void writeData(String fname) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname))){
			for(Employee e:list) {
				oos.writeObject(e);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
