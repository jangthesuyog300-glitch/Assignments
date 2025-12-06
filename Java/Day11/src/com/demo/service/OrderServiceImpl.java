package com.demo.service;

import com.demo.dao.OrderDao;
import com.demo.dao.OrderDaoImpl;
import java.util.Scanner;
import com.demo.beans.Customer;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.demo.beans.Item;

public class OrderServiceImpl implements OrderService {
	
	public OrderDao odao;
	

	public OrderServiceImpl() {
		super();
		odao = new OrderDaoImpl();
	}


	@Override
	public boolean addcustomer() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter mobail No: ");
		String m=sc.next();
		
		Customer c=new Customer(id,name,m);
		List<Item> lst=new ArrayList<>();
		String ans=null;
		
		
		do {
			System.out.println("Item Id");
			int iid=sc.nextInt();
			System.out.println("Item Name");
			String inm=sc.next();
			System.out.println("Item Quntity");
			int qty=sc.nextInt();
			System.out.println("Item Price");
			double price=sc.nextInt();
			Item item=new Item(id,inm,qty,price);
			lst.add(item);
			System.out.println("Do you want to continue(y/n)?");
			ans=sc.next();
		}while(ans.equals("y"));
		return odao.save(c,lst);
	}


	@Override
	public Map<Customer, List<Item>> Display() {
		// TODO Auto-generated method stub
		return odao.findAll();
	}




	@Override
	public Entry<Customer, List<Item>> FindByCust(int id) {
		
		return odao.findById(id);
	}


	@Override
	public boolean DeleteById(int id) {
		
		return odao.removeById(id);
	}


	@Override
	public boolean AddItem(int id) {
		
		return false;
	}


	@Override
	public boolean AddItem(int id, Item item) {
		// TODO Auto-generated method stub
		return odao.AddItem(id,item);
	}


	@Override
	public boolean DeletedItem(int id, int iid) {
		// TODO Auto-generated method stub
		return odao.removeItem(id,iid);
	}


}
