namespace CSharpDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for(int i=0;i<5;i++)
            {
                for (int k = 5; k - i > 0; k--)
                {
                    Console.Write(" ");
                }

                for (int j=1;j<=i;j++)
                {
                    
                    
                    if (j==1)
                    {
                        Console.Write("*");
                    }
                    else if(j==i)
                    {
                        Console.Write("*");
                    }
                    else
                    {
                        Console.Write(" ");
                    }
                }
                Console.WriteLine();

            }
            for (int i = 5; i > 0; i--)
            {
                for (int k = 5; k - i > 0; k--)
                {
                    Console.Write(" ");
                }
                for (int j = 1; j <= i; j++)
                {
                  
                    if (j == 1)
                    {
                        Console.Write("*");
                    }
                    else if (j == i)
                    {
                        Console.Write("*");
                    }
                    else
                    {
                        Console.Write(" ");
                    }
                }
                Console.WriteLine();

            }
            Console.WriteLine("Hello, World!");
        }
    }
}
