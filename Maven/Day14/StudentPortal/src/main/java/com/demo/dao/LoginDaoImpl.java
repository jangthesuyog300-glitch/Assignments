package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.User;
@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public User authentication(String uname, String password) {
		try {
		User u1=jdbcTemplate.queryForObject("select * from user where uname=? and pass=?", 
				new Object[] {uname,password},BeanPropertyRowMapper.newInstance(User.class));
		System.out.println(u1);
		return u1;
		}
		catch(EmptyResultDataAccessException e) {
			System.out.println("user not found");
			return null;
		}
	}

}
