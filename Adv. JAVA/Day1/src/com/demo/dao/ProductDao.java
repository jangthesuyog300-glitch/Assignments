package com.demo.dao;

import java.time.LocalDate;
import java.util.List;

import com.demo.beans.Product;

public interface ProductDao  {

	boolean save(Product e);

	boolean remove(int pid);

	boolean update(int pid, int qty, double price);

	Product findbyId(int pid);

	List<Product> findAll();

	List<Product> sortP();

	void CloseConnection();



	

}
