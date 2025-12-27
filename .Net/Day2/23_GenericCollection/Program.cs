namespace _23_GenericCollection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Swap method ref
            int a = 10;
            int b = 20;
            math math = new math();
            Console.WriteLine($"Befor swap a:{a} b{b}");
            math.swap<int>(ref a,ref b);
            Console.WriteLine($"After swap a:{a} b{b}");
            #endregion

            #region Dynamic Keword 
            int add = math.add<int>(a, b);
            Console.WriteLine($"add :{add}");
            #endregion 


            Console.WriteLine("Hello, World!");
            #region params keyword
            int[] numbers = new int[3];
            numbers[0] = 10;
            numbers[1] = 20;
            numbers[2] = 30;
            Demo demo= new Demo();
            demo.Add(numbers);
            #endregion
            #region Out Parameter
            double area = 0, circumference = 0;
            double radius = 5;
                CalculateCircleArea carea=new CalculateCircleArea();
                carea.CircleArea(radius,out area,out  circumference);
            Console.WriteLine($"Area :{area} , circumference: {circumference}");
            #endregion
        }

    }

    public class Demo
    {
        public void Add(int[] arr)
        {
            int sum = 0;
            for(int i = 0; i < arr.Length; i++)
            {
                sum += arr[i];
                
            }
            Console.WriteLine(sum);
        }
    }
    public class math
    {
        public void swap<T>(ref T x,ref T y )
        {
            T temp = x;
            x=y; y=temp;    
        }
        public T add<T>(T x, T y)
        {
            dynamic para1 = x;
            dynamic para2 = y;
            return para1 + para2;   
        }
    }
    


    public class CalculateCircleArea
    {
        public void CircleArea(double radius,out double area,out double circumference )
        {
            area = 3.14 * radius * radius;
            circumference = 2 * 3.14 * radius;
        }
    }
    
}
