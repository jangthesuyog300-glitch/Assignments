
namespace Day3
{
        internal class PDF
    {
        static void Main(string[] args)
        {
            #region Normal calling obj
            //DOC dOC = new DOC();
            //dOC.parse();
            //dOC.Validate();
            //dOC.Save();

            //XML xml = new XML();
            //xml.parse();
            //xml.Validate();
            //xml.Save();
            #endregion

            #region new Method for sequential
            //DOC dOC = new DOC();
            //dOC.generateReport();
            //XML xML = new XML();    
            //xML.generateReport();  
            #endregion
            while (true)
            {
                Console.WriteLine("enter choice: ");
                Console.WriteLine("1.DOC");
                Console.WriteLine("2.XML");
                int choice = Convert.ToInt32(Console.ReadLine());
                ReportFactory factory = new ReportFactory();
                Report report = factory.getSomeReport(choice);
                report.generateReport();
                Console.WriteLine("you want to continue? 'y/n'");
                string c = Console.ReadLine();
                if (c == "n")
                {
                    break;
                }
            }
        }
    }
        public abstract class Report
        {

            protected abstract void parse();
            protected abstract void Validate();
            protected abstract void Save();
            public virtual void generateReport()
            {
                parse();
                Validate();
                Save();
            }
        }


        public class DOC : Report
        {
            protected override void parse()
            {
                Console.WriteLine("Parse DOC ");
            }

            protected override void Save()
            {
                Console.WriteLine("Save DOC ");
            }

            protected override void Validate()
            {
                Console.WriteLine("Validate DOC ");
            }

        }
        public class XML : Report
        {


            protected override void parse()
            {
                Console.WriteLine("Parse XML ");
            }

            protected override void Save()
            {
                Console.WriteLine("Save XML ");
            }

            protected override void Validate()
            {
                Console.WriteLine("Validate XML ");
            }
        }

        public class ReportFactory
        {
            public Report getSomeReport(int choice)
            {
                Report somerepoert = null;
                switch (choice)
                {
                    case 1:
                        somerepoert = new DOC();
                        break;

                    case 2:
                        somerepoert = new XML();
                        break;

                    default:
                        Console.WriteLine("Invalid Choice");
                        break;
                }
                return somerepoert;
            }
        }
}


