package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

public class Test {

	ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
	MyUser u=(MyUser) ctx.getBean("u1");
	
		System.out.println();

	

}
