using System.Collections;
using System.Collections.Generic;

namespace _38_democ_features2
{
    public delegate bool MyDelegate(int num);
    internal class Program
    {
        static void Main(string[] args)
        {

            //Console.WriteLine("Hello, World!");
            //Console.WriteLine("enter a no");
            //int no = Convert.ToInt32(Console.ReadLine());

            #region check method
            //Console.WriteLine("enter a no");
            //int no = Convert.ToInt32(Console.ReadLine());

            //if (check(no))
            //{
            //    Console.WriteLine($"{no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"{no} is less than 10");
            //}
            #endregion

            #region check method with delegate
            //Console.WriteLine("enter a no");
            //int no = Convert.ToInt32(Console.ReadLine());
            //MyDelegate del1 = new MyDelegate(check);
            //var result = del1(no);
            //if (result)
            //{
            //    Console.WriteLine($"{no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"{no} is less than 10");
            //}

            #endregion

            #region Anonymous method delegate with MyDelegate method
            //MyDelegate del2 = new MyDelegate(delegate (int no)
            //{
            //    return no > 10;
            //});

            //MyDelegate del2 = delegate (int no)
            //{
            //    return no > 10;
            //};
            // var result = del2(no);
            //if (result)
            //{
            //    Console.WriteLine($"{no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"{no} is less than 10");

            //}
            #endregion

            #region Lambda expression
            //MyDelegate del3 = (int num) =>
            //{
            //    return num > 10;
            //};

            //MyDelegate del3 = num => num > 10;

            //var result = del3(no);
            //if (result)
            //{
            //    Console.WriteLine($"{no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"{no} is less than 10");

            //}
            #endregion

            #region Predicate<T>
            //Predicate<int> del4 = num => num > 10;

            //var result = del4(no);
            //if (result)
            //{
            //    Console.WriteLine($"{no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"{no} is less than 10");

            //}
            #endregion

            #region in-built sum method and MySum method
            //int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            //var result = arr.Sum();
            //Console.WriteLine($"Sum = {result}");

            //var result1 = Mysum(arr);
            //Console.WriteLine($"Sum2 = {result1}");

            //string[] names = new string[] { "Abc", "def", "hij", "klm" };
            //var result2 = Mysum(names);
            //Console.WriteLine($"sum3={result2}");


            #endregion

            #region check validity for emailId
            //Console.WriteLine("enter mail id:");
            //string? email = Console.ReadLine();
            //if (email != null)
            //{
            //    if (Myclass.checkemailid(email))
            //    {
            //        Console.WriteLine("valid email id");
            //    }
            //    else
            //    {
            //        Console.WriteLine("Invaild email Id");
            //    }
            //}
            #endregion

            #region extension method demo1
            //Console.WriteLine("enter mail id:");
            //string? email = Console.ReadLine();
            //if (email != null)
            //{
            //    if (email.checkemailid())
            //    {
            //        Console.WriteLine("valid email id");
            //    }
            //    else
            //    {
            //        Console.WriteLine("Invaild email Id");
            //    }
            //}
            #endregion

            #region Extension demo 2
            //int[] number = {1,2,3,4,5};
            //string[] str = { "a","b","c"};
            //List<string> output2 = str.ConvertToList(4);

            //List<int> output1 = number.ConvertToList(1111);
            //foreach (var item in output1)
            //{
            //    Console.WriteLine($"{item}");
            //}
            //foreach (var item in output2)
            //{
            //    Console.WriteLine($"{item}");
            //}

            #endregion

            #region Itertor
            MyCustomeCollection custobj = new MyCustomeCollection();
            custobj.Add(12);
            custobj.Add(13);
            custobj.Add(14);
            custobj.Add(15);

            var result = custobj.getElements;
            for(int i = 0; i < result.Count; i++)
            {
                Console.WriteLine(result[i]);
            }
            #endregion
        }
        public static bool check(int x)
        {
            return x > 10;
        }

        public static T Mysum<T>(IEnumerable<T> arr)
        {
            dynamic sum = 0;
            foreach (var item in arr)
            {
                sum += item;
            }
            return sum;
        }
    }

    public static class Myclass
    {
        public static bool checkemailid(this string email)
        {
            return email.Contains("@gmail.com");
        }
        public static List<T> ConvertToList<T>(this IEnumerable<T> source,int nonsenseParameter)
        {
            List<T> list = new List<T>();
            foreach (var item in source)
            {
                list.Add(item);
            }
            Console.WriteLine($"Nonsense Parameter value = {nonsenseParameter}");
            return list;
        }
    }

    public class MyCustomeCollection : IEnumerable
    {
        private ArrayList arr = new ArrayList();

        public ArrayList getElements
        {
            get{ return arr; }
        }
        public void Add(int element)
        {
            arr.Add(element);
        }

        public IEnumerator GetEnumerator()
        {
            for(int i = 0; i < arr.Count; i++)
            {
                yield return arr[i];
            }
        }
    }
        

}

    

