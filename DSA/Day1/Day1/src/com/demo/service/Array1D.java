package com.demo.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Array1D {
	int cnt=0;
	int []arr=new int[10];
	


	public Array1D() {
		arr=new int[10];
		cnt=0;
	}
	
	public Array1D(int[] arr,int count) {
		this.arr=arr;
		this.cnt=count;
	}
	
	public Array1D(int size) {
		arr=new int[size];
		cnt=0;
	}


	//Add at the end
	public boolean add(int x)
	{
		if(cnt < arr.length)
		{
			arr[cnt]=x;
			cnt++;
			return true;
		}
		return false;
	}


	public void display() {
		System.out.println("MyArray [arr="+Arrays.toString(arr)+"]");
		
	}


	public boolean addPos(int x, int pos) {
		  if(cnt<arr.length && pos<cnt) {
			  for(int i=cnt;i>pos;i--)
			  {
				  arr[i]=arr[i-1];
			  }
			  
			  arr[pos]=x;
			  cnt++;
			  return true;
		  }
		return false;
	}

	public int SerchByValue(int value) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value)
			{
				return i;
			}
			
		}
		return -1;
	}

	public boolean deleteBypos(int pos) {
		if(pos<cnt) {
			for(int i=pos;i<cnt-1;i++)
			{
				arr[i]=arr[i+1];
			}
			cnt--;
			return true;
			
		}
		return false;
	}

	public boolean deleteByVal(int value) {
		int idx=SerchByValue(value);
		if(idx!=-1)
		{
			return deleteBypos(idx);
		}
		return false;
	}

	public void rotateArray(boolean flag, int num) {
		if(flag) {
			for(int i=0;i<num;i++) {
				int temp=arr[cnt-1];
				for(int j=cnt-1;j>0;j--) {
					arr[j]=arr[j-1];
				}
				arr[0]=temp;
			}
		}
		else {
			for(int i=0;i<num;i++) {
				int first=arr[0];
				for(int j=0;j<cnt-1;j++) {
					arr[j]=arr[j+1];
				}
				arr[cnt-1]=first;
			}
		}
	}

	public void reverse(boolean flag) {
		int []temp=new int[cnt];
		if(flag) {
			for(int i=0, j=cnt-1;i<j;i++,j--) {
				if(j>i) {
				int temp1=arr[i];
				arr[i]=arr[j];
				arr[j]=temp1;
				}
			}
		}
		else {
			for(int i=cnt-1,j=0;i>=0;i--,j++) {
				temp[j]=arr[i];
				
			}
			System.out.println("MyArray [arr copy="+Arrays.toString(temp)+"]");
		}
	}
	
	public int max() {
		int max=arr[0];
		for(int i=0;i<cnt;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

	public int [] exchangeIndexValue() {
		int size=max();
		int[] arr1=new int[size+1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=-1;
		}
		for(int i=0;i<cnt;i++) {
			int idx=arr[i];
			int value=i;
			arr1[idx]=value;
		}
		return arr1;
		
		
	}

	public int sum() {
		int sum=0;
		for(int i=0;i<cnt;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

}
