package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import com.demo.beans.Customer;
import com.demo.beans.Item;

public class OrderDaoImpl implements OrderDao {
	
	static Map<Customer,List<Item>> hm;
	static {
		hm=new HashMap<>();
		Customer c1 =new Customer(10,"Suyog","12346874");
		List<Item> lst=new ArrayList<>();
		lst.add(new Item(1001,"Chair",35,5678));
		lst.add(new Item(1002,"Table",30,4678));
		hm.put(c1, lst);
		Customer c2=new Customer(11,"Pranav","4444");
		   List<Item> lst1=new ArrayList<>();
		   lst1.add(new Item(1001,"Shelf",40,2678));
		   lst1.add(new Item(1002,"drawer",20,5678));
		   hm.put(c2, lst1);
		
	}

	@Override
	public boolean save(Customer c, List<Item> lst) {
		if(!hm.containsKey(c)) {
			hm.put(c, lst);
			return true; 
		}
		
		return false;
	}

	@Override
	public Map<Customer, List<Item>> findAll() {
		
		return hm;
	}

	@Override
	public Entry<Customer, List<Item>> findById(int id) {
		Set<Map.Entry<Customer,List<Item>>> cset=hm.entrySet();
		for(Map.Entry<Customer,List<Item>> e:cset)
		{
			if(e.getKey().getId()==id)
				return e;
		}
		return null;
	}

	@Override
	public boolean removeById(int id) {
		List<Item>lst=hm.remove(new Customer(id));
		return lst!=null;
	}

	@Override
	public boolean AddItem(int id, Item item) {
		List<Item> lst =hm.get(new Customer(id));
		if(lst!=null)
		{
			lst.add(item);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeItem(int id, int iid) {
		List<Item> lst=hm.get(new Customer(id));
		if(lst!=null)
		{
			return lst.remove(new Item(iid));
		}
		return false;
	}
	
	

}
