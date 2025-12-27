using System.Collections;
using System.Linq.Expressions;

namespace _22_Collection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region int[]
            //int[] arr = new int[5];
            //arr[0] = 1;         
            //arr[1] = 2;
            //arr[2] = 3;
            //arr[3] = 4;
            //arr[4] = 5;

            //for (int i=0;i<arr.Length;i++)
            //{
            //    Console.WriteLine(arr[i]);
            //}
            #endregion

            #region String []
            //string[] str = new string[5];
            //str[0] = "A";
            //str[1] = "B";
            //str[2] = "C";
            //str[3] = "D";
            //str[4] = "E";
            //for(int i=0;i<str.Length;i++)
            //{
            //    Console.WriteLine(str[i]);
            //}
            #endregion
            
            Emp emp = new Emp();
            emp.Eid = 1;
            emp.Ename = "Suyog";
            Emp emp1 = new Emp();
            emp1.Eid = 2;
            emp1.Ename = "Shruti";

            Emp emp2 = new Emp();
            emp2.Eid = 3;
            emp2.Ename = "bala";
            #region Emp[]
            Emp[] emps = new Emp[3];
            emps[2] = emp1;
            emps[1] = emp2;
            emps[0] = emp;
            //for (int i = 0; i < emps.Length; i++)
            //{
            //    Console.WriteLine($"Emp Id :{emps[i].Eid} , Emp Name :{emps[i].Ename}");
            //}
            #endregion
            #region Objects[]
            //Object[] obj = new Object[5];
            //obj[0] = 1;
            //obj[1] = "Suyog";
            //obj[2] = emp1;

            //for (int i = 0; i < obj.Length; i++)
            //{
            //    Object element = obj[i];
            //    if (element is Emp)
            //    {
            //        Emp e1=element as Emp;
            //        Console.WriteLine($"Id : {e1.Eid},Name : {e1.Ename}, type : {element.GetType().ToString}");  
            //    }
            //    if (element is int)
            //    {
            //        int ii=Convert.ToInt32(element);
            //        Console.WriteLine($"value :{ii} type : {element.GetType().ToString}");
            //    }
            //    if (element is string)
            //    {
            //        string i1 = Convert.ToString(element);
            //        Console.WriteLine($"value :{i1} type : {element.GetType().ToString}");
            //    }
            //}
            #endregion
            //Non-Generic: 1.ArrayList 2.HashTable
            #region ArrayList
            //ArrayList arr= new ArrayList();
            //arr.Add(emp);
            //arr.Add(1);
            //arr.Add(28.77);

            //for(int i = 0; i < arr.Count; i++)
            //{
            //    Object element = arr[i];
            //    if(element is Emp)
            //    {
            //        Emp e1 = element as Emp;
            //        Console.WriteLine($"value= eid: {e1.Eid} ename: {e1.Ename} , Type= {element.GetType().ToString()}");
            //    }

            //    if(element is int)
            //    {
            //        int i2=Convert.ToInt32(element);
            //        Console.WriteLine($"Value: {i2}, Type:{element.GetType().ToString()}  ");
            //    }

            //    if(element is double)
            //    {
            //        double d=Convert.ToDouble(element);
            //        Console.WriteLine($"value: {d}, type: {element.GetType().ToString()}");
            //    }
            //}
            #endregion

            #region HashTable
            //Hashtable ht=new Hashtable();

            //ht.Add(1, emp);
            //ht.Add('p', 's');
            //ht.Add(0, true);

            //for(int i = 1; i < ht.Count; i++)
            //{
            //    foreach(Object Key in ht.Keys)
            //    {
            //        Console.WriteLine(Key);
            //    }
            //    foreach(Object Value in ht.Values)
            //    {
            //        Console.WriteLine(Value);
            //    }
            //    foreach(Object Key in ht.Keys)
            //    {
            //        Console.WriteLine($"keys: {Key} , values: {ht[Key]}");
            //    }
            //}
            #endregion

            //Generic
            #region List<int>
            List<int> numbers = new List<int>();
            numbers.Add(10);
            numbers.Add(20);
            numbers.Add(30);

            for (int i = 0; i < numbers.Count; i++)
            {
                Console.WriteLine(numbers[i]);
            }
            #endregion
        }
    }
    public class book
    {
        private string _bookName;

        public string BookName
        {
            get { return _bookName; }
            set { _bookName = value; }
        }

        private string _author;

        public string Author
        {
            get { return _author; }
            set { _author = value; }
        }

    }

    public class Emp {
        private int E_id;
        private string  ename;

        public string  Ename
        {
            get { return ename; }
            set { ename = value; }
        }


        public int Eid
        {
            get { return E_id; }
            set { E_id = value; }
        }

    }


}
