package com.demo.test;
import com.demo.service.StackList;

public class TestStackList {

	public static void main(String[] args) {
		StackList list =new StackList();
		list.push(10);
		list.push(15);
		list.push(20);
		list.push(25);
		list.push(25);
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		
	}

}
