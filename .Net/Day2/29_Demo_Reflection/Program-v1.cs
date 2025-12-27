//using System.Reflection;

//namespace _29_Demo_Reflection
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {
//            Console.WriteLine("Hello, World!");
//            string AssemblyPath = @"C:\Users\IET\Desktop\250845920096\.Net\Day2\30_1_MyMath\obj\Debug\30_1_MyMath.dll";
//            Assembly assm = Assembly.LoadFrom(AssemblyPath);
//            Type[] allType = assm.GetTypes();
//            for (int i = 0; i < allType.Length; i++)
//            {
//                Type type = allType[i];

//                Console.WriteLine(type.FullName);
//                Console.WriteLine(type.Name);
//                Console.WriteLine(type.IsAbstract.ToString());

//                MethodInfo[] allmethods = type.GetMethods();
//                for(int j = 0; j < allmethods.Length; j++)
//                {
//                    MethodInfo method=allmethods[j];
//                    Console.WriteLine($"Method Name : {method.Name},return Type: {method.ReturnType.ToString()}");
//                }

//            }
//        }
//    }
//}
