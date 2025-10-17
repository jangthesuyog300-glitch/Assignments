package com.demo.test;
import java.util.*;

import java.util.Scanner;
import java.util.Set;

import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;
public class TestCourseMgntSystem {
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		
		CourseService cservice=new CourseServiceImpl();
		
		int choice =0;
		do {
			System.out.println("1.Add new Course\n2.Display all");
			System.out.println("\n3 find by course name\n4. modify course capacity\n5.find by course capacity.");
			System.out.println("\n6.Modify course name\n7. display sorted order of key \n8. sort by capacity \n9. delete by course name\n10. delete by capacity\n11. exit\n choice:");
			choice = sc.nextInt();
			switch(choice) {
			     case 1->{
			      	boolean status = cservice.addNewCourse();
				    if(status) {
					System.out.println("new course added");
				    }
				    else
				    {
					System.out.println("duplicate name");
				    }
			
			
			     }
			     
			     case 2->{
			    	 Map<String,Integer> cmap= cservice.displayAll();
			    	 Set<String> keys = cmap.keySet();
			    	 keys.forEach(e->System.out.println(e+"---->"+cmap.get(e)));
			     }
			     
			     case 3->{
			    	 System.out.println("enter course name");
			    	 String cname =sc.next();
			    	 int capacity=cservice.searchByNam(cname);
			    	 if(capacity != -1) {
			    		 System.out.println("course name:"+cname+" capacity:"+capacity);
			    	 }
			    	 else {
			    		 System.out.println("Not found");
			    	 }
			     }
			     
			     case 4->{
			    	 System.out.println("enter course name:");
			    	 String cname =sc.next();
			    	 System.out.println("enter course capacity");
			    	 int newcap =sc.nextInt();
			    	 boolean status= cservice.modifyByName(cname,newcap);
			    	 if(status) {
			    	 System.out.println("modification done");
			     }
			    	 else {
			    		 System.out.println("not found");
			    	 }
			
			    }
			     case 5->{
			    	 System.out.println("Enter capacity");
			    	 int capacity=sc.nextInt();
			    	 Set<String> cset =cservice.displayByCapacity(capacity);
			    	 if(cset!=null) {
			    		 cset.forEach(System.out::println);
			    	 }
			    	 else {
			    		 System.out.println("Not found");
			    	 }
			     }
			     
			     case 6->{
			    	 System.out.println("enter old course name:");
			    	 String oname =sc.next();
			    	 System.out.println("enter new course name:");
			    	 String nname = sc.next();
			    	 boolean status = cservice.modifyByCourseName(oname,nname);
			    	 if(status) {
			    		 System.out.println("modification done");
			    	 }
			    	 else {
			    		 System.out.println("not found");
			    	 }
			    	 
			     }
			     
			     case 7->{
			    	 Map<String,Integer> cmap = cservice.sortByName();
			    	 Set<String> keys = cmap.keySet();
			    	 keys.forEach(e->System.out.println(e+"---->"+cmap.get(e)));
			     }
			     
			     case 8->{
			    	 Set<Map.Entry<String ,Integer>> eset =eset=cservice.sortByCapacity();
			    	 eset.forEach(e->System.out.println(e.getKey()+"--->"+e.getValue()));
			     }
			     
			     case 9->{
			    	 System.out.println("enter course name:");
			    	 String cname =sc.next();
			    	 boolean status =cservice.deleteByName(cname);
			    	 if(status) {
			    		 System.out.println("deleted successfully");
			    	 }
			    	 else {
			    		 System.out.println("not found");
			    	 }
			     }
			     case 10->{
			    	 System.out.println("Enter capacity");
			    	 int capa =sc.nextInt();
			    	 boolean status =cservice.deleteByCapacity(capa);
			    	 if(status)
			    	 {
			    		 System.out.println("deleted Successfully");
			    	 }
			    	 else
			    	 {
			    		 System.out.println("Not Found");
			    	 }
			     }
			     case 11->{
			    	 System.out.println("Thank you fro visiting");
			    	sc.close();
			     }
			     default->{
			    	 System.out.println("Wrong choice");
			     }
			}
			
			}while(choice != 11);
		}
	}


