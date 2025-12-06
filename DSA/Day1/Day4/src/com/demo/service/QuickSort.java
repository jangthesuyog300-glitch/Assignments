package com.demo.service;

import java.util.Arrays;

public class QuickSort {

	
	
	private int partitionAsc(int[] arr, int start, int end) {
		int pivot =start;
		int i=start;
		int j=end;
		
		while(i<j)
		{
			while(i<end && arr[i]<arr[pivot])
			{
				i++;
			}
			while(j>start && arr[j]>arr[pivot])
			{
				j--;
			}
			
			if(i<j)
			{
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}	
			
			if(pivot !=j)
			{
				int temp=arr[pivot];
				arr[pivot]=arr[j];
				arr[j]=temp;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("pivot position : "+j+" Pivot number : "+arr[j]);
			System.out.println(arr[j] + "  Swapped with "+arr[pivot]);
			return j;
		
		
	}
	//Ascending 
	
	public void quickSortAsc(int[] arr, int start, int end) {
		if(start<end) {
		   int p=partitionAsc(arr,start,end);
		   quickSortAsc(arr,start,p-1);
		   quickSortAsc(arr,p+1,end);
		}
	}
	
	//Descending

//	private int partitionDes(int[] arr, int start, int end) {
//	    int pivotIndex = start;
//	    int pivotValue = arr[pivotIndex];
//	    int i = start;
//	    int j = end;
//
//	    while (i < j) {
//	        while (i < end && arr[i] > pivotValue) {
//	            i++;
//	        }
//	        while (j > start && arr[j] < pivotValue) {
//	            j--;
//	        }
//	        if (i < j) {
//	            int temp = arr[i];
//	            arr[i] = arr[j];
//	            arr[j] = temp;
//	        }
//	    }
//
//	    if (pivotIndex != j) {
//	        int temp = arr[pivotIndex];
//	        arr[pivotIndex] = arr[j];
//	        arr[j] = temp;
//	    }
//
//	    return j;
//	}
//
//	public void quickSortDes(int[] arr, int start, int end) {
//	    if (start < end) {
//	        int p = partitionDes(arr, start, end);
//	        quickSortDes(arr, start, p - 1);
//	        quickSortDes(arr, p + 1, end);
//	    }
//	}


	

}
