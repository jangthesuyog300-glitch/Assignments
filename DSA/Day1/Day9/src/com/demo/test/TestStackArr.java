package com.demo.test;
import com.demo.service.StackArr;

public class TestStackArr {

	public static void main(String[] args) {
		StackArr arr = new StackArr();
		
		arr.push(11);
		arr.push(20);
		arr.push(21);
		arr.push(40);
		arr.push(60);
		arr.pop();
		arr.pop();
		arr.pop();
		arr.pop();
		arr.pop();
		arr.pop();
	}

}
