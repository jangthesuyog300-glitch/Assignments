package com.demo.test;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int num=45;
		Scanner sc =new Scanner(System.in);
		
		
		while(true) {
			try {
			System.out.println("Enter Number ");
			int num2=sc.nextInt();
			if(num==num2)
			{
				System.out.println("you guess correct");
				break;
			}
			else if(num>num2)
			{
				System.out.println("you miss it !! it is small number ");
			}
			else {
				System.out.println("you will  miss it !! it is greter number ");
			}
		}catch(Exception e)
			{
			System.out.println(e.getMessage());
			}
		}
			

	}

}
