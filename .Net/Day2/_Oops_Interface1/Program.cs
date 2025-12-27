using _Oops_Interface1;
namespace _Oops_Interface1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("enter your dbchoice: ");
            Console.WriteLine("1. MySql Server ");
            Console.WriteLine("2. Sql Server ");
            Console.WriteLine("3. Oracle Server ");
            int dbchoice=Convert.ToInt32(Console.ReadLine());

            DataBaseFactory factory = new DataBaseFactory();
            Iinterface somedatabase=factory.getSomeDatabase(dbchoice);
            Console.WriteLine("enter db operation choice:");
            Console.WriteLine("1. insert");
            Console.WriteLine("2. update");
            Console.WriteLine("3. delete");
            int opchoice = Convert.ToInt32(Console.ReadLine());
            switch (opchoice)
            {
                case 1:
                    somedatabase.insert();
                    break;

                case 2:
                    somedatabase.update();
                    break;

                case 3:
                    somedatabase.delete();
                    break;

                default:
                    Console.WriteLine("invalid choice");
                    break;
            }

        }
    }
}
