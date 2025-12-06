package com.demo.test;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.service.*;
public class Customer_mngt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OrderService oservice=new OrderServiceImpl();
		
		int choice=0;
		do {
		System.out.println("1. add new customer\n2. display all\n3. display by customer");
		System.out.println("4. delete customer\n5. add a new item in existing order");
		System.out.println("6. delete item from existing order\n7.exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		
		case(1)->{ boolean status=oservice.addcustomer();
		  if(status) { System.out.println("Add successfully");}
		  else {System.out.println("Not Added");}
		  
		  }
		case(2)->
		{
			Map<Customer,List<Item>> omap=oservice. Display();
			Set<Customer> keys=omap.keySet();
			keys.forEach(c->System.out.println(c+"---->"+omap.get(c)));
		}
		case(3)->
		{
			//display by customer
			System.out.println("Enter Id :");
			int id=sc.nextInt();
			Map.Entry<Customer,List<Item>> Data=oservice.FindByCust(id);
			if(Data !=null)
			{
				System.out.println(Data.getKey()+"------>"+Data.getValue());
			}else {
				System.out.println("Not found ");
			}
			
		}
		case (4)->{
			//delete customer
			System.out.println("Enter Id :");
			int id=sc.nextInt();
			boolean status=oservice.DeleteById(id);
			  if(status) { System.out.println("Deleted successfully");}
			  else {System.out.println("Not found ");}
		}
		
		case (5)->{
			//add a new item in existing order
			System.out.println("Enter Id :");
			int id=sc.nextInt();
			System.out.println("Enter Item id");
			int iid=sc.nextInt();
			System.out.println("Enter Item Name :");
			String inm=sc.next();
			System.out.println("Enter Quntity");
			int qyt=sc.nextInt();
			System.out.println("Enter the price :");
			double p=sc.nextDouble();
			boolean status=oservice.AddItem(id,new Item(iid,inm,qyt,p));
			  if(status) { System.out.println("Add successfully");}
			  else {System.out.println("Not found ");}
			
		}
		
		case(6)->{
			//delete item from existing order
			System.out.println("Enter Id :");
			int id=sc.nextInt();
			System.out.println("Enter Item id");
			int iid=sc.nextInt();
			boolean status=oservice.DeletedItem(id,iid);
			  if(status)
			  { System.out.println("Deleted successfully");}
			  else {System.out.println("Not found ");}
		}
		case (7)->sc.close();
		}
		}while(choice!=7);
		
	
    }
}