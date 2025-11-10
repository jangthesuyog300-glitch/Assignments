package com.demo.test;
import com.demo.service.*;

public class DoublyCircularLLTest {

	public static void main(String[] args) {
		DoublyCircularLLService list=new DoublyCircularLLService();
		
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
		list.displayData();
		list.addByValue(12, 10);//10 12 20
		//list.addByValue(25,20 );
		list.addByValue(25, 30);
		list.deleteByPosition(1);
		list.displayData();
		list.deleteByValue(40);
		list.displayData();
//		list.displayReverse();
	}
}
