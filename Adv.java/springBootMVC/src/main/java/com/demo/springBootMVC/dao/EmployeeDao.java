package com.demo.springBootMVC.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springBootMVC.beans.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
