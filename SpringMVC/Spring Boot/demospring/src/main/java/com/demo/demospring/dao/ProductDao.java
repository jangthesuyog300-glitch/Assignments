package com.demo.demospring.dao;

import java.util.List;

import com.demo.demospring.beans.Product;



public interface ProductDao {

	List<Product> findAllProducts();

	boolean save(Product p);

	Product findById(int pid);

	boolean modifyProduct(Product p);

	boolean removeById(int pid);

}
