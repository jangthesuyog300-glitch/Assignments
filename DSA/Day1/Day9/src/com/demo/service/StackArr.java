package com.demo.service;

public class StackArr {
    private int []arr;
    
    private int top;
    public StackArr()
    {
    	arr=new int [10];
    	top=-1;
    }
    public StackArr(int size)
    {
    	arr=new int[size];
    	top=-1;
    }
    
    public void push(int num)
    {
    	if(!isFull())
    	{
    		top++;
    		arr[top]=num;
    		System.out.println("Push "+num);
    	}
    	else 
    	{
    		System.out.println("Stack is full");
    	}
		
    }
    
    public int pop()
    {
    	if(!isEmpty())
    	{
    		int num=arr[top];
    		top--;
    		return num;
    	}
    	else
    	{
    		System.out.println("Stack is Empty");
    		return -1;	
    	}
    }
	private boolean isEmpty() {
		return top==-1;
	}
	private boolean isFull() {
		return top==arr.length-1;
	}
    
}
