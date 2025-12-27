using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _Oops_Interface1
{
    internal interface Iinterface
    {
        void update();
        void insert();
        void delete();
    }
    internal class SqlServer : Iinterface
    {
        public void delete()
        {
            Console.WriteLine("delete sqlserver");
        }

        public void insert()
        {
            Console.WriteLine("insert sqlserver");
        }

        public void update()
        {
            Console.WriteLine("update sqlserver");
        }
    }

    internal class MysqlServer : Iinterface
    {
        public void delete()
        {
            Console.WriteLine("deleted Mysqlserver");
        }

        public void insert()
        {
            Console.WriteLine("insert Mysqlserver");
        }

        public void update()
        {
            Console.WriteLine("update Mysqlserver");
        }
    }

    internal class OracleServer : Iinterface
    {
        public void delete()
        {
            Console.WriteLine("deleted oracleserver");
        }

        public void insert()
        {
            Console.WriteLine("insert oracleserver");
        }

        public void update()
        {
            Console.WriteLine("update oracleserver");
        }
    }
    internal class DataBaseFactory
     {
        internal Iinterface getSomeDatabase(int dbchoice)
        {
            Iinterface iinterface = null;
            switch (dbchoice)
            {
                case 1:
                    iinterface = new MysqlServer();
                    break;

                case 2:
                    iinterface = new SqlServer();
                    break;

                case 3:
                    iinterface = new OracleServer();
                    break;

                default:
                    iinterface = null;
                    break;
            }
            return iinterface;
        }

    }
}
