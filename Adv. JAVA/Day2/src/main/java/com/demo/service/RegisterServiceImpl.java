package com.demo.service;
import com.demo.beans.MyUser;
import com.demo.dao.*;

public class RegisterServiceImpl implements RegisterService {
		static RegisterDao rdao;
		public RegisterServiceImpl() {
			rdao= new RegisterDaoImpl();
		}
	@Override
	public boolean add(MyUser u) {
		// TODO Auto-generated method stub
		return rdao.add(u);
	}

}
