package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.demo.beans.*;

public class EployeeService {
	static Employee [] emparr;
	static ContractEmp [] contractemp;
	static int count;
	static int ccount;
	
	static {
		emparr=new Employee[100];
		 contractemp=new ContractEmp[100];
		emparr[0] = new Salemp(1,"suyog",LocalDate.of(2004,01,26),"HR","Coder",8000); 
		count=1;
	}

	public  void DisplayCon() {
		for(ContractEmp emp:contractemp)
		{
			if(emp!=null)
			{
				System.out.println(emp);
			}
		}
		
	}

	public boolean AddConEmp() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Id :");
		int id=sc.nextInt();
		System.out.println("Enter the Name ");
		String name=sc.next();
		System.out.println("Enter the date (dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=(LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		float hr=1;
		System.out.println("Enter the charge");
		double charge=sc.nextDouble();
		
		ContractEmp ce = new ContractEmp(id,name,ldt,hr,charge);
		contractemp[ccount]=ce;
		ccount++;
		
		
		return true ;
	}

}
