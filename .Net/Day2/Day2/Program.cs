namespace Day2
{
    internal class Program
    {
      
        
        static void Main(string[] args)
        {
            #region unboxing
            //int x = 100;
            //object obj1 = new object();
            //obj1 = x;
            //int y = Convert.ToInt32(obj1);
            //int k = 5;
            //Int32 z = k;

            //Console.WriteLine(y);
            #endregion

            #region TypeCasting

            double d = 9.78;
            int num=Convert.ToInt32(d); //Implicity type casting 

            double b2 = num; // Explicity Type casting 
            Console.WriteLine(d);
            Console.WriteLine(num);
            Console.WriteLine(b2);

            #endregion

            
        }
    }
}