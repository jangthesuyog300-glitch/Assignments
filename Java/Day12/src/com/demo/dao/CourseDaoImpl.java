package com.demo.dao;

import java.util.*;
import java.util.Map.Entry;

public class CourseDaoImpl implements CourseDao{
	static Map<String,Integer>hm;
	static {
		hm=new HashMap<>();
		hm.put("Dac",120);
		hm.put("Dbda", 150);   
		hm.put("DS", 100); 
	}
	@Override
	public boolean save(String cname, int cp) {
		if(hm.containsKey(cname)) {
			hm.put(cname,cp);
			return true;
		}
		return false;
	}
	@Override
	public Map<String, Integer> display() {
		// TODO Auto-generated method stub
		return hm;
	}
	@Override
	public int findByName(String cname) {
		if(hm.containsKey(cname)) {
			return hm.get(cname);
		}
		else {
			return -1;
		}
	
	}
	@Override
	public boolean updateByName(String cname, int newcap) {
		if(hm.containsKey(cname)) {
			hm.put(cname, newcap);
			return true;
		}
		return false;
	}
	@Override
	public Set<String> findBycapacity(int capacity) {
		Set<String> keys=hm.keySet();
		Set<String> cname=new HashSet();
		for(String s:keys)
		{
			if(hm.get(s)>capacity)
			{
				cname.add(s);
			}
		}
		if(cname.size()>0) {
			
			return cname;
		}
		return null;
	}
	@Override
	public boolean updateByname(String cname, String oname) {
		if(hm.containsKey(oname)) {
			int c =hm.remove(oname);
			hm.put(cname, c);
			return true;
		}
		return false; 
		
	}
	@Override
	public Map<String, Integer> sortName() {
		Map<String,Integer> tmap=new TreeMap<>();
		Set<String> keys =hm.keySet();
		for(String s:keys) {
			tmap.put(s,hm.get(s));
		}
		return tmap;
	}
	@Override
	public Set<Entry<String, Integer>> SortBycapa() {
		Set<Map.Entry<String, Integer>> es=hm.entrySet();
		
		Comparator<Map.Entry<String,Integer>> c=(o1,o2)->{
			return o1.getValue()-o2.getValue();
		};
		Set<Map.Entry<String, Integer>>tset= new TreeSet<>(c);
		
		for(Map.Entry<String,Integer> e:es) {
			tset.add(e);
		}
		
		
		return tset;
	}
	@Override
	public boolean removeByName(String cname) {
		if(hm.containsKey(cname)) {
			hm.remove(cname);
			return true;
		}
		return false;
	}
	@Override
	public boolean removeBycapa(int capa) {
		int cnt=0;
		Set<String> keys=hm.keySet();
		Iterator <String> it=keys.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			if(hm.get(s)==capa)
			{
				it.remove();
				cnt++;
			}
		}
		return cnt>0;
	}

}
