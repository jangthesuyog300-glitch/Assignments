using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace CMathlib
{
    public class CMath
    {
        public void Add(int x, int y)
        {
            Console.WriteLine($"Addition: {x + y}");
        }

        private void Sub(int x, int y)
        {
            Console.WriteLine($"Subtraction: {x - y}");
        }

        protected void mult(int x, int y)
        {
            Console.WriteLine($"Multi: {x * y}");
        }
        internal void div(int x, int y)
        {
            Console.WriteLine($"div: {x / y}");
        }
        protected internal void square(int x)
        {
            Console.WriteLine($"square: {x * x}");
        }            
        }
    public class AdvMath: CMath
    {
        public void Wrapper(int x,int y)
        {
            mult(x,y);
            div(x,y);
            square(x);
        }

        

    }
  
}

