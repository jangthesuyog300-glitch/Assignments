package com.demo.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.*;

public class Test {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Course c1=new Course(1,"PG-DAC","6 Months",null);
		Course c2=new Course(2,"DBDA","6 Months",null);
		
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(c1);
		session.save(c2);
		tr.commit();
		session.close();
		sf.close();

	}

}
