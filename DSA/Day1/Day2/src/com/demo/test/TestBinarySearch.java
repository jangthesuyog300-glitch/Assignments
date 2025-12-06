package com.demo.test;
import com.demo.service.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class TestBinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinarySearch B=new BinarySearch();
		int [] temp= {12,13,16,23,27,45,56,58,62,65,70};
		System.out.println(Arrays.toString(temp));
		String [] arr= {"Atharv","Bhavan","Champu","Dhote"};
		System.out.println(Arrays.toString(arr));
		
		
		int choice=0;
		do {
			System.out.println("1.Non Recursive Binary Search integer");
			System.out.println("2.Recursive Binary Search integer");
			System.out.println("3.Recursive Binary Search String");
			System.out.println("4.Non Recursive Binary Search String");
			System.out.println("5.Sequential search integer");
			System.out.println("6.Sequential Search String");
			System.out.println("Enter choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				System.out.println("Enter search number");
				
				int num=sc.nextInt();
				int ixd=B.nonRecursiveInt(num,temp);
				System.out.println("Index "+ ixd);
				
			}
			case 2->{
                System.out.println("Enter search number");
                int num=sc.nextInt();
				int low=0;
				int high=temp.length-1;
				 int ixd=B.RecursiveInt(num,temp,low,high);
				 System.out.println("Index "+ ixd);
			}
			case 3->{
				System.out.println("Enter search String");
				
				String num=sc.next();
				int low=0;
				int high=arr.length-1;
				int ixd=B.RecursiveStr(num,arr,low,high);
				System.out.println("Index "+ ixd);
				
			}
			case 4->{
				System.out.println("Enter search String");
				
				String num=sc.next();
				int ixd=B.nonRecursiveStr(num,arr);
				System.out.println("Index "+ ixd);
				
			}
			case 5->{
				System.out.println("Enter search number");
				
				int num=sc.nextInt();
				int ixd=B.sequentialInt(num,temp);
				System.out.println("Index "+ ixd);
				
			}
			case 6->{
				System.out.println("Enter search number");
				
				String num=sc.next();
				int ixd=B.sequentialStr(num,arr);
				System.out.println("Index "+ ixd);
				
			}
			
			}
			
		}while(choice !=7);
	}

}
