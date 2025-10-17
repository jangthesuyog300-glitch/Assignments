import java.util.Scanner;

public class Array1Dq {

    public static int[] FindAllOccurence(int []arr) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();

        int [] temp =new int[arr.length];
        
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]==num)
            {
             temp[cnt]=i;
             cnt++;   
            }else
			{
				temp[cnt]=0;
			}
        }
		System.out.println("count"+cnt);
        if(cnt>0)
        {
            return temp;
        }
        return null;
    }

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
    
}