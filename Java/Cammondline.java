class Cammondline
{
  public static void main (String [] args)
  {
     if(args.length<=0)
	 {
	   System.out.println("Error : Pass the one parameter ");
	 }
	 
	 else 
	 {
	   int sum=0;
	   for(int i=0;i<args.length;i++)
	   {
	      sum = sum +Integer.parseInt(args[i]);
	   }
	   System.out.println("sum = "+sum);
	 }
  }
}