using System.Security.Cryptography.X509Certificates;

namespace Notepad
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            SpellCheckerFactory factory=new SpellCheckerFactory();
            Ispellchecker checker = factory.getsomespellchecker("gr");
            Notepad npad = new Notepad(_somechecker);
        }
    }

    public class Notepad
    {
        private Ispellchecker _checker;

        public Notepad(Ispellchecker checker)
        {
            SpellCheckerFactory factory = new SpellCheckerFactory();
            if (checker == null)
            {
                checker = factory.getsomespellchecker("en");
            }
            else
            {
                _checker = checker;
            }
        }
        public void cut()
        {
            Console.WriteLine("Text Cut functionality done ");
        }
        public void copy()
        {
            Console.WriteLine("Text copy functionality done ");
        }
        public void paste()
        {
            Console.WriteLine("Text paste functionality done ");
        }
        public void delete()
        {
            Console.WriteLine("Text delete functionality done ");
        }

        public void spellcheck()
        {
            _checker.dospellchecker();
        }
    }

        public interface Ispellchecker
        {
            void dospellchecker();
        }
        public class EnglishSpellchecker : Ispellchecker
        {
            public void dospellchecker()
            {
                Console.WriteLine("spell check for english text");
            }
        }

        public class GermanSpellChecker : Ispellchecker
        {
            public void dospellchecker()
            {
                Console.WriteLine("spell check for german text");
            }
        }
        public class SpellCheckerFactory
        {
            Ispellchecker _somechecker = null;
            public Ispellchecker getsomespellchecker(string lang)
            {
                switch (lang)
                {
                    case "en":
                        _somechecker = new EnglishSpellchecker();
                        break;

                    case "gr":
                        _somechecker = new GermanSpellChecker();
                        break;

                    default:
                        _somechecker = new EnglishSpellchecker();
                        break;
                }
                return _somechecker;
            }
        }
    }

