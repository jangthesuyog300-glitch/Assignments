package com.demo.stacks;

public class CircularQueue {
	int[] arr;
	int front;
	int rare;
	public CircularQueue(int size) {
		arr=new int[size];
		this.front = -1;
		this.rare = -1;
		
	}
	public CircularQueue() {
		arr=new int[10];
		this.front = -1;
		this.rare = -1;
	}
	
	public boolean isEmpty() {
		if(front ==-1) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(front==0 && rare==arr.length-1) {
			System.out.println("Queue is full");
			return true;
		}
		else if(front==rare+1) {
			System.out.println("Queue is full");
			return true;
		}
		return false;
	}
	public boolean enQueue(int num) {
		if(!isFull()) {
			if(front==-1) {
				front=0;
			}
			rare=(rare+1)%arr.length;
			arr[rare]=num;
			System.out.println("added successfully"+num);
			return true;
		}
		return false;
	}
	
	public int deQueue() {
		if(!isEmpty()) {
			int n=arr[front];
			if(front==rare) {
				front=-1;
				rare=-1;
			}
			else {
				front=(front+1)% arr.length;
				
			}
			return n;
		}
		return -1;
	}
	
	

}
