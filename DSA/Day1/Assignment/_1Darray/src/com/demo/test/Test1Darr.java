package com.demo.test;
import com.demo.service.*;
public class Test1Darr {

	public static void main(String[] args) {
		_1DArray array=new _1DArray();
		
		int []a=array.add(5);
		array.display(a);
		System.out.println();
//		int [] arr=array.addition();
//		array.display(arr);
//		System.out.println();
//		int []arr1=array.P_factorial();
//		array.display(arr1);
		System.out.println(array.maxprime());
		int[] revprime=array.copyarr(a);
		array.display(revprime);
		

	}

}
