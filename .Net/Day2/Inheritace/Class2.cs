using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritace
{
    internal class CMath
    {
        public void Add(int a,int b)
        {
            Console.WriteLine("CMath Add = {0}",a+b);
        }
        public virtual void sub(int a,int b)
        {
            Console.WriteLine("CMath Sub = {0}",a-b);
        }
        public void Add(int a, int b, int c)
        {
            Console.WriteLine("CMath2 add = {0}", a + b + c);
        }
    }
    internal class CMath2:CMath
    {
        public new void Add(int a, int b)
        {
            Console.WriteLine("CMath2 Add = {0}", a + b+10);
        }
        public override void sub(int a, int b)
        {
            Console.WriteLine("CMath2 Sub = {0}", a - b+100);
        }
        

    }
}
