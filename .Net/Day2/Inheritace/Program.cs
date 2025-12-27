using Inheritace;
namespace Inheritace
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Derive D = new Derive(10);

            D.Method1();

            CMath2 cMath2 = new CMath2();

            cMath2.Add(1,2);  
            cMath2.Add(2,3,1);
            cMath2.sub(1,2);
        }
    }
}
