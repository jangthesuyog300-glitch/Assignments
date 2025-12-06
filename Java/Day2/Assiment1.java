import java.util.Scanner;
public class Assiment1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int []arr=new int[size];
		AssSub.Accept(arr);
		int choice=0;
		do {
			System.out.println("1.All prime \n 2.add odd digit \n 3.factorial less than 7 \n 4.nth maximun prime \n 5.nth minimum prime /n 6.Exit ");
			choice=sc.nextInt();
			switch(choice) 
			{
			case 1: 
				int []arr2=AssSub.Prime(arr);
				AssSub.Display(arr2);
				break;
			
			case 2: 
				int odd=AssSub.OddNumber(arr);
				System.out.println("Addition of the all odd numbers : "+odd);
				
				break;
				
			case 3:
				int []arr3 =AssSub.Factorial(arr);
				System.out.println("Factorial of the element which is less than 7 :");
				AssSub.Display(arr3);
				break;
			case 4:
				int []arr6=AssSub.Prime(arr);
				System.out.println("Enter the number :");
				int n = sc.nextInt();
				int max=AssSub.Maxprime(arr6,n);
				System.out.println("Prime max :"+max);
				
				break;	
			case 5:
				int []arr4=AssSub.Prime(arr);
				System.out.println("Enter the number :");
				 n = sc.nextInt();
				 int min=AssSub.Minprime(arr4,n);
				 System.out.println("Prime min :"+min);
				break;
			case 6:
				System.out.println("Thank you fro visiting");
				break;
			default :
				System.out.println("Invalid choice");
			}
		}while(choice==6);
		
		

	}

}
