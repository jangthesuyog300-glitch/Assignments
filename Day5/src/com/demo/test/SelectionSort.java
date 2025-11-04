package com.demo.test;

import java.util.Scanner;
import com.demo.service.Selection;


public class SelectionSort {

	public static void main(String[] args) {
		
		
		
		int []arr= {21,2,5,1,7,8,10,3};

		Scanner sc=new Scanner(System.in);
		
		
		int choice=0;
		
		do {
		
			
			System.out.println("1.Selection Sort Ascending ");
			System.out.println("2.Selection Sort descending ");
			
			
			
			System.out.println("3.exit");
			System.out.println("Enter the choice :");
			choice = sc.nextInt();
			
			switch(choice)
			{
			 case 1->
		    	{
		    		Selection.sortAsc(arr);
			   }
			 case 2->{
				 Selection.sortDes(arr);
			 }
	       }
			
			
			
			
		}while(choice !=9);

	}
}
