package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class LoginDaoImpl implements LoginDao{
	static Connection conn=null;
	static PreparedStatement login,register;
	static {
		conn=DBUtil.getMyConnection();
		try {
			login=conn.prepareStatement("select * from cuser where username=? and password=?");
			register=conn.prepareStatement("insert into cuser values(?,?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public MyUser valid(String uname, String pass) {
		try {
			login.setString(1, uname);
			login.setString(2, pass);
			ResultSet rs=login.executeQuery();
			if(rs.next()) {
				MyUser u=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}



	@Override
	public boolean save(MyUser u) {
		try {
			register.setString(1, u.getUname());
			register.setString(2, u.getPass());
			register.setString(3, u.getEmail());
			register.setString(4, u.getGender());
			register.setString(5, u.getHobbies());
			register.setString(6, u.getCity());
			int n= register.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
