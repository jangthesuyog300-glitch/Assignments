package com.demo.service;

import java.util.Arrays;

public class BubbleService {

	public void bubblesort(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
			  if(arr[j-1]>arr[j])
			  {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			  }
			  
			}
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
		
	}

	public void modfbubblesort(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=1;j<arr.length-i;j++)
			{
			  if(arr[j-1]>arr[j])
			  {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				flag=true;
			  }

			}
			if(!flag) {
				  break;
			  }
			
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
		
	}

	public void bubblesortDes(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
			  if(arr[j-1]<arr[j])
			  {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			  }
			  
			}
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
		
	}

	public void modifybubblesortDes(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=1;j<arr.length-i;j++)
			{
			  if(arr[j-1]<arr[j])
			  {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				flag=true;
			  }

			}
			if(!flag) {
				  break;
			  }
			
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
		
	}

	

}
