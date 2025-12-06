package com.demo.test;
import com.demo.service.BubbleService;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		int []arr= {21,2,5,1,7,8,10,3};
		int []arr1= {43,10,12,7,55,10,20};
		Scanner sc=new Scanner(System.in);
		
		BubbleService serv=new BubbleService();
		int choice=0;
		
		do {
			System.out.println("1.Simple Bubble sort");
			System.out.println("2.Modify Bubble sort");
			System.out.println("3.Descending Bubble sort");
			System.out.println("4.Descending modify Bubble sort");
			System.out.println("5.exit");
			System.out.println("Enter the choice :");
			choice = sc.nextInt();
			
			switch(choice)
			{
			 case 1->
		    	{
			      serv.bubblesort(arr);	
			   }
			 case 2->{
				 serv.modfbubblesort(arr1);	
			 }
			 case 3->{
				 serv.bubblesortDes(arr1);
			 }
			 case 4->{
				 serv.modifybubblesortDes(arr1);
			 }
			
			
			}
			
		}while(choice !=5);

	}

}
