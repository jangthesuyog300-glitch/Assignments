package com.demo.SpringBootRestWebService.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootRestWebService.beans.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

	Optional<Student> findAllById(int sid);

}
