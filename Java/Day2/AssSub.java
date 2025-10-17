import java.util.Scanner;

public class AssSub {

	public static void Accept(int[]arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }


    public static void Display(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }


	public static int[] Prime(int[] arr) {
		
		int []arr1=new int[arr.length];
		int count=0;
		for(int i =0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		return arr1;
		
		
	}
    
	public static boolean isPrime(int n)
	{
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
			return false;
			}
		
		}
		return true;
		
	}


	public static int OddNumber(int[] arr) {
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 != 0)
			{
				sum =sum+arr[i];
			}
			
		}
		return sum;
	}


	public static int[] Factorial(int[] arr) {
		
		int []arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
		
			if(arr[i]<=7) {
				int fact=1;
				for(int j=1;j<=arr[i];j++)
				{
					fact = fact*j;
				}
				
				arr1[i]=fact;
			}
           
		}
		return arr1;
	}


	public static int Maxprime(int[] arr,int n) {
		int []arr1=new int [arr.length];
		for(int i=0;i<n;i++)
		{
			int pos=findmaxpos(arr,i);
			int temp =arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		
		return arr[n-1];
	}


	private static int findmaxpos(int[] arr, int start) {
		int pos =start;
		int max =arr[pos];
		for(int i=start+1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				pos=i;
				max=arr[i];
			}
		}
		return pos;
	}


	public static int Minprime(int[] arr2, int n) {
		int []arr1=new int [arr2.length];
		for(int i=0;i<n;i++)
		{
			int pos=findminpos(arr2,i);
			int temp =arr2[i];
			arr2[i]=arr2[pos];
			arr2[pos]=temp;
		}
		
		return arr2[n-1];
		
	
	}
	private static int findminpos(int[] arr, int start) {
		int pos =start;
		int min =arr[pos];
		for(int i=start+1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				pos=i;
				min=arr[i];
			}
		}
		return pos;
	}



	



}
