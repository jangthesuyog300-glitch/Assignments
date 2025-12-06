package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.*;
public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
		Course c=new Course(1,"DAC","1 Month",null);
		Session session =sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		session.save(c);
		tr.commit();
		session.close();
		sf.close();
		

	}

}
