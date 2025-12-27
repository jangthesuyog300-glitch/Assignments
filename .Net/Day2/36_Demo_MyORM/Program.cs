using _34_Table;

using System.Reflection;


namespace _36_Demo_MyORM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string asmPath = @"C:\Users\IET\Desktop\250845920096\.Net\Day2\33_Employee\bin\Debug\33_Employee.dll";
            Assembly asm = Assembly.LoadFrom(asmPath);
            Type[] types = asm.GetTypes();

            for (int i = 0; i < types.Length; i++)
            {
                Type type = types[i];
                Console.WriteLine(type.Name);
                string createTableQuery = "CREATE TABLE ";
                Attribute[] allAttributes = type.GetCustomAttributes().ToArray();

                for (int j = 0; j < allAttributes.Length; j++)
                {
                   
                    Attribute attr=allAttributes[j];
                    Console.WriteLine(attr);
                    if (attr is MyTableAttribute) { 
                      MyTableAttribute tableattr = attr as MyTableAttribute;
                        createTableQuery = createTableQuery + tableattr.TableName + " ( ";
                    }
                }
                PropertyInfo[] allproperty = type.GetProperties(); 

                for(int k=0;k < allproperty.Length;k++)
                {
                    PropertyInfo prop = allproperty[k];
                    Attribute[] atrr= prop.GetCustomAttributes().ToArray();


                    for (int l=0;l<atrr.Length;l++)
                    {
                        Attribute attr1=atrr[l]; 

                        if(attr1 is MyColumnAttribute)
                        {
                            MyColumnAttribute col = attr1 as MyColumnAttribute;
                            createTableQuery = createTableQuery + col.ColumnName + " " + col.ColumnType + ",";


                        }
                    }
                }

                createTableQuery = createTableQuery.TrimEnd(',') + " )";

                Console.WriteLine(createTableQuery);
                string filePath = @"C:\Users\IET\Desktop\250845920096\.Net\Day2\36_Demo_MyORM\CreateTableQueries.sql";

                File.WriteAllText(filePath, createTableQuery); 

                Console.WriteLine("Done.");
            }
        }
    }
}

