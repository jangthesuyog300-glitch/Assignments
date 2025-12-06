package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Employee;
import com.demo.beans.MyUser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("springconfig.xml");
		MyUser u=(MyUser) ctx.getBean("u1");
		System.out.println(u);
		Employee e =(Employee) ctx.getBean("e1");
		System.out.println(e);

	}

}
