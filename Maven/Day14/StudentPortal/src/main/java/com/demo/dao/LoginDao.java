package com.demo.dao;

import com.demo.beans.User;

public interface LoginDao {

	User authentication(String uname, String password);

}
