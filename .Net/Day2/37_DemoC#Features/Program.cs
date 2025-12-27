using _37_DemoC_Features;

namespace _37_DemoC_Features
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            #region Partial class
            //CMath cmath = new CMath();
            //cmath.Add(10, 20);
            //cmath.Sub(30, 15);
            #endregion

            #region Nullable reference types
            // int id = null; //error
            //int? id = null;
            //int? id = 100;
            //Nullable<int> id = null;
            //if (id.HasValue)
            //{
            //    Console.WriteLine($"{id.Value}");
            //}
            //else
            //{
            //    Console.WriteLine("id is null");    
            //}
            #endregion

            #region Object Initializers
            //    Demo demo=new Demo()
            //    {
            //        id = 101,
            //        name = "Suyog",
            //        address = "Pune"
            //    };
            //Console.WriteLine($"Id: {demo.id}, Name: {demo.name}, Address: {demo.address}");
            #endregion

            #region Collecition Initializers

            //int[] arr = new int[] {1,2,3 };
            //foreach(int i in arr)
            //{
            //    Console.WriteLine(i);
            //}
            //List<Demo> demo = new List<Demo>()
            //{
            //    new Demo(101,"suyog","yavtmal"),
            //    new Demo(102,"shruti","pune")
            //};
            //Console.WriteLine("Demo List:");
            //foreach(Demo d in demo)
            //{
            //    Console.WriteLine($"id:{d.id} , name: {d.name} , address: {d.address}");
            //}
            #endregion

            #region Auto-Properties 
            //Emp emp=new Emp()
            //{
            //    Eid = 101,
            //    Ename = "Suyog",
            //    Address = "Pune",
            //    projects =new List<string>() { "ProjectA", "ProjectB" }
            //};
            //Console.WriteLine($"id : {emp.Eid} , name: {emp.Ename} , adddr: {emp.Address}");
            //foreach(string str in emp.projects)
            //{
            //    Console.WriteLine($"Project: {str}");
            //}
            #endregion

            #region Implicit Type
            //Test test= new Test();
            //Console.WriteLine(test.getSomething(3));
            //var result=test.getSomething(2);
            //Console.WriteLine(result);
            #endregion

            #region Anonymous Type
            List<Holder> holder = new List<Holder>() { new Holder() { Id = 1, Name = "shruti", Address = "shirur" } };
            var anon = new { Id = 101, Name = "Suyog", Address = "Pune" , pincode=412210 };
            var anon1 = new { Id = 101, Name = "shruti", Address = "Pune" , pincode=412210 };
            var anon2 = new {  Name = "shruti", Address = "Pune" , pincode=412210 ,Id = 101, };
            var anon3 = new {  Name = 1, Address = "Pune" , pincode=412210 ,Id = 101, };
            Console.WriteLine(anon.GetType());
            Console.WriteLine(anon1.GetType());
            Console.WriteLine(anon2.GetType());
            Console.WriteLine(anon3.GetType());

            #endregion
        }
    }

    public class Demo
    {
        public int id;
        public string name;
        public string address;

        public Demo(int id,string name,string address)
        {
            this.id = id;
            this.name = name;
            this.address = address;
        }
    }

    public class Emp
    {
        public int Eid { get; set; }
        public string Ename { get; set; }
        public string Address { get; set; }

        public List<string> projects { get; set; }
        }

    public class Test
    {
        public object getSomething(Nullable<int> choice)
        {
            if(choice == 1)
            {
                return 100;
            }

            else if(choice == 2)
            {
                Emp emp= new Emp()
                {
                    Eid = 101,
                    Ename = "Suyog",
                    Address = "Pune"
                };
                return ($"id={emp.Eid} ,ename: {emp.Ename}");
            }
            else
            {
                return null;
            }
        }
    }

    public class Holder
    {
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? Address { get; set; }

    }
}
