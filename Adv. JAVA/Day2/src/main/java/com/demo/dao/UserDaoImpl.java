package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class UserDaoImpl implements UserDao{
	static Connection conn=null;
    static PreparedStatement seluser,updatePass; 
    static {
    	conn=DBUtil.getMyConnection();
    	try {
			seluser=conn.prepareStatement("select * from user where uname=? and pass=?");
			updatePass=conn.prepareStatement("update user set pass=? where uname=? and email=?");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	@Override
	public MyUser checkUser(String uname, String pass) {
		
		try {
			seluser.setString(1, uname);
			seluser.setString(2, pass);
			ResultSet rs=seluser.executeQuery();
			if(rs.next())
			{
				MyUser user=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDate(4).toLocalDate(),rs.getString(5));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	@Override
	public boolean upass(String uname, String email, String pass) {
		try {
			updatePass.setString(1,pass);
			updatePass.setString(2,uname);
			updatePass.setString(3,email);
			
			int n=updatePass.executeUpdate();
			return n>0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
