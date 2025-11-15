package com.demo.service;


import java.util.Arrays;

public class QuickSort {
	
	public void quicksort(int[] arr,int start,int end)
	{
		if (start >= end) return; 
		int p=partirion(arr,start,end);
		quicksort(arr,start,p-1);
		quicksort(arr,p+1,end);
	}

	private int partirion(int[] arr, int start, int end) {
		int pivot=start;
		int i=start;
		int j=end;
		
		while(i<j)
		{
			while(i < end && arr[i] <= arr[pivot])
			{
				i++;
			}
			while(j>start && arr[j]>=arr[pivot])
			{
				j--;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}

		
			
		}
		if(j!=pivot)
		{
			int temp=arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Pivot position :"+pivot+" Pivot number :"+arr[pivot]);
		
		System.out.println("Swapping pivot "+arr[pivot]+"j position "+arr[j]);
		System.out.println();
		return j;

	}

}
