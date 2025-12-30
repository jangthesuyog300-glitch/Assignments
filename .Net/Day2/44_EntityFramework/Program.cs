using _44_EntityFramework.DAL;
using _44_EntityFramework.Models;

namespace _44_EntityFramework
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            IETDbContext _DbContext= new IETDbContext();
        }
    }
}
