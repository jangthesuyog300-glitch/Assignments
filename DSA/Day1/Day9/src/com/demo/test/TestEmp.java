package com.demo.test;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;

public class TestEmp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService elist=new EmployeeService();
		int choice=0;
		do {
			System.out.println("1. add new Employee\n 2. Display all");
			System.out.println("3. Add by postition \n4. Add by value \n5.Delete by value \n6.delete by postion");
			System.out.println("7.Exit ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the id");
				int id=sc.nextInt();
				System.out.println("Enter the name");
				String name=sc.next();
				System.out.println("Enter the Salary");
				double sal=sc.nextDouble();
				elist.addNode(new Employee(id,name,sal));
				break;
			case 2:
				elist.displayData();
				
				break;
			case 3:
				System.out.println("Enter the position");
				int pos=sc.nextInt();
				
				System.out.println("Enter the id");
				 id=sc.nextInt();
				 
				System.out.println("Enter the name");
				name=sc.next();
				
				System.out.println("Enter the Salary");
				sal=sc.nextDouble();
				
				elist.addByPosition(pos,new Employee(id,name,sal) );
				
				break;
				
			case 4:
				System.out.println("Enter the val");
				int val=sc.nextInt();
				
				System.out.println("Enter the id");
				 id=sc.nextInt();
				 
				System.out.println("Enter the name");
				name=sc.next();
				
				System.out.println("Enter the Salary");
				sal=sc.nextDouble();
				
				elist.addByValue(id,new Employee(id,name,sal) );
				
				break;	
			case 5:
				System.out.println("Enter the position");
				 pos=sc.nextInt();
				 
				 elist.deleteByPosition(pos);
				
				
				break;
			
			case 6:
				System.out.println("Enter the id");
				  id=sc.nextInt();
				 
				 elist.deleteByValue(id);
				
				
				break;	
			
			default:
				System.out.println("wrong choice");
				break;
			}
		}while(choice!=6);
	}

}
