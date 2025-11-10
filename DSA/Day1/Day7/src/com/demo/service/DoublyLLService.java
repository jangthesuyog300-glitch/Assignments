package com.demo.service;

public class DoublyLLService {
	Node head;
	class Node{
		int data;
		Node prev,next;
		public Node(int data) {
			
			this.data = data;
			prev=null;
			next=null;
		}
		
		
	}
	public DoublyLLService() {
		head=null;
	}
	
	public void addByNode(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			
				newNode.prev=temp;
				temp.next=newNode;
				
				
			
			
		}
	}
	public void displayData() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"--");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void addByValue(int val,int num) {
		Node newNode=new Node(val);
		if(head.data==num) {
			head=newNode;
			
		}
		else {
			Node temp=head;
			while(temp.data!=num && temp!=null) {
				temp=temp.next;
			}
			if(temp!=null) {
			  newNode.next=temp.next;
			  newNode.prev=temp;
			  temp.next=newNode;
			  if(newNode.next!=null) {
				newNode.next.prev=newNode;
			  }
			}else {
				System.out.println("Number not found");
			}
		}
	}
	public void addByPosition(int pos,int val) {
		Node newNode=new Node(val);
		if(pos==1) {
			head=newNode;
			
		}
		else {
			Node temp=head;
			for(int i=0;i<pos-2 && temp!=null;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				newNode.prev=temp;
				temp.next=newNode;
				if(newNode.next!=null) {
					newNode.next.prev=newNode;
					
				}
			}
			else {
				System.out.println(pos+"is beyond the limit");
			}
		}
	}
	
	public void deleteByValue(int val) {
		if(head.data==val) {
			head=null;
		}
		else {
			Node temp=head;
			while(temp.data!=val) {
				temp=temp.next;
				
			}
			if(temp!=null) {
			temp.prev.next=temp.next;
			if(temp.next!=null) {
			temp.next.prev=temp.next;
			temp.next=null;
			}
			}
			else {
				System.out.println(val+"not found");
			}
		}
	}
	
	public void deleteByPosition(int pos) {
		Node temp=head;
		if(pos==1) {
			head=temp.next;
			head.prev=null;
			
			
		}
		else {
			
			for(int i=0;i<pos-1 && temp!=null;i++) {
				temp=temp.next;
			}
			
			if(temp!=null)
			{
				temp.prev.next=temp.next;
				if(temp.next!=null)
				  {
				   temp.next.prev=temp.prev;
				   temp.next=null;
				  }
				temp.prev=null;
				}
				else {
					System.out.println(pos+"not found");
				}
			}
	}

}
