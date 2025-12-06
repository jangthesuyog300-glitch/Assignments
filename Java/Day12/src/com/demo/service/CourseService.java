package com.demo.service;

import java.util.*;
import java.util.Map.Entry;

public interface CourseService {

	boolean addNewCourse();

	Map<String, Integer> displayAll();



	int searchByNam(String cname);

	boolean modifyByName(String cname, int newcap);

	Set<String> displayByCapacity(int capacity);

	boolean modifyByCourseName(String oname, String nname);

	Map<String, Integer> sortByName();

	Set<Entry<String, Integer>> sortByCapacity();

	boolean deleteByName(String cname);

	boolean deleteByCapacity(int capa);
	
	
}
