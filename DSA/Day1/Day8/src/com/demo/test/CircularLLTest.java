package com.demo.test;
import com.demo.service.*;

public class CircularLLTest {

	public static void main(String[] args) {
		SinglyCircularLLService list=new SinglyCircularLLService();
		list.addNode(10);
		list.addByValue(15, 10);
		list.addByValue(30, 15);
		list.addByPosition(2, 20);
		list.addByPosition(4, 45);
		list.displayData();
		list.deleteByPosition(1);
		list.deleteByValue(45);
		list.deleteByValue(15);
		list.displayData();
	}

}
