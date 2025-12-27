using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritace
{
    public class Base
    {
        private int id;
        public Base(int id)
        {
            this.id = id;
            Console.WriteLine("This pass id ={0}",id);
        }
        public Base()
        {
            Console.WriteLine("Default contructor");
        }
        public void Method1()
        {
            Console.WriteLine("This is the base method 1");

        }

    }
    public class Derive: Base
    {
        public Derive(int num):base(num)
        {

        }
        public void Method2()
        {
            Console.WriteLine("This is the Derive method 2");

        }


    }

}
