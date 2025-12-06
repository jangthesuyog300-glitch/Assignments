package com.demo.dao;

import java.util.*;
import java.util.Map.Entry;

public interface CourseDao {

	boolean save(String cname, int cp);

	Map<String, Integer> display();

	int findByName(String cname);

	boolean updateByname(String cname, String oname);

	Set<String> findBycapacity(int capacity);

	boolean updateByName(String cname, int newcap);

	Map<String, Integer> sortName();

	Set<Entry<String, Integer>> SortBycapa();

	boolean removeByName(String cname);

	boolean removeBycapa(int capa);
	

}
