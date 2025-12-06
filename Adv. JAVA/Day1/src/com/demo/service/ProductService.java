package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {
	boolean addNewProduct();

	boolean delete(int pid);

	boolean modify(int pid);

	Product findByid(int pid);

	List<Product> displayAll();

	List<Product> sortByprice();

	void closeConnection();

}
