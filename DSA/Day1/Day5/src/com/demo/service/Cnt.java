package com.demo.service;

import java.util.Arrays;

public class Cnt {
	
	private static int FindNthmax(int[] arr) {
		
	
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				
				max=arr[i];
			}
		}
		return max;
	}

	public static int [] sort(int[] arr) {
		
		int max=FindNthmax(arr);
		//create a count array of size max+1
		int [] count=new int [max+1];
		
		//initialize
		for(int i=0;i<count.length;i++)
		{
			count[i]=0;
		}
		//fill with nu occurence
		
		for(int i=0;i<arr.length;i++)
		{
			int pos=arr[i];
			count[pos]++;
		}
		System.out.println();
		System.out.println("Count Array : "+Arrays.toString(count));
		
		//find cummulative sum
		
		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		System.out.println();
		System.out.println("Cummulative sum : "+Arrays.toString(count));
		
		int []output=new int [arr.length];
		
		//place no from arr into o/p array by using cummilative sum
		
		for(int i=0;i<arr.length;i++)
		{
			int pos=arr[i];
			count[pos]--;
			int idx=count[pos];
			output[idx]=arr[i];
		}
		System.out.println(Arrays.toString(output));
		
		
		return output;
		
		
	}

}
