package com.demo.service;
import java.util.Scanner;

public class Array2D {

	
	
	
	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

	public static int addAllNumbers(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
		}
		return sum;
	}

	public static int[] addRowwise(int[][] arr) {
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=0;
			
			for(int j=0;j<arr[i].length;j++) {
				temp[i]=temp[i]+arr[i][j];
			}
		}
		return temp;
	}
	
	public static int[] columnwise(int[][] arr) {
		int[] temp1=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				temp1[i]=temp1[i]+arr[j][i];
			}
		}
		return temp1;
	}


	public static int[][] add2Darrays(int[][] arr, int[][] arr1) {
			if(arr.length==arr1.length && arr[0].length==arr1[0].length)
			{
				int [][]temp=new int [arr.length][arr[0].length];
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[0].length;j++)
					{
						temp [i][j]=arr[i][j]+arr1[i][j];
					}
				}
				return temp;
			}
		return null;
	}

	

	public static int[][] subtractArray(int[][] arr, int[][] arr1) {
		if(arr.length==arr1.length && arr[0].length==arr1[0].length)
		{
			int [][]temp=new int [arr.length][arr[0].length];
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					
					temp [i][j]=arr[i][j]-arr1[i][j];
				}
			}
			return temp;
		}
		return null;
	}



	public static int[][] Accept() {
		 Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter row");
			int r=sc.nextInt();
			System.out.println("Enter column");
			int c=sc.nextInt();
			
		int [][]temp=new int [r][c];
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[i].length;j++)
			{
				System.out.println("Row '"+i+"' col '"+j+"'");
				temp[i][j]=sc.nextInt();
			}
		}
		return temp;
	}

	public static int[][] rotateRow(int[][] arr, int n, boolean flag) {
		if(flag) {
			for(int cnt=0;cnt<n;cnt++) {
				int[] temp=arr[0];
				for(int i=0;i<arr.length-1;i++) {
					arr[i]=arr[i+1];
				}
				arr[arr.length-1]=temp;
			}
			
			
		}
		else {
			for(int cnt=0;cnt<n;cnt++) {
				int []temp=arr[arr.length-1];
				for(int i=arr.length-1;i>0;i--) {
					arr[i]=arr[i-1];
				}
				arr[0]=temp;
			}
			
		}
		return arr;
		
	}

	public static int[][] rotateColumn(int[][] arr, int n, boolean flag) {
		if(flag) {
			for(int cnt=0;cnt<n;cnt++) {
				int[] temp=new int[arr.length];
				for(int i=0;i<arr.length;i++) {
					temp[i]=arr[i][arr[0].length-1];
				}
				for(int i=0;i<arr.length;i++) {
					for(int j=arr[0].length-2;j>=0;j--) {
						arr[i][j+1]=arr[i][j];
					}
				}
				for(int i=0;i<arr.length;i++) {
					arr[i][0]=temp[i];
				}
			}
		}
		else {
			for(int cnt=0;cnt<n;cnt++) {
				int temp[]=new int[arr.length];
				for(int i=0;i<arr.length;i++) {
					temp[i]=arr[i][0];
				}
				for(int i=0;i<arr.length;i++) {
					for(int j=1;j<arr[0].length;j++) {
						arr[i][j-1]=arr[i][j];
					}
				}
				for(int i=0;i<arr.length;i++) {
					arr[i][arr[0].length-1]=temp[i];
				}
			}
		}
		return arr;
	}

	public static int[][] findTranspose(int[][] arr) {
		int[][] temp=new int[arr[0].length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				temp[j][i]=arr[i][j];
			}
		}
		return temp;
	}

	public static boolean checkIdentity(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i == j && arr[i][j]!=1) {
					return false;
				}
				
			}
		}
		return true;
	}


}
