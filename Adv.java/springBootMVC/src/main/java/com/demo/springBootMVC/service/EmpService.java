package com.demo.springBootMVC.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springBootMVC.beans.Employee;

@Repository
public interface EmpService {

	List<Employee> getAll();


}
