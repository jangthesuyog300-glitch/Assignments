package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	private static int divide(int x , int y) {
		return x/y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter 1st number: ");
			int num = sc.nextInt();
			System.out.println("enter 2nd number:");
			int num1 =sc.nextInt();
			
			int ans = divide(num,num1);
			System.out.println("Division:"+ans);
			System.out.println("At the end outer try block ");
		}
		
		catch(InputMismatchException e){
			System.out.println("please enter a number");
			e.printStackTrace();
			//System.out.println(e.getMessage());
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("in finally block");
		}
		
		

	}

}
