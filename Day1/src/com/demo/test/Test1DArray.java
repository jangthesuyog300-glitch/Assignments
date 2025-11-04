package com.demo.test;
import com.demo.service.*;

import java.util.Arrays;
import java.util.Scanner;

public class Test1DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array1D arr= new Array1D();
		int choice=0;
		do {
		   System.out.println("1.Add at end\n2.Add at position\n3.Serch by value");
		   System.out.println("4.Delete by position\n5.Delete by value\n6.Rotate array\n7.Reverse");
		   System.out.println("8.Replace index with value\n9.sum of all array\n10.Display Array\n11.Exit");
		   System.out.println("Enter choice : ");
		   choice=sc.nextInt();
		   switch(choice) {
		   case 1->{
			  System.out.println("Enter array element" );
			  int x=sc.nextInt();
			  boolean status=arr.add( x);
			  if(status)
			  {
				  System.out.println("Successfully");
			  }
			  else {
				  System.out.println("Not Added");
			  }
		   }
		   case 2->{
			   System.out.println("Enter the pos ");
			   int pos=sc.nextInt();
			   System.out.println("Enter array element" );
				  int x=sc.nextInt();
				  boolean status=arr.addPos(x,pos);
				  if(status)
				  {
					  System.out.println("Successfully");
				  }
				  else {
					  System.out.println("Not Added");
				  }
		   }
		   case 3->{
			   System.out.println("Enter the value");
			   int value =sc.nextInt();
			   int ixd=arr.SerchByValue(value);
			   System.out.println("At the Index : "+ixd);
		   }
		   case 4->{
			   System.out.println("Enter the position ");
			   int pos=sc.nextInt();
			   boolean status=arr.deleteBypos(pos);
				  if(status)
				  {
					  System.out.println("Successfully");
				  }
				  else {
					  System.out.println("Not found");
				  }
		   }
		   case 5->{
			   System.out.println("Enter the value ");
			   int value=sc.nextInt();
			   boolean status=arr.deleteByVal(value);
				  if(status)
				  {
					  System.out.println("Successfully");
				  }
				  else {
					  System.out.println("Not found");
				  }
		   }
		   case 6->{
			   System.out.println("enter True or False");
			   boolean flag=sc.nextBoolean();
			   System.out.println("enter a number:");
			   int num=sc.nextInt();
			   arr.rotateArray(flag,num);
			   
		   }
		   case 7->{
			   System.out.println("enter True or False:");
			   boolean flag=sc.nextBoolean();
			   arr.reverse(flag);
			   
		   }
		   case 8->{
			   int []temp=arr.exchangeIndexValue();
			   System.out.println("MyArray [arr ="+Arrays.toString(temp)+"]");
		   }
		   case 9->{
			   int sum=arr.sum();
			   System.out.println("sum of array:  "+sum);
			   
		   }
		   case 10->
		   {
			   arr.display();
			   
		   }
		   
		   
		   }
			
		}while(11 != choice);
	}

}
