package com.demo.service;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductServiceimpl implements ProductService{
	   private ProductDao pdao;
	   
	   public ProductServiceimpl() {
		   pdao=new ProductDaoImpl();
	   }

	@Override
	public boolean addNewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr pid");
		int pid=sc.nextInt();
		System.out.println("enter product name");
		String pname=sc.next();
		System.out.println("enetr qty");
		int qty=sc.nextInt();
		System.out.println("enetr price");
		double price=sc.nextDouble();
		System.out.println("enetr mfgdate (dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Product p=new Product(pid,pname,qty,price,ldt);
		return pdao.save(p);
	}

	@Override
	public boolean delete(int pid) {

		
		return pdao.remove(pid);
	}

	@Override
	public boolean modify(int pid) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enetr qty");
		int qty=sc.nextInt();
		System.out.println("enetr price");
		double price=sc.nextDouble();
		
		
		
		return pdao.update(pid,qty,price);
	}

	@Override
	public Product findByid(int pid) {
		// TODO Auto-generated method stub
		return pdao.findbyId(pid);
	}

	@Override
	public List<Product> displayAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}

	@Override
	public List<Product> sortByprice() {
		// TODO Auto-generated method stub
		return pdao.sortP();
	}

	@Override
	public void closeConnection() {
		pdao.CloseConnection();
		
	}

}
