package com.demo.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Department;
import com.demo.beans.Employee;

public class TestOneToMany {
	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session= sf.getCurrentSession();
		Transaction tr=session.beginTransaction();
		
		Department d =new Department("Devloper","Yavatmal");
		Department d1 =new Department("Animation","Amaravti");
		
		Employee e=new  Employee("Suyog",20000,LocalDate.of(2026, 02, 12),d);
		Employee e1=new  Employee("Janavi",50000,LocalDate.of(2027, 02, 12),d1);
		Employee e3=new  Employee("Mamata",10000,LocalDate.of(2025, 02, 12),d);
		Employee e4=new  Employee("Astha",50000,LocalDate.of(2028, 02, 12),d1);
		Employee e5=new  Employee("Divya",39000,LocalDate.of(2024, 02, 12),d);
		Set<Employee> eset= new HashSet<>();
		eset.add(e1);
		eset.add(e4);
		Set<Employee> set2=new HashSet<>();
		set2.add(e);
		set2.add(e3);
		set2.add(e5);
		
		d.setEset(set2);
		d1.setEset(eset);
		session.save(e);
		session.save(e1);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(d);
		session.save(d1);
		
		tr.commit();
		session.close();
		sf.close();
	}

}
