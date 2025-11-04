package com.demo.test;
import com.demo.service.Insert;

import java.util.Scanner;
import com.demo.service.QuickSort;

public class Insertion {

	
		public static void main(String[] args) {
			
			
			
			
			int []arr= {21,2,5,1,7,8,10,3};
			int []arr1= {43,10,12,7,55,10,20};
			Scanner sc=new Scanner(System.in);
			
			
			int choice=0;
			
			do {
			
				System.out.println("1.Insertion Sort Ascending");
				System.out.println("2.Insertion Sort descending");

				
				
				
				System.out.println("3.exit");
				System.out.println("Enter the choice :");
				choice = sc.nextInt();
				
				switch(choice)
				{
				 case 1->
			    	{
			    		Insert.Ascending(arr);
				   }
				 case 2->{
					 Insert.Descending(arr);
				 }

				
				
				}
				
			}while(choice !=9);

		}


	
}
