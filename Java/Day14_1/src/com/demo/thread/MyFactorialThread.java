package com.demo.thread;
import com.demo.beans.Myclass;


public class MyFactorialThread extends Thread{
	private int n;
	private Myclass ob;
	public MyFactorialThread(int n, Myclass ob) {
		super();
		this.n = n;
		this.ob = ob;
	}
	public void run() {
		int ans =ob.factorial(n);
		System.out.println("Factorial: "+ans);
	}
	

}
