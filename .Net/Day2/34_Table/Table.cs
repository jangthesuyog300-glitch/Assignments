using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _34_Table
{
    [AttributeUsage(AttributeTargets.Class)]
    public class MyTableAttribute : Attribute
    {
        private string _TableName;

        public string TableName
        {
            get { return _TableName; }
            set { _TableName = value; }
        }
    }
    [AttributeUsage(AttributeTargets.Property)]
    public class MyColumnAttribute : Attribute
    {
        private string _ColumnName;
        private string _ColumnType;

        public string ColumnType
        {
            get { return _ColumnType; }
            set { _ColumnType = value; }
        }


        public string ColumnName
        {
            get { return _ColumnName; }
            set { _ColumnName = value; }
        }

    }
}