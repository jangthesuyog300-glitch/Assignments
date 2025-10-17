import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
    int []arr=new int[size];
    
    Array1Dq.Accept(arr);
	int []arr2=Array1Dq.FindAllOccurence(arr);
	System.out.println("Find all Occurence in index : ");
    Array1Dq.Display(arr2);

    }
}
