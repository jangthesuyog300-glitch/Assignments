package com.demo.service;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;

public class CourseServiceImpl implements CourseService {
	  private CourseDao cdao;
	 public CourseServiceImpl() {
		 super();
		 this.cdao = new CourseDaoImpl(); 
	 }
	@Override
	public boolean addNewCourse() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter course name:");
		String cname = sc.next();
		System.out.println("enter course capacity:");
		int cp =sc.nextInt();
		return cdao.save(cname,cp);
	}
	@Override
	public Map<String, Integer> displayAll() {
		return cdao.display();
		
	}
	@Override
	public int searchByNam(String cname) {
	
		return cdao.findByName(cname);
	}
	@Override
	public boolean modifyByName(String cname, int newcap) {
		return cdao.updateByName(cname,newcap);
	}
	@Override
	public Set<String> displayByCapacity(int capacity) {
	
		return cdao.findBycapacity(capacity);
	}
	@Override
	public boolean modifyByCourseName(String oname, String nname) {

		return cdao.updateByname(nname, oname);
	}
	@Override
	public Map<String, Integer> sortByName() {

		return cdao.sortName();
	}
	@Override
	public Set<Entry<String, Integer>> sortByCapacity() {
		
		return cdao.SortBycapa();
	}
	@Override
	public boolean deleteByName(String cname) {

		return cdao.removeByName(cname);
	}
	@Override
	public boolean deleteByCapacity(int capa) {
	
		return cdao.removeBycapa(capa);
	}


}

