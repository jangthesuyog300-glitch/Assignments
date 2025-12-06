package com.demo.thread;
import com.demo.beans.*;
public class MyPrimeThread extends Thread {
	private int n;
	private Myclass ob;
	public MyPrimeThread(int n, Myclass ob) {
		super();
		this.n = n;
		this.ob = ob;
	}
	
	public void run() {
		boolean status=ob.isPrime(n);
		System.out.println(status);
	}
}
