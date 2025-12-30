namespace _45_Demo_Thread
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            #region By default Threads are Nameless
            //Thread t = Thread.CurrentThread;
            //t.Name = "Main Thread";
            //Console.WriteLine(t.ManagedThreadId);
            //Console.WriteLine(t.Name);
            #endregion

            #region Normal methods call without threads
            //F1();
            //Method1();
            //Method2();
            #endregion

            #region custom thread and ThreadStart delegate
            //Thread t1 = new Thread(Method1) { Name = "th 01" };
            //Thread t2 = new Thread(Method2) { Name = "th 02" };

            //ThreadStart ts = new ThreadStart(() =>
            //{
            //    Console.WriteLine("method calling..");
            //});

            //Thread t4 = new Thread(ts);
            //t4.Start();
            #endregion

            #region isAlive And Join Method
            Console.WriteLine("Main method Execution start");
            Thread t5 = new Thread(Program.F1);
            t5.Start();
            Thread t6 = new Thread(Program.F2);
            t6.Start();

            if (t5.Join(2000))
            {
                Console.WriteLine("F1 Execution completed ");
            }
            t6.Join();
            Console.WriteLine("F2 Execution completed ");


            if (t5.IsAlive)
            {
                Console.WriteLine("F1 execution is still going on");
            }
            else
            {
                Console.WriteLine("F1 execution is complete");
            }

            Console.WriteLine("Main method execution complete");

            #endregion

        }

        static void F1()
        {
            Console.WriteLine("F1 method execution started");
            Thread.Sleep(1000);
            Console.WriteLine("method F1 is awake");
            Console.WriteLine("F1 execution complete");
        }

        static void F2()
        {
            Console.WriteLine("F2 method execution started");
        }

        static void Method1()
        {
            Console.WriteLine("method1 Started using {0}\", Thread.CurrentThread.Name");
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("Method1-count{0}", i);
            }
        }

        static void Method2()
        {
            Console.WriteLine("Method2 Started using {0}", Thread.CurrentThread.Name);

            for (int i = 0; i <= 5; i++)
            {
                Console.WriteLine("Method2 - Count: {0}", i);
                if (i == 2)
                {
                    Console.WriteLine("Execution code started");
                    Thread.Sleep(5000);
                    Console.WriteLine("Execution code completed");
                }
            }

            Console.WriteLine("Method2 Ended using {0}", Thread.CurrentThread.Name);
        }
    }
}
