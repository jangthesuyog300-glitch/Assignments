package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.*;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Courses c1=new Courses(11, "PG-DAC", "6 Month", 1);
		Courses c2=new Courses(12,"DBDA","6Month",2);
		Faculty p1=new Faculty("supriya","web Development");
		Faculty p2=new Faculty("sayali","Java");
		session.save(c1);
		session.save(c2);
		session.save(p1);
		session.save(p2);
		tr.commit();
		session.close();
		sf.close();

	}

}
