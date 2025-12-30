using Microsoft.Data.SqlClient;
using System.Data;

namespace _43_Disconnected_Ado.net
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            string _constr = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IET;Integrated Security=True";

            #region SELECT Query
            //SqlConnection con = new SqlConnection(_constr);
            //SqlDataAdapter da = new SqlDataAdapter("select * from emp", con);
            //da.MissingSchemaAction = MissingSchemaAction.AddWithKey;
            //DataSet ds=new DataSet();
            //da.Fill(ds, "Emp");
            //foreach(DataRow row in ds.Tables["Emp"].Rows)
            //{
            //    int id = Convert.ToInt32(row["Id"]);
            //    string nm = row["Name"].ToString();
            //    string add = row["Address"].ToString();
            //    Console.WriteLine($"Id:{id} , Name: {nm} , Adress:{add}");
            //}
            #endregion

            #region INSERT Query
            SqlConnection con = new SqlConnection(_constr);
            SqlDataAdapter da = new SqlDataAdapter("select * from emp", con);
            da.MissingSchemaAction = MissingSchemaAction.AddWithKey;
           SqlCommandBuilder builder= new SqlCommandBuilder(da);
            DataSet ds = new DataSet();
            da.Fill(ds, "Emp");

            Console.WriteLine("enter name: ");
            string nm=Console.ReadLine();
            Console.WriteLine("enter address: ");
            string add=Console.ReadLine();

            DataRow newRow = ds.Tables["Emp"].NewRow();
            newRow["Name"] = nm;
            newRow["Address"] = add;

            ds.Tables["Emp"].Rows.Add(newRow);
            da.Update(ds, "Emp");
            Console.WriteLine("Records inserted successfully!");
            #endregion

        }
    }
}
