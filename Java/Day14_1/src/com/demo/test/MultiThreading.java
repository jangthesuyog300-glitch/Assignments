package com.demo.test;
import com.demo.thread.*;
import com.demo.beans.*;
import com.demo.thread.MyFactorialThread;
import com.demo.thread.MyPrimeThread;
import com.demo.thread.MyTablePrint;

public class MultiThreading {

	public static void main(String[] args) {
		Myclass ob=new Myclass();
		
		MyFactorialThread mf = new MyFactorialThread(5, ob);
		mf.start();
		MyTablePrint tp=new MyTablePrint(7, ob);
		tp.start();
		
		MyTablePrint tp1=new MyTablePrint(28, ob);
		tp1.start();
		MyPrimeThread pt=new MyPrimeThread(199, ob);
		pt.start();
		
		//Thread th = new Thread(pt);
		try {
			mf.join();
			tp.join();
			pt.join();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
