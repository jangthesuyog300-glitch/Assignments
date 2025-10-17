package com.demo.beans;

public class TestClass {
	public static int add(int x,int y) {
		return x+y;
	}
	public static float add(float x,float y) {
		return x+y;
	}
	
	public static int add(int x,int...arr)
	{
		int sum=x;
		for(int a:arr)
		{
			sum+=a;
		}
		return sum;
	}
}
