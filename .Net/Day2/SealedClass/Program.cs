namespace SealedClass
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            CMath cmath=new CMath();
            int x= cmath.Add(10, 11);
            Console.WriteLine("Addition:{0}",x);
            MyMath mmath=new MyMath();
            int y=mmath.WrappAdd(20, 30);
            Console.WriteLine(y);
            Console.WriteLine(mmath.square(5));
            Console.WriteLine(mmath.Sayhi());

        }

    }
    public sealed class CMath
    {
        public int Add(int x, int y)
        {
            return x + y;
        }
        public int Sub(int x, int y)
        {
            return x - y;
        }
    }

    public class AdvanceMath
    {
        public int WrappAdd(int x, int y)
        {
            CMath cmath = new CMath();

            return cmath.Add(x, y);
        }
        public virtual int square(int x)
        {
            return (x * x);
        }
    }
    public class MyMath : AdvanceMath
    {
        public string Sayhi()
        {
            return "hello";
        }
        public sealed override int square(int x)
        {
            return x * x * 100;
        }
    }
}
