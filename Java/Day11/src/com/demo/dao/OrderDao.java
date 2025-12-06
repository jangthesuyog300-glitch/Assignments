package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderDao {

	boolean save(Customer c, List<Item> lst);

	Map<Customer, List<Item>> findAll();

	Entry<Customer, List<Item>> findById(int id);

	boolean removeById(int id);

	boolean AddItem(int id, Item item);

	boolean removeItem(int id, int iid);

}
