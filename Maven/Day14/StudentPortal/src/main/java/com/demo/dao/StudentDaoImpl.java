package com.demo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Student;
@Repository
public class StudentDaoImpl implements StudentDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> findAllStudents() {
		List<Student> plist=jdbcTemplate.query("select * from student", (rs,numrows)->{
			Student s=new Student();
			s.setSid(rs.getInt(1));
			s.setSname(rs.getString(2));
			s.setEmail(rs.getString(3));
			s.setDob(rs.getDate(4).toLocalDate());
			s.setAddr(rs.getString(5));
			return s;
		});
		return plist;
	}
	@Override
	public Student update(int sid) {
		try
		{
			Student s=jdbcTemplate.queryForObject("select * from Student where sid=?", 
					new Object[] {sid},BeanPropertyRowMapper.newInstance(Student.class));
			return s;
		}
		catch(EmptyResultDataAccessException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
