package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.*;


public class TestProductManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		ProductService pservice=new ProductServiceimpl();
		do {
			System.out.println("1. add new product\n2. delete product\n3. modify product");
			System.out.println("4.find by Id\n5. display all\n6. display in sorted order\n7. exit");
			System.out.println("choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=pservice.addNewProduct();
				if(status) {
					System.out.println("1product addedd successfully");
				}else {
					System.out.println("Not added");
				}
			}
			case 2->{
				System.out.println("Enter the product id");
				int pid=sc.nextInt();
				boolean status=pservice.delete(pid);
				if(status) {
					System.out.println("1product delete successfully");
				}else {
					System.out.println("Not found");
				}
			}
			case 3->{
				System.out.println("Enter the product id");
				int pid=sc.nextInt();
				boolean status=pservice.modify(pid);
				if(status) {
					System.out.println("1product delete successfully");
				}else {
					System.out.println("Not found");
				}
			}
			case 4->{
				System.out.println("Enter the product id");
				int pid=sc.nextInt();
				Product e=pservice.findByid(pid);
				if(e !=null) {
					System.out.println(e);
				}else {
					System.out.println("Not found");
				}
			}
			case 5->{
				List<Product>lst=pservice.displayAll();
				if(lst!=null)
				{
					lst.forEach(System.out::println);
				}
				else {
					System.out.println("List is empty");
				}
				
			}
			case 6->{
				List<Product>lst=pservice.sortByprice();
				if(lst!=null)
				{
					lst.forEach(System.out::println);
				}
				else {
					System.out.println("List is empty");
				}
			}
			case 7->{
				System.out.println("Thank you for visiting .....");
				sc.close();
				pservice.closeConnection();
			}
			}
		}while(choice!=7);

	}

}
