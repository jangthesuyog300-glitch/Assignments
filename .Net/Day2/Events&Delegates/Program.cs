namespace Events_Delegates
{
    public delegate void MyHandler(int mrk);
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Console.WriteLine("enter marks");
         
            Student student = new Student();
            student._Pass += new MyHandler(student.Student_Pass);
            student._Fail += new MyHandler(student.Student_Fail);
            student.marks = Convert.ToInt32(Console.ReadLine());

            student.TriggerEvents(student.marks);
        }
    }

    public class Student
    {
        public event MyHandler _Pass;
        public event MyHandler _Fail;
        private int _marks;
        public int marks
        {
            set
            {
                _marks = value;
                if (_marks > 40)
                {
                    _Pass(_marks);
                }
                else
                {
                    _Fail.Invoke(_marks);
                }
            }
            get
            {
                return _marks;
            }

        }
        public void TriggerEvents(int mrk)
        {
            if (mrk > 40)
            {
                _Pass(_marks);
            }
            else
            {
                _Fail(_marks);
            }
        }

        public void Student_Pass(int marks)
        {
            Console.WriteLine($"Congratulations! you passed with {marks}");
        }

        public void Student_Fail(int marks)
        {
            Console.WriteLine($"Congratulations! you failed with {marks}");

        }
    }
}