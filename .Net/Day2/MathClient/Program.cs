using CMathlib;


namespace MathClient
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            CMath cMath = new CMath();
            cMath.Add(28, 7);
            AdvMath amath=new AdvMath();
            amath.Wrapper(10, 20);

           
            
           
        }


    }
    public class AdvMath : CMath
    {
        public void Wrapper(int x,int y)
        {
            base.mult(x,y);
            base.square(x);
            
        }
    }
}

 