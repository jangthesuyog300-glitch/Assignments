namespace _04_Properties
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Employee emp=new Employee();
            emp.Eid = 10;
            int x=emp.Eid;
            Console.WriteLine($"id: {x}");
            emp.Ename = "Mugdha";
            Console.WriteLine($"Name: {emp.Ename}");
            
        }

    }
    public class Employee
    {
        private int _Eid;
        private string _Ename;

        public  int Eid
        {
            set
            {
                _Eid = value;
            }
            get
            {
                return _Eid;
            }
            }

        public string Ename {
            set
            {
                
                if (value != null)
                {
                    _Ename = "Mr/Mrs." + value;
                }
                else
                {
                    _Ename = "Invalid Format";
                }
            }
            get
            {
                return _Ename;
            }
        }
    }
    }
