package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderService {

	boolean addcustomer();

	Map<Customer, List<Item>> Display();



	Entry<Customer, List<Item>> FindByCust(int id);

	boolean DeleteById(int id);

	boolean AddItem(int id);

	boolean AddItem(int id, Item item);

	boolean DeletedItem(int id, int iid);

}
