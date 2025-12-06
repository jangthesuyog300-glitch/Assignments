package Day1;
import java.util.Scanner;
class AddnNO
{
  public static void main (String [] args)
  {
     Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
	   sum +=i;
	}
	System.out.println("Sum of the n number : "+sum);
	
  }
}