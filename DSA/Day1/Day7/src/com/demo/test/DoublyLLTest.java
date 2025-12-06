package com.demo.test;
import com.demo.service.*;

public class DoublyLLTest {

	public static void main(String[] args) {
		DoublyLLService list=new DoublyLLService();
		
		list.addByNode(10);
		list.addByNode(15);
		list.displayData();
		list.addByNode(15);
		list.displayData();
		list.addByValue(12, 15);
		list.displayData();
		list.addByPosition(4, 35);
		list.displayData();
		list.deleteByValue(15);
		list.displayData();
		list.deleteByPosition(4);
		list.displayData();
		
	}

}
