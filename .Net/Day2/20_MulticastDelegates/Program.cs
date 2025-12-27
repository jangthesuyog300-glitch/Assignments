namespace _20_MulticastDelegates
{

    public delegate void Mydelegate();
    internal class Program
    {
        static void Main(string[] args)
        {
            ClgEvents cevent=new ClgEvents();
            Mydelegate del =  cevent.Welcome;
            Console.WriteLine("Is guest arrived 'y/n'");
            string guest = Console.ReadLine();

            del += cevent.HostSpeech;
            if(guest == "n")
            {
                del -= cevent.GuestSpeech;
            }
            else
            {
                del += cevent.GuestSpeech;
            }
            del += cevent.GoodBy;

            del.Invoke();
        }
    }

    public class ClgEvents {
      public void Welcome()
        {
            Console.WriteLine("Welcome ");
        }
        public void HostSpeech()
        {
            Console.WriteLine("Host Speech");
        }
        public void GuestSpeech()
        {
            Console.WriteLine("Guest speech");
        }
        public void GoodBy()
        {
            Console.WriteLine("Good bye");
        }
    }
}
