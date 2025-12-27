namespace Delegates_demo1
{
    public delegate void Delegate1();
    public delegate void Delegate2(int x,int y);
    public delegate void Delegate3(int x);


    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            CMath cmath=new CMath();
            Console.WriteLine("enter first number: ");
            int num1 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("enter second number: ");
            int num2 = Convert.ToInt32(Console.ReadLine());

            Delegate1 del1 = new Delegate1(cmath.SayHello);
            del1.Invoke();

            Delegate2 del2=new Delegate2(cmath.Add);
            del2(num1, num2);

            Delegate3 del3=new Delegate3(cmath.square);
            del3(num1);
        }
    }

    public class CMath
    {
        public void Add(int x,int y)
        {
            Console.WriteLine($"add:{x + y}");
        }

        public void square(int x)
        {
            Console.WriteLine($"square {x*x}");
        }
        public void SayHello()
        {
            Console.WriteLine("hello");
        }
    }
}
