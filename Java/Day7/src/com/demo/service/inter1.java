package com.demo.service;

public interface inter1 {
	int m1();
	int m2(int x);
	private void m5() {
		System.out.println("Some part of the m3 and m4");
	}
	default int m3()
	{
		m5();
		System.out.println("in m3 method ");
		return 10;
	}
	default int m4()
	{
		m5();
		System.out.println("in m3 method ");
		return 20;
	}
	public static void Myfuction()
	{
		System.out.println("My function");
	}

}
