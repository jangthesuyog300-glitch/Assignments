package com.demo.test;
import java.util.Scanner;

public class FactorialRecursive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println(Fact(n));
		
		
	}
		public static int Fact(int n) {
			if(n==1) {
				return 1;
			}
			else {
				return n*Fact(n-1);
			}
		}

}
