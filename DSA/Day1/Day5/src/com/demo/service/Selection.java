package com.demo.service;

import java.util.Arrays;

public class Selection {

	private static int FindNthmin(int[] arr, int start) {
		int minpos=start;
		int min=arr[minpos];
		
		for(int i=start;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				minpos=i;
				min=arr[i];
			}
		}
		return minpos;
	}
	
	public static void sortAsc(int[] arr) {
	     
		for(int i=0;i<arr.length;i++)
		{
			int minpos=FindNthmin(arr,i);
			int temp=arr[i];
			arr[i]=arr[minpos];
			arr[minpos]=temp;
			System.out.println(Arrays.toString(arr));
		}
		
	}

	

	public static void sortDes(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int maxpos=FindNthmax(arr,i);
			int temp=arr[i];
			arr[i]=arr[maxpos];
			arr[maxpos]=temp;
			System.out.println(Arrays.toString(arr));
		}
		
		
	}

	private static int FindNthmax(int[] arr, int start) {
		int maxpos=start;
		int max=arr[maxpos];
		
		for(int i=start;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				maxpos=i;
				max=arr[i];
			}
		}
		return maxpos;
	}

}
