package com.demo.test;
import com.demo.beans.Employee;
import com.demo.service.*;

import java.util.List;
import java.util.Scanner;

public class TestEmployeeManagement {

	public static void main(String[] args) {
		EmployeeService oservice = new EmployeeServiceImpl ();
		Scanner sc= new Scanner(System.in);
		oservice.readFile("empdata.txt");
		int choice = 0;
		do {
			System.out.println("1. add new employee \n2. delete by id \n3. modify by id \n4. display all \n5. display by id \n6. exit ");
			System.out.println("enter a choice:");
			choice = sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status = oservice.addEmployee();
				if(status) {
					System.out.println("Added Successfully!");
				}
				else {
					System.out.println("Not Added!");
				}
			}
			case 2->{
				System.out.println("enter id:");
				int id =sc.nextInt();
				boolean status = oservice.deleteById(id);
				if(status) {
					System.out.println("deleted succesfully!");
				}
				else {
					System.out.println("not found");
				}
			}
			case 3->{
				System.out.println("enter id:");
				int id =sc.nextInt();
				System.out.println("enter salary:");
				double sal=sc.nextDouble();
				boolean status = oservice.modifyById(id,sal);
				if(status) {
					System.out.println("modify salary succesfull");
				}
				else {
					System.out.println("not found");
				}
				
			}
			case 4->{
				
			List<Employee>lst=oservice.displayAll();
			lst.forEach(System.out::println);
				
			}
			case 5->{
				System.out.println("enter id:");
				int id=sc.nextInt();
				Employee e=oservice.displayById(id);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("not found");
				}
			}
			case 6->{
				oservice.writeToFile("empdata.txt");
				sc.close();
				
			}
			}
			
			
		}while(choice!=6);
		
	}

}
