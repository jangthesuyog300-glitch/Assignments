package com.demo.service;

import com.demo.beans.Employee;

public class EmployeeService {
	

	Node head;
	 class Node{
		 Employee data;
		 Node next,prev;
		 
		 public Node(Employee data) {
			 this.data=data;
			 next =null;
			 prev=null;
		 }
		 
		
		 
		 
	 }
	public EmployeeService() {
		
		head=null;
	}
	
	public void addNode(Employee val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
			head.next=newNode;
			head.prev=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
				
			}
			temp.next=newNode;
			newNode.next=head;
			newNode.prev=temp;
			head.prev=newNode;
			
		}
	}
	public void displayData() {
		Node temp=head;
		do {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		while(temp!=head) ;
		System.out.println();
			
		
	}
	
	public void addByPosition(int pos,Employee val)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else {
			Node newNode=new Node(val);
			if(pos==1) {
				Node temp=head.prev;
				temp.next=newNode;
				newNode.next=head;
				newNode.prev=temp;
				head.prev=newNode;
				head=newNode;
			}
			else
			{
				Node temp=head;
				int i=0;
				for(;temp.next!=head && i<pos-2;i++)
				{
					temp=temp.next;
				}
				if(i==pos-2)
				{
					newNode.prev=temp;
					newNode.next=temp.next;
					temp.next=newNode;
					newNode.next.prev=newNode;
				}
				else
				{
					System.out.println(pos+" is beyond the limit");
				}
			}
			
		}
	}
	
	public void addByValue(int id, Employee val) {
	    Node temp=head;
	    Node newNode=new Node(val);
	    while(temp.next!=head && temp.data.getEmpno()!=id)
	    {
	    	temp=temp.next;
	    }
	    if(temp.data.getEmpno()==id)
	    {
	    	newNode.prev=temp;
	    	newNode.next=temp.next;
	    	temp.next=newNode;
	    	newNode.next.prev=newNode;
	    }else
	    {
	    	System.out.println(id +"not found");
	    }
	}
	
	public void displayReverse() {
       if (head == null) return; // Check for empty list
       Node temp = head.prev;
       Node tail = temp;
       do {
           System.out.print(temp.data + "-->");
           temp = temp.prev;
       } while (temp != tail); // Corrected stopping condition
       System.out.println();
   }
	public void deleteByPosition(int pos) {
		if(head==null)
		{
			System.out.println("The list is empty");
		}
		else
		{
			Node tail=head.prev;
			if(pos==1)
			{
				if(tail==head)
				{
					head=null;
				}
				else 
				{
					head.next.prev=tail;
					tail.next=head.next;
					Node temp=head;
					head=head.next;
					temp=null;
				}
				
			}
			else
			{
				Node temp =head;
				int i=0;
				for(;temp.next!=head && i<pos-1;i++)
				{
					temp=temp.next;
				}
				if(pos==-1)
				{
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
					temp.next=null;
					temp.prev=null;
				}
				else
				{
					System.out.println(pos+" is beyond the limit");
				}
			}
		}
	}
	public void deleteByValue(int value) {
		if(head==null)
		{
			System.out.println("The list is empty");
		}
		else
		{
			Node tail=head.prev;
			if(head.data.getEmpno()==value)
			{
				if(tail==head)
				{
					head=null;
				}
				else 
				{
					head.next.prev=tail;
					tail.next=head.next;
					Node temp=head;
					head=head.next;
					temp=null;
				}
				
			}
			else
			{
				Node temp =head;
				while(temp.next!=head && temp.data.getEmpno()!=value)
				{
					temp=temp.next;
				}
				if(temp.data.getEmpno()==value)
				{
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
					temp.next=null;
					temp.prev=null;
				}
				else
				{
					System.out.println(value +" Not found ");
				}
			}
		}
	}
	
}
