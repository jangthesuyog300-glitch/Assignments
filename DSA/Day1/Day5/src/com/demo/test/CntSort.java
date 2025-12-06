package com.demo.test;

import java.util.Scanner;
import com.demo.service.Cnt;

public class CntSort {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int []arr= {5,7,5,9,6,9,1,3,2};
		
		int choice=0;
		do {

			
			System.out.println("1.Counting Sort Ascending ");
			System.out.println("2.Counting Sort descending ");
			
			
			System.out.println("3.exit");
			System.out.println("Enter the choice :");
			choice = sc.nextInt();
			
			switch(choice)
			{
			 case 1->
		    	{
			     int []arr1=Cnt.sort(arr);
			   }
			 case 2->{
				
			 }
		
		
			   
			
			
			}
			
		}while(choice !=3);
	}

}
