package com.demo.service;
import java.util.Scanner;
public class _1DArray {
	
	Scanner sc=new Scanner(System.in);
    int arr[];
    
    public int[] add(int size)
    { 
    	arr=new int [size];
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println("Enter the element ");
    		arr[i]=sc.nextInt();
    	}
    	return arr;
    }
    public void display(int [] arr)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.print(arr[i]+" ");
    		
    	}
    }
    
    //Find addition of digits of all every individual number in the array
    
    public int addDigit(int num)
    { 
    	int sum=0;
    	while(num!=0) {
        	
    	    int rem=num%10;
    	    sum=sum+rem;
    	    num=num/10;
    	}
    	return sum;
    }
    
    public int [] addition ()
    {
    	int []temp=new int [arr.length];
    	int sum=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		temp[i]=addDigit(arr[i]);
    	}
    	return temp;
    }
    // Find factorial of only prime  numbers in the array 
    public boolean isPrime(int num)
    {
    	if(num==1) {
    		return false;
    	}
    	else if(num==2)
    	{
    		return true;
    	}
    	else
    	{
    		for(int i=2;i<num;i++)
    		{
    			if(num%i==0)
    			{
    				return false;
    			}
    		}
    		return true;
    	}
    }
    
    public int [] prime()
    {
    	int []temp = new int [arr.length];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(isPrime(arr[i]))
    		{
    			temp[i]=arr[i];
    		}
    	}
   
    	return temp;
    }
    
    public int maxprime() {
    	int[] temp=prime();
    	int max=temp[0];
    	for(int i=1;i<temp.length;i++) {
    		if(max<temp[i]) {
    			max=temp[i];
    		}
    	}
    	return max;
    }
    public int [] P_factorial()
    {
    	int []temp=prime();
    	
    	int [] facts=new int[temp.length];
    	for(int i=0;i<temp.length;i++)
    	{
    		int cnt=0;
    		if(factorial(temp[i]) !=0 && factorial(temp[i]) !=1)
    		{
    			facts[i]=factorial(temp[i]);
    			cnt++;
    		}
    		else {
    			facts[i]=0;
    		}
    			
    	}
    	return facts;
    }
    
    public int factorial(int num)
    {
    	int fact=1;
    	for(int i=1;i<=num;i++)
    	{
    		fact=fact*i;
    	}
    	return fact;
    }
    
    public int[] copyarr(int[]arr) {
    	int[]copyarr=new int [arr.length];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(isPrime(arr[i]))
    		{
    			int rev=0;
    			int num=arr[i];
    			while(num!=0)
    			{
    				int rem=num%10;
    				rev=(rev*10)+rem;
    				num=num/10;
    			}
    			copyarr[i]=rev;
    		}
    		else
    		{
    			copyarr[i]=arr[i];
    		}
    	}
    	return copyarr;
    }
    
    
   public void Strings()
   {
	   String [] arr1=new String[12];
	   for(int i=0;i<arr1.length;i++)
	   {
		   System.out.println("Enter the String ");
		   String st=sc.next();
		   
		   
		   if(i!=0)
		   {
			   arr1[i]=st;
		   }
		   else
		   {
			   if(arr1[i].charAt(1)==st.charAt(1))
			   {
				   rotated(st,arr1,i);
			   }
		   }
	   }
   }
private void rotated(String st, String[] arr1, int pos) {
	for(int i=arr1.length;i>pos;i--)
	{
		arr1[pos]=st;
		
	}
	
}
    
}


