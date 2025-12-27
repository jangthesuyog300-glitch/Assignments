
using System.Text.Json;
using System.Xml.Serialization;

namespace _28_DemoSerialization
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            string FilePath = @"C:\Users\IET\Desktop\250845920096\.Net\Day2\28_DemoSerialization\data3.xml";
            string FilePath1 = @"C:\Users\IET\Desktop\250845920096\.Net\Day2\28_DemoSerialization\data3.json";

            #region XML Seralization
            Emp emp = new Emp();
            emp.EId = 12;
            emp.EName = "Tony Stark";
            emp.Address = "Pune";

            //XmlSerializer xr = new XmlSerializer(typeof(Emp));

            //FileStream fs = null;
            //if (File.Exists(FilePath))
            //{
            //    fs = new FileStream(FilePath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(FilePath, FileMode.OpenOrCreate, FileAccess.Write);
            //}
            //xr.Serialize(fs, emp);
            //fs.Close();
            //Console.WriteLine("Done.");
            #endregion
            #region XML Desrialization

            //if (File.Exists(FilePath))
            //{
            //    fs = new FileStream(FilePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exists");
            //}

            //Emp empData = xr.Deserialize(fs) as Emp;
            //fs.Close();
            //Console.WriteLine($"emp_id={empData.EId} , Emp Name= {empData.EName}, Adress= {empData.Address}");
            #endregion

            #region JSON


            //FileStream fs = null;
            //if (File.Exists(FilePath1))
            //{
            //    fs = new FileStream(FilePath1, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(FilePath1, FileMode.OpenOrCreate, FileAccess.Write);
            //}
            //JsonSerializer.Serialize<Emp>(fs, emp);
            //fs.Close();
            //Console.WriteLine("Done.");
            #endregion

            #region
            FileStream fs = null;
            if (File.Exists(FilePath1))
            {
                fs = new FileStream(FilePath1, FileMode.Open, FileAccess.Read);
            }
            else
            {
               Console.WriteLine("File can't find");
            }
            Emp e=JsonSerializer.Deserialize<Emp>(fs); 
            fs.Close();
            Console.WriteLine($"Id : {e.EId}, Name  : {e.EName}, Address : {e.Address}");
            #endregion
        }

    }

    public class Emp
    {
        private int _EId;
        private string _EName;
        private string _Address;

        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }

        public string EName
        {
            get { return _EName; }
            set { _EName = value; }
        }

        public int EId
        {
            get { return _EId; }
            set { _EId = value; }
        }

    }
}
