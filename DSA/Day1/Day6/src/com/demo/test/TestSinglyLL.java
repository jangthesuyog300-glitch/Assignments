package com.demo.test;
import com.demo.service.SinglyLLService;

public class TestSinglyLL {

	public static void main(String[] args) {
		SinglyLLService list1=new SinglyLLService();
		list1.addNode(12);		
		list1.addNode(10);
		list1.addNode(15);
		list1.addNode(7);
		list1.addNode(2);
		list1.displayData();
		list1.addByPosition(1, 100);
		list1.addByPosition(3, 200);
		list1.addByPosition(8, 300);
		list1.addByPosition(20, 400);
		list1.addBynum(11, 12);
		list1.displayData();
		list1.deleteByValue(12);
		list1.deleteByPosition(7);
		list1.displayData();

		

		
	}

}
