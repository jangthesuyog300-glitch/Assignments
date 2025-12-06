package com.demo.thread;
import com.demo.beans.Myclass;

public class MyTablePrint extends Thread {
	private int n;
	private Myclass ob;
	public MyTablePrint(int n, Myclass ob) {
		super();
		this.n = n;
		this.ob = ob;
	}
	
	public void run() {
		ob.TablePrint(n);
	}

}
