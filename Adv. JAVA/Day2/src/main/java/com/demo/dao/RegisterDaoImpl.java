package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import com.demo.beans.MyUser;

public class RegisterDaoImpl implements RegisterDao {
	static Connection conn=null;
	static PreparedStatement adduser;
	static {
		conn=DBUtil.getMyConnection();
		try {
			adduser=conn.prepareStatement("insert into user values(?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

	@Override
	public boolean add(MyUser u) {
		try {
			adduser.setString(1, u.getUname());
			adduser.setString(2, u.getPass());
			adduser.setString(3, u.getRole());
			adduser.setDate(4, java.sql.Date.valueOf(u.getDate()));
			adduser.setString(5, u.getEmail());
			int n=adduser.executeUpdate();
			return n>0;
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
