package com.demo.test;

import java.util.Scanner;

import com.demo.service.EployeeService;

public class Test {


	public static void main(String[] args) {
		
		EployeeService serve=new EployeeService();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.Display Contract employee");
			System.out.println("2.Add the Cotract Employee");
			System.out.println("3 Enter the salary employee");
			System.out.println("4.Display salary employee \n5.exit");
			System.out.println("Enter the choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1->
			{
				serve.DisplayCon();
			}
			case 2->
			{
				boolean status=serve.AddConEmp();
				if(status)
				{
					System.out.println("The contractor emp add");
				}
				else
				{
					System.out.println("Faild ");
				}
			}
			}
			
		}while(choice !=5);
	}

}
