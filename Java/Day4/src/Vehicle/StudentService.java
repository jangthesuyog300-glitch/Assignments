package Vehicle;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentService {
   static Vehicle [] vdarr;
   static int cnt;
   static {
	   vdarr=new Vehicle[100];
   }
   public static boolean AddNewVehicle()
   {
   	Scanner sc =new Scanner(System.in);
   	System.out.println("Enter Id ");
   	int sid=sc.nextInt();
   	sc.nextLine();
   	System.out.println("Enter the name ");
   	String n=sc.nextLine();
   	System.out.println("Type of vehicle ");
   	String  type=sc.nextLine();
   	System.out.println("Enter Purchase Date (dd//mm/yy)");
   	String dt =sc.next();
   	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

   	Date df =null;
   	try {
		df=sdf.parse(dt);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   	Vehicle s =new Vehicle (sid,n,type,df);
   	
   	if(cnt==vdarr.length)
   	{
   		return false;
   	}else 
   	{
   		vdarr[cnt]=s;
   		cnt++;
   		return true;
   	}
   }
  public static void display()
  {
	  for(int i=0;i<cnt;i++)
		  System.out.println(vdarr[i]);
  }
}


