package Day1;
import java.util.Scanner;

class Max{
   public static void main(String [] args)
   {
     Scanner sc =new Scanner(System.in);
	 
	 System.out.println("Enter the number 1");
	 int n1 =sc.nextInt();
	 System.out.println("Enter the number 2");
	 int n2 =sc.nextInt();
	 System.out.println("Enter the number 3");
	 int n3 =sc.nextInt();
	 
	 if(n1==n2 && n1==n3){
	 
	   System.out.println("All the number are equal ");
	   
	   }else
	   {
	      if(n1>n2 && n1>n3)
		  {
		    System.out.println("The max number is "+n1);
			
		  }else if(n2>n1 && n2>n3)
		  {
		    System.out.println("The max number is "+n2);
		  }
		  else
		  {
		  System.out.println("The maximun Number is "+n3);
		  }
	   }
	 
   }
}