package com.demo.demospring.service;

import java.util.List;

import com.demo.demospring.dto.ProductDto;


public interface ProductService {

	List<ProductDto> getAllProducts();

	boolean addproduct(ProductDto p);

	ProductDto getById(int pid);

	boolean updateproduct(ProductDto p);

	boolean deleteById(int pid);


  
}
