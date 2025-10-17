package Vehicle;
import java.util.*;
public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("Enter the choice");
			System.out.println("1.Add Vehicle");
		System.out.println("2.Exit");
		System.out.println("Enter the Choice");
		choice =sc.nextInt();
		switch (choice){
		
		case 1: 
			boolean status =StudentService.AddNewVehicle();
			if(status)
			{
				System.out.println("Student Added");
			}else
			{
				System.out.println("Error : not Added");
			}
		}
		
	   case 2: 
			StudentService.display();
		}while(choice!=3);
	}

}
