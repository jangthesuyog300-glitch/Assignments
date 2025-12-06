package com.demo.service;

import java.util.Arrays;

public class Mer {

	public static void Mergesort(int[] arr, int start, int end) {
		if(start <end)
		{
			int mid=(start+end)/2;
			
			Mergesort(arr,start,mid);
			Mergesort(arr,mid+1,end);
			
			merge(arr,start,mid,end);
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		if(start <end) {
		//length of left array
		int n1=mid-start+1;
		//length of right array
		int n2=end-mid;
		
		int [] leftarray=new int[n1];
		int [] rightarray=new int [n2];
		
		for(int i=0;i<n1;i++)
		{
			leftarray[i]=arr[start+i];
		}
		for(int i=0;i<n2;i++)
		{
			rightarray[i]=arr[mid+1+i];
		}
		
		int i = 0, j = 0, k = start;
		
		while(i<n1 && j<n2)
		{
			if(leftarray[i]<rightarray[j])
			{
				arr[k]=leftarray[i];
				i++;
				k++;
			}
			else {
				arr[k]=rightarray[j];
				j++;
				k++;
			}
		}
		while(i<n1)
		{
			arr[k]=leftarray[i];
			k++;
			i++;
			
		}
		while(j<n2)
		{
			arr[k]=rightarray[j];
			k++;
			j++;
		}
		
		System.out.println("Start : "+start+" Mid : "+mid+" End : "+end);
		System.out.println(Arrays.toString(arr));
		
		}
	}

}
