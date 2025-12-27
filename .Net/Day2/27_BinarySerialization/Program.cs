using System.Runtime.Serialization.Formatters.Binary;

namespace _27_BinarySerialization
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string FilePath = @"C:\Users\IET\Desktop\250845920096\.Net\Day2\27_BinarySerialization\data.txt";
            Emp emp = new Emp();
            emp.EId = 101;
            emp.EName = "Tony Stark";
            emp.Address = "ShivajiNagar";

            FileStream fs = null;
            if (File.Exists(FilePath))
            {
                fs = new FileStream(FilePath, FileMode.Append, FileAccess.Write);
            }
            else
            {
                fs = new FileStream(FilePath, FileMode.OpenOrCreate, FileAccess.Write);
            }

            BinaryFormatter bf = new BinaryFormatter();
            bf.Serialize(fs, emp);
            fs.Close();
            Console.WriteLine("Done.");

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
