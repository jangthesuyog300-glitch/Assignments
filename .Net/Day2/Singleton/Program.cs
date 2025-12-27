namespace Singleton
{
    internal class Program
    {
        static void Main(string[] args)
        {
            DatabaseFactory factory = new DatabaseFactory();
            Database db = factory.getDatabaseName();

            Console.WriteLine("enter choice :");
            Console.WriteLine("1.Insert");
            Console.WriteLine("2.Update");
            Console.WriteLine("3.Delete");
            int choice=Convert.ToInt32(Console.ReadLine());
            switch (choice) 
            {
                case 1:
                    db.Insert();
                    break;

                case 2:
                    db.Update(); 
                    break;

                case 3:
                    db.Delete();
                    break;

                default:
                    Console.WriteLine("Invalid Choice");
                    break;
            }
        }
    }

    public abstract class Database
    {
        public Logger _logger = null;
        public Database()
        {
            _logger = Logger.getLogger();
        }
        protected abstract void DoInsert();
        protected abstract void DoUpdate();
        protected abstract void DoDelete();
        protected abstract string getDatabaseName();

        public void Insert()
        {
            DoInsert();
            _logger.Log($"Insert From {getDatabaseName()} done.");
        }
        public void Update()
        {
            DoInsert();
            _logger.Log($"Update From {getDatabaseName()} done.");
        }
        public void Delete()
        {
            DoInsert();
            _logger.Log($"Delete From {getDatabaseName()} done.");
        }
    }

    public class DatabaseFactory
    {
        public Database getDatabaseName()
        {
            Console.WriteLine("enter choice: ");
            Console.WriteLine("1.MySql ");
            Console.WriteLine("2.oracle");
            Database dbt = null;
            int dbchoice=Convert.ToInt32(Console.ReadLine());
            switch (dbchoice)
            {
                case 1:
                    dbt = new MySql();
                    break;

                case 2:
                    dbt = new Oracle();
                    break;

                default:
                    Console.WriteLine("Invalid choice");
                    break;
            }
            return dbt;
        }
    }

    public class MySql : Database
    {
        protected override void DoDelete()
        {
            Console.WriteLine("Record Deleted in MySql Successfylly");
        }

        protected override void DoInsert()
        {
            Console.WriteLine("Record Inserted in MySql Successfylly");
        }

        protected override void DoUpdate()
        {
            Console.WriteLine("Record Update in MySql Successfylly");
        }

        protected override string getDatabaseName()
        {
            return " MySql";
        }
    }
    public class Oracle : Database
    {
        protected override void DoDelete()
        {
            Console.WriteLine("Record Deleted in Oracle Successfylly");
        }

        protected override void DoInsert()
        {
            Console.WriteLine("Record Inserted in Oracle Successfylly");
        }

        protected override void DoUpdate()
        {
            Console.WriteLine("Record Update in Oracle Successfylly");
        }

        protected override string getDatabaseName()
        {
            return " Oracle";
        }
    }

    public class Logger
    {
        private static readonly Logger _logger1=new Logger();
        private Logger() {
            Console.WriteLine("Logger object is created for the first time");
        }
        public static Logger getLogger()
        {
            return _logger1;
        }
        public void Log(string message)
        {
            Console.WriteLine("logged at {0} , message : {1}",DateTime.Now.ToString(),message);
        }

    }
}
