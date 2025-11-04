package com.demo.service;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public int nonRecursiveInt(int num, int[] temp) {
		int low=0;
		int high=temp.length-1;
		int cnt=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			cnt++;
			if(temp[mid]==num)
			{
				System.out.println("comparision are "+cnt);
				return mid;
			}
			else if(num<temp[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;
	}

	public int RecursiveInt(int num, int[] temp,int low,int high) {
		
		System.out.println("Binary search called "+low+"--->"+high);
		if(low<=high)
		{
			int mid =(low+high)/2;
			if(temp[mid]==num)
			{
				return mid;
			}else if(num<temp[mid])
			{
				return RecursiveInt(num,temp,low,mid-1);
			}
			else
			{
				return RecursiveInt(num,temp,mid+1,high);
			}
		}
		
		return -1;
	}



	public int nonRecursiveStr(String num, String[] temp) {
	    int low = 0;
	    int right = temp.length - 1;
	    
	    
	    Arrays.sort(temp);

	    while (low <= right) {
	        int mid = low + (right - low) / 2;
	        int compare = temp[mid].compareTo(num);

	        if (compare == 0) {
	            return mid; 
	        } else if (compare < 0) {
	        	low = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return -1; 
	}


	public int RecursiveStr(String num, String[] arr, int low, int high) {
		
		if(low>=high)
		{
			return -1;
		}
	    int mid = (low + high)/ 2;
	    int compare = arr[mid].compareTo(num);
	    
	    if(compare==0)
	    {
	    	return mid;
	    }
	    else if(compare<0)
	    {
	    	return RecursiveStr(num,arr,mid+1,high);
	    }else {
	    	return RecursiveStr(num,arr,low,mid-1);
	    }
	
	}

	

	public int sequentialInt(int num, int[] temp) {
		for(int i=0;i<temp.length;i++)
		{
			if(num==temp[i])
			{
				return i;
			}
		}
		return -1;
	}

	public int sequentialStr(String num, String[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(num))
			{
				return i;
			}
		}
		return -1;
	}
	
	

}
