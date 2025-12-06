package com.demo.Dao;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.io.ObjectInputStream;
import com.demo.beans.*;
import java.util.ArrayList;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> lst;
	static {
		lst = new ArrayList<>();
	}

	@Override
	public void readData(String fname) {
		File f = new File(fname);
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname));){
			   while(true) {
				   Employee e=(Employee)ois.readObject();
				   lst.add(e);
			   }
				
				
			} catch(EOFException e) {
				System.out.println("Reached to end of file");
				
				
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("readFNF");
			} catch (IOException e) {
				
				System.out.println("readIOE");
			} catch (ClassNotFoundException e) {
		
				System.out.println("CNF");
			}
		}
		System.out.println("size: "+lst.size());
		
	}

	@Override
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		return lst.add(e);
	}

	@Override
	public void writeData(String string) {
		try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(string))){
			for(Employee e:lst) {
				oos.writeObject(e);
			}
		} catch (FileNotFoundException e1) {

			System.out.println("file not found");
		} catch (IOException e1) {
		
			System.out.println("ioexception");
		}
	}

	@Override
	public boolean removeById(int id) {
		
		return lst.remove(new Employee(id));
	}

	@Override
	public boolean updateBySal(int id, double sal) {
		int pos = lst.indexOf(new Employee(id));
		if(pos != -1) {
			lst.get(pos).setSal(sal);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> findAll() {
		return lst;
	}

	@Override
	public Employee findById(int id) {
		int pos=lst.indexOf(new Employee(id));
		if(pos!=-1) {
			return lst.get(pos);
		}
		
		return null;
	}

	

}
