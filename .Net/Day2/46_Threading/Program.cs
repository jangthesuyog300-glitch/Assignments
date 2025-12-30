using System.Diagnostics;

namespace _46_Threading
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Nomal Method Call : Time taken = 26469966 
            //Stopwatch sw = Stopwatch.StartNew();
            //sw.Start();
            //for (int i = 0; i < 10; i++)
            //{
            //    DoSomeThingComplex();
            //}
            //sw.Stop();
            //Console.WriteLine("Time taken = {0}", sw.ElapsedTicks);
            #endregion

            #region Thread Time taken = 5043830
            //Stopwatch sw = Stopwatch.StartNew();
            //sw.Start();
            //for (int i = 0; i < 10; i++)
            //{
            //    Thread t1=new Thread(new ThreadStart(new ThreadStart(DoSomeThingComplex))); 
            //    t1.Start();
            //    Console.WriteLine("Current Thread ID:{0}",Thread.CurrentThread.ManagedThreadId);
            //}
            //sw.Stop();
            //Console.WriteLine("Time taken = {0}", sw.ElapsedTicks);
            #endregion

            #region Explicit Parallel Programming - Multiple Tasks : Time taken = 61284
            //Stopwatch sw = Stopwatch.StartNew();
            //sw.Start();
            //for (int i = 0; i < 10; i++)
            //{
            //   Task t1=new Task(new Action(DoSomeThingComplex));
            //    t1.Start();
            //    Console.WriteLine("Current Task ID:{0}", t1.Id.ToString());
            //}
            //sw.Stop();
            //Console.WriteLine("Time taken = {0}", sw.ElapsedTicks);
            #endregion

            #region Parallel.Foreach - Implicit Parallel Prog.
            //int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            //Stopwatch watch = new Stopwatch();
            //watch.Start();
            ////foreach(var item in arr)
            ////{
            ////    Console.WriteLine($"Number:{item} ,Thread Id: {Thread.CurrentThread.ManagedThreadId} ");
            ////}
            //Parallel.ForEach(arr, number => {
            //    Console.WriteLine($"Number:{number} ,Thread Id: {Thread.CurrentThread.ManagedThreadId} ");

            //});
            //watch.Stop();
            //Console.WriteLine("Time taken = {0}", watch.ElapsedTicks);
            #endregion

            #region Parallel LINQ
            List<Emp> allEmployees = new List<Emp>() {
             new Emp(){ ID =11,Name ="Jignesh", Address ="Patna"},
             new Emp(){ ID =12,Name ="Prathamesh", Address ="Nashik"},
             new Emp(){ ID =13,Name ="Devendra", Address ="Nagpur"},
             new Emp(){ ID =14,Name ="Kalpesh", Address ="Kerla"},
             new Emp(){ ID =15,Name ="kushendra", Address ="Indore"}
            };

            var result = (from emp in allEmployees.AsParallel()
                          where emp.Address.StartsWith("N")
                          select emp).ToList();

            foreach (var emp in result)
            {
                Console.WriteLine($"Name: {emp.Name}, Address: {emp.Address}");
            }
            #endregion

        }
        public static void DoSomeThingComplex()
        {
            for (int i = 0; i < 100000; i++)
            {
                for (int j = 0; j < 1000; j++)
                {
                    //Nothing here..
                }
            }
        } 
    }
    public class Emp
    {
        public int ID { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
    }
}

