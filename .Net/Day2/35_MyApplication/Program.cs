using System.Reflection;
using ST;
using _33_Employee;

namespace _35_MyApplication
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string asmPath = @"C:\Users\IET\Desktop\250845920096\.Net\Day2\33_Employee\bin\Debug\33_Employee.dll";
            Assembly asm=Assembly.LoadFrom(asmPath);
            Type[] types = asm.GetTypes();
            for (int i=0;i<types.Length;i++)
            {
                Type type = types[i];
                Console.WriteLine(type.Name);
                Attribute[] allAttributes = type.GetCustomAttributes().ToArray();

                for (int j = 0; j < allAttributes.Length; j++)
                {
                    Attribute attr = allAttributes[j];
                    if(attr is SuyogTransport)
                    {
                        SuyogTransport st= attr as SuyogTransport;
                        Console.WriteLine($" class{type.Name} is founded by {st.Owername} of {st.Company}");
                    }
                    if (attr is SerializableAttribute)
                    {
                        Console.WriteLine($"Class{type.Name} is marked as a Serializable");
                    }
                }
            }
        }
    }
}
