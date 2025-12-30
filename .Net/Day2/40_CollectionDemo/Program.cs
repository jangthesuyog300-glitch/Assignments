namespace _40_CollectionDemo
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


            #region Lazy Loading of LINQ
            // Console.WriteLine("Enter city:");
            // string? city = Console.ReadLine().ToLower();

            // var result = from emp in lst
            //              where emp.Address.ToLower().StartsWith(city)
            //              select emp;

            // lst.Add(new Emp() { Id = 8, Name = "suhani", Address="nashik" });

            //foreach(Emp emp in result)
            // {
            //     Console.WriteLine($"id: {emp.Id}, name:{emp.Name},address:{emp.Address}");
            // }
            #endregion

            #region LinQ with ToList()
            //Console.WriteLine("Enter city:");
            //string? city = Console.ReadLine().ToLower();

            //var result = (from emp in lst
            //              where emp.Address.ToLower().StartsWith(city)
            //              select emp).ToList();

            //lst.Add(new Emp() { Id = 8, Name = "suhani", Address = "nashik" });

            //foreach (Emp emp in result)
            //{
            //    emp.GetDetails();
            //}
            #endregion

            #region LINQ with tuple()
            //Console.WriteLine("Enter city:");
            //string? city = Console.ReadLine().ToLower();

            //var result = (from emp in lst
            //              where emp.Address.ToLower().StartsWith(city)
            //              select (emp.Name, emp.Address)).ToList();

            //lst.Add(new Emp() { Id = 8, Name = "suhani", Address = "nashik" });

            //foreach (var element in result)
            //{
            //    Console.WriteLine($"name:{element.Name} address:{element.Address}")
            //}
            #endregion

            #region LINQ with Holder Class
            Console.WriteLine("Enter city:");
            string? city = Console.ReadLine().ToLower();

            var result = (from emp in lst
                          where emp.Address.ToLower().StartsWith(city)
                          select new { id = emp.Id, name = emp.Name, add = emp.Address }).ToList();


            foreach (var A_type in result)
            {
                Console.WriteLine($"id: {A_type.id}name:{A_type.name} address:{A_type.add}");
            }
            #endregion
        }
    }
   

    public class Holder
    {
        public int Id { get; set; }

        public string Name { get; set; }

        public string Address { get; set; }

        public void GetDetails()
        {
            Console.WriteLine($"Id: {this.Id}, Name: {this.Name}, Address: {this.Address} ");
        }
    }

    public class Emp
    {
        public int Id { get; set; }

        public string Name { get; set; }

        public string Address { get; set; }

        public void GetDetails()
        {
            Console.WriteLine($"Id: {this.Id}, Name: {this.Name}, Address: {this.Address} ");
        }
    }
}
