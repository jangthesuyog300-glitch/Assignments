package Day1;
class Testfun2
{

  public static int table(int n)
  {
    if(n<=1)
   {
   return 1;
   }
  else
  {
    n=1;
   for(int i=1;i<=10;i++)
    {
	  n=i*n;
	  System.out.println(n+"*"+i+"="+n);
	}
   }  
  }
  public static void main(String []  args)
  {
    int ans = Testfun2.table(n);
    if(args.length<=0)
    {
	  System.out.println("Error : pass one parameter");
	}
    else
    {
	  table(Integer.parseInt(args[0]));
	}	
  }
}