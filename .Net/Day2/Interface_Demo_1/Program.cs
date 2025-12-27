using Interface_Demo_1;
namespace Interface_Demo_1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int choice;
            do
            {
                Console.WriteLine("1.Cold Drink ");
                Console.WriteLine("2.Hot Drink ");
                Console.WriteLine("Enter the Chioce : ");
                choice = Convert.ToInt32(Console.ReadLine());

                switch (choice)
                {
                    case 1:

                        ColdDrink coldDrink = new ColdDrink();
                        coldDrink.getDrink();
                        break;

                    case 2:
                        HotDrink hotDrink = new HotDrink();
                        hotDrink.getDrink();

                        break;


                    default:

                        Console.WriteLine("Invalid Choice");
                        break;


                }
            } while (choice != 3);

        }
    }
}
