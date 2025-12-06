package com.demo.test;
import com.demo.service.Mer;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int []arr= {21,2,5,1,7,8,10,3};
		
		int choice=0;
		do {

			System.out.println("1.Merge Sort Ascending ");
			
			
			
			System.out.println("3.exit");
			System.out.println("Enter the choice :");
			choice = sc.nextInt();
			
			switch(choice)
			{
			 case 1->
		    	{
		    		int start=0;
		    		int end=arr.length-1;
			    Mer.Mergesort(arr,start,end);
			   }
			
		
		
			   
			
			
			}
			
		}while(choice !=3);
	}

}
