using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace _29_Demo_Reflection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            string AssemblyPath = @"C:\Users\IET\Desktop\250845920096\.Net\Day2\30_1_MyMath\obj\Debug\30_1_MyMath.dll";
            Assembly assm = Assembly.LoadFrom(AssemblyPath);
            Type[] allType = assm.GetTypes();
            for (int i = 0; i < allType.Length; i++)
            {
                Type type = allType[i];

                object dynamicallyCreatedObject = assm.CreateInstance(type.FullName);
                string methodSignature = "";

                Console.WriteLine(type.FullName);
                Console.WriteLine(type.Name);
                Console.WriteLine(type.IsAbstract.ToString());

                MethodInfo[] allmethods = type.GetMethods();
                for (int j = 0; j < allmethods.Length; j++)
                {
                    MethodInfo method = allmethods[j];
                    methodSignature = method.ReturnType.ToString() + " " + method.Name + "(";

                    ParameterInfo[] allParameters = method.GetParameters();
                    for (int k = 0; k < allParameters.Length; k++)
                    {
                        ParameterInfo parameter = allParameters[k];
                        methodSignature = methodSignature + parameter.ParameterType.ToString();
                    }
                    methodSignature = methodSignature.TrimEnd(',') + ")";
                    Console.WriteLine(methodSignature);

                    Object[] inputValues=new Object[allParameters.Length];
                    for(int p = 0; p < allParameters.Length; p++)
                    {
                        ParameterInfo para=allParameters[p];
                        Console.WriteLine($"Enter value for {para.Name} of type = {para.ParameterType.ToString()}");
                        
                        inputValues[p] = Convert.ChangeType(Console.ReadLine(),para.ParameterType);
                    }
                    methodSignature = methodSignature.TrimEnd(',') + ")";
                    Console.WriteLine(methodSignature);

                    Object? result = type.InvokeMember(
                                        method.Name,
                                        BindingFlags.Public |
                                        BindingFlags.Instance |
                                        BindingFlags.InvokeMethod,
                                        null,
                                        dynamicallyCreatedObject,
                                        inputValues
                        );
                    Console.WriteLine($"Method name: {method.Name} {result}");
                }

            }
        }

    }
}
