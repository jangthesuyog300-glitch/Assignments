

using Oops.logic;

namespace Oops
{
    
        internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            #region inheritance
            Person1 person=new Person1();
          
            Console.WriteLine(person.ToString());
            person.f_name = "shruti";
            person.l_name = "Jorat";
            Console.WriteLine(person);
            Console.WriteLine("Name : {0} {1}", person.f_name, person.l_name);
            #endregion
        }
    }
}
