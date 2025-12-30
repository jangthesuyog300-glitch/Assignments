using _44_DemoEntityFW.DAL;
using _44_DemoEntityFW.Models;

namespace _44_DemoEntityFW
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IETDbContext _DbContext=new IETDbContext();

            while (true) 
            {
                Console.WriteLine("1.Select 2.Insert 3.Update 4.Delete");
                Console.WriteLine("Enter the Choice : ");
                int Choice = Convert.ToInt32(Console.ReadLine());
                switch (Choice)
                {
                    case 1:
                        List<Emp> allEmp = _DbContext.Emp.ToList();
                        foreach(var item in allEmp)
                        {
                            Console.WriteLine($"Id : {item.Id} Name : {item.Name} Address : {item.Address}");
                        }
                         break;
                    case 2:
                        Emp emp = new Emp();
                        Console.WriteLine("Enter the Name :");
                        emp.Name=Console.ReadLine();
                        Console.WriteLine("Enter the Address :");
                        emp.Address = Console.ReadLine();
                        _DbContext.Emp.Add(emp);
                        _DbContext.SaveChanges();
                        break;
                    case 3:
                        Console.WriteLine("Enter the Id : ");
                        int id = Convert.ToInt32(Console.ReadLine());
                        Emp UpdateEmp= _DbContext.Emp.Find(id);
                        Console.WriteLine("Enter the name : ");
                        UpdateEmp.Name=Console.ReadLine();
                        Console.WriteLine("Enter the Address : ");
                        UpdateEmp.Address=Console.ReadLine();
                        _DbContext.SaveChanges();

                        break;
                    case 4:
                        Console.WriteLine("Enter the Id : ");
                        id = Convert.ToInt32(Console.ReadLine());
                         Emp DeleteEmp = _DbContext.Emp.Find(id);
                        _DbContext.Emp.Remove(DeleteEmp);
                        _DbContext.SaveChanges();
                        break;

                    default: Console.WriteLine("Invalid Choice :");
                        break;


                }
                Console.WriteLine("Do you Wish to continue(y/n)");
                string ch= Console.ReadLine();
                if(ch == "n")
                {
                    break;
                }

            }

        }
    }
}
