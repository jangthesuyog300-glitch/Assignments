using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interface_Demo_1
{
    internal interface IDrink
    {
        void getDrink();
    }

    internal class ColdDrink() : IDrink
    {
        public void getDrink()
        {
            Console.WriteLine("Cold Drink");
        }
    }
    internal class HotDrink() : IDrink
    {
        public void getDrink()
        {
            Console.WriteLine("Hot Drink");
        }
    }

}
