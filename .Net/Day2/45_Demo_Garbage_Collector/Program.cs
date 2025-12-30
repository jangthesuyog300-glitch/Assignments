namespace _45_Demo_Garbage_Collector
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            using (MyClass obj = new MyClass())
            {
                obj.SayHi();
            }

             GC.Collect(2);
            Console.WriteLine(GC.MaxGeneration);

            MyClass obj3 = new MyClass();
            Console.WriteLine(GC.GetGeneration(obj3));

            GC.WaitForPendingFinalizers();
        }

        public class MyClass : IDisposable
        {
            public void Dispose()
            {
                Console.WriteLine("Dispose method gets called...");
                GC.SuppressFinalize(this);
            }
            public void SayHi()
            {
                Console.WriteLine("Hi");
            }

        }
    }
   
}
