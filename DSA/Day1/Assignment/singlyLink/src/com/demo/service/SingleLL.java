package com.demo.service;

public class SingleLL {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int  data)
		{
			this.data=data;
			next=null;
		}
	
	}
	public SingleLL() {
		
		this.head = null;
	}
	
	public void add(int num)
	{
		Node newNode =new Node(num);
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
	}
	
	public void display()
	{
		
		if(head==null)
		{
			System.out.println("Empty");
		}
		else 
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.print("null");
			
		}
		
	}
	
	public void reverse()
	{
		Node temp=head;
		
		int cunt=0;
		while(temp!=null)
		{
			cunt++;
			temp=temp.next;
			
		}
		
		int[] arr = new int[cunt];
	    temp = head;
	    int i = 0;
	    while (temp != null) {
	        arr[i] = temp.data;
	        temp = temp.next;
	        i++;
	    }
		for(i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" , ");
		}
		
	}
	
	public boolean isPrime(int n)
	{
		if(n<=1) return false;
		if(n==2) return true;
		if(n%2==0) return false;
		for(int i=0;i<=Math.sqrt(n);i+=2)
		{
			if(n%i == 0) return false;
		}
		return true;
	}
	
	public void DeletePrime()
	{
		while (head != null && isPrime(head.data))
		{
			head=head.next;
		}
		
		Node current=head;
		Node prev=null;
		
		while(current !=null)
		{
			if(isPrime(current.data))
			{
				prev.next=current.next;
				current=current.next;
			}
			else
			{
				prev=current;
				current=current.next;
			}
		}
	}
	
	public void delete(int num)
	{
		Node temp=head;
		if(head.data==num)
		{
			head=temp.next;
			temp.next=null;
		}
		else	
		{
			Node prev=null;
		   while(temp.data!=num && temp!=null)
		   {
			    prev=temp;
			   temp=temp.next;
		   }
		   if(temp!=null)
		   {
			   prev.next=temp.next;
			   temp.next=null;
		   }
		   else
		   {
			   System.out.println("Data not found ");
		   }
		}
		
	}
	

}
