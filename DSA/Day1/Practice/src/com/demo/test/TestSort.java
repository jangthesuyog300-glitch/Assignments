package com.demo.test;
import com.demo.service.*;

public class TestSort {

	public static void main(String[] args) {
		int []arr= {10,12,5,7,15,20,12,9,13};
		QuickSort Q=new QuickSort();
		int start=0;
		int end=arr.length-1;
		Q.quicksort(arr, start,end);
		System.out.println("Sorted (Ascending): " + java.util.Arrays.toString(arr));

	}

}
