using System.Collections.Specialized;

namespace _21_ObserverPattern
{
    public delegate void NotifyEventHandler(string msg);
    internal class Program
    {
        static void Main(string[] args)
        {
            Subscriber sub=new Subscriber();
            Publisher publisher=new Publisher();

            publisher.Notify += sub.MethodA;
            publisher.Notify -= sub.MethodB;

            publisher.NotifySubscriber("Yopu got up! to 70% discount on selected product ");
            publisher.Notify += sub.MethodB;
            publisher.Notify -= sub.MethodA;
            publisher.NotifySubscriber("You got extra 10% discount on electronic items ");

        }
    }

    public class Subscriber
    { 
       public void MethodA(string msg)
        {
            Console.WriteLine($"MethodA Receive :  {msg} via sms ");
        }
        public void MethodB(string msg)
        {
            Console.WriteLine($"MethodB Receive :  {msg} via mail ");
        }

    }

    public class Publisher
    { public event NotifyEventHandler Notify;

        public void NotifySubscriber(string msg) {
            Notify?.Invoke(msg);
        }
    }


}
