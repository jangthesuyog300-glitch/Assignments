namespace _26_DemoFile_IO
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            string FilePath = @"C:\Users\IET\Desktop\250845920096\.Net\Day2\26_DemoFile_IO\Data.txt";
            #region StreamWriter
            FileStream fs = null;
            if (!File.Exists(FilePath))
            {
               fs = new FileStream(FilePath, FileMode.OpenOrCreate, FileAccess.Write);
            }
            else
            {
                fs = new FileStream(FilePath, FileMode.Append, FileAccess.Write);
            }
                StreamWriter writer = new StreamWriter(fs);
            writer.WriteLine("Hello from File I/O in c#");
            writer.Flush();
            writer.Close();
            fs.Close();
            Console.WriteLine("Done.");
            #endregion

            #region StreamReader
            if (File.Exists(FilePath)) { 
                fs = new FileStream(FilePath, FileMode.Open, FileAccess.Read);
            }
            else
            {
                Console.WriteLine("File don't exist");
            }
                StreamReader read = new StreamReader(fs);
            string Content = read.ReadToEnd();
            read.Close();
            fs.Close();
            Console.WriteLine(Content);
            #endregion
        }
    }
   
}
