namespace _04_1_CMathlib
{
    public class CMath
    {
        public void Add(int x,int y)
        {
            Console.WriteLine($"Addition: {x + y}");
        }

        private void Sub(int x,int y)
        {
            Console.WriteLine($"Subtraction: {x-y}");
        }

        protected void mult(int x, int y)
        {
            Console.WriteLine($"Multi: {x * y}");
        }
        internal void div(int x, int y)
        {
            Console.WriteLine($"div: {x / y}");
        }
        protected internal void square(int x)
        {
            Console.WriteLine($"square: {x * x}");
        }
    }
}
