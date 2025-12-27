using System;
using _34_Table;
using ST;


namespace _33_Employee
{
    #region refer for demo: 32Demo_MyApplication
    //[SuyogTransport(Owername = "Suyog", Company = "SuyogTransport")]
    //[Serializable]
    #endregion
    [MyTable(TableName = "Employee")]
    public class Emp
    {
        private int _Id;
        private string _Name;
        private string _Address;

        [MyColumn(ColumnName = "EId", ColumnType = "int")]
        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }
        [MyColumn(ColumnName = "EName", ColumnType = "varchar(50)")]
        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }
        [MyColumn(ColumnName = "EAddress", ColumnType = "varchar(50)")]
        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }
    }
}