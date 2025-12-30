namespace _39_LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            List<Emp> lst = new List<Emp>()
            {
                new Emp(){Id=1,Name="shruti",Address="pune"},
                new Emp(){Id=2,Name="priyanka",Address="pune"},
                new Emp(){Id=3,Name="suyog",Address="amravti"},
                new Emp(){Id=4,Name="disha",Address="nashik"},
                new Emp(){Id=5,Name="srushti",Address="nagpur"},
                new Emp(){Id=6,Name="shweta",Address="mumbai"},
                new Emp(){Id=7,Name="sakshi",Address="pune"},
            };
            Console.WriteLine("Enter city:");
            string? city = Console.ReadLine().ToLower();

            Func<Emp, bool> del = emp => emp.Address.ToLower() == city;
            foreach (Emp item in lst)
            {
                if (del(item))
                {
                    Console.WriteLine($"id:{item.Id} , Name: {item.Name} , Address: {item.Address}");
                }
            }

        }
    }
    public class Emp
    {
        public int Id { get; set; }

        public string Name { get; set; }

        public string Address { get; set; }
    }
}
