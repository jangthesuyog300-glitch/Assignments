package com.demo.test;
import com.demo.beans.Student;

import com.demo.service.*;
import java.util.*;

public class StudentManegment {

	public static void main(String[] args) {
		StudentS eserve = new StudentService();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.Add Student \n2.Display \n3.Find by id \n4.Remove by average marks");
			System.out.println("5.Update marks \n6.Find by name \n7.sort by name  \n8.sort by id \n9.sort by mark 1\n10. exit ");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			
			switch(choice){
			
			  case 1->{
				boolean status=eserve.AddStudent();
				if(status)
				{
					System.out.println("Add Successfully");
				}else {
				System.out.println("Error");
				} 
			  }
			  case 2->{
				  List <Student> elist =eserve.display();
				  elist.forEach(System.out::println);
			  }
			  case 3->{
				  System.out.println("enetr id for search");
					int eid=sc.nextInt();
					Student e=eserve.searchById(eid);
					if(e!=null) {
						System.out.println(e.toString());
					}else {
						System.out.println("not found");
					}
					
				  
			  }
			  case 4->{
				     //Remove by average marks
				     
			         }
			  case 5->{
				       
				       System.out.println("Enter id");
				       int id=sc.nextInt();
				       System.out.println("Enter marks 1");
				       float m1=sc.nextFloat();
				      
				       boolean status=eserve.updateMark(id,m1); 
				       if(status)
						{
							System.out.println("Update Successfully");
						}else
						{
						    System.out.println("Not found ");
						}
			       }
			  
			  case 6->{
				
				  System.out.println("Enter the name");
				  String nm=sc.next();
				  List<Student> lst = eserve.serchByname(nm);
				  if(lst!=null)
				  {
					  System.out.println(lst);
				  }
				  else {
					  System.out.println("Not Found");
				  }
			  }
			  case 7->
			        {
			        	//sort by name
			        	List<Student> lst = eserve.sortByName();
			        	if(lst!=null)
						  {
							  System.out.println(lst);
						  }
						  else {
							  System.out.println("Not Found");
						  }
			        	
			        }
			  case 8->{
				      //sort by id
				    List<Student> lst = eserve.sortById();
		        	if(lst!=null)
					  {
						  System.out.println(lst);
					  }
					  else {
						  System.out.println("Not Found");
					  }
			          }
			  case 9->{ //sort by mark
				       List<Student> lst =eserve.sortByMark();
				       if(lst!=null)
						  {
							  System.out.println(lst);
						  }
						  else {
							  System.out.println("Not Found");
						  }
				  
		            	  }
			  case 10->{
					sc.close();
				     System.out.println("Thank you for visiting...."); }
			  
			}
		}while(choice!=10);

	}

}
