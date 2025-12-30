using _42_ConnectedAdo.Net.Models;
using Microsoft.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _42_ConnectedAdo.Net.DAL
{
    public class IETDbContext
    {
        string connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IET;Integrated Security=True";

        public List<Empp> getEmpRecords()
        {
            SqlConnection connection = new SqlConnection(connectionString);
            SqlCommand cmd = new SqlCommand("select * from Empp", connection);

            connection.Open();


            SqlDataReader reader = cmd.ExecuteReader();

            List<Empp> allEmpRecords = new List<Empp>();

            while (reader.Read())
            {
                allEmpRecords.Add(new Empp()
                {
                    EId = Convert.ToInt32(reader["EId"]),
                    EName = reader["EName"].ToString(),
                    EAddress = reader["EAddress"].ToString()
                });
            }
            connection.Close();

            return allEmpRecords;
        }

        public int insertRecords(Empp empp)
        {
            SqlConnection con=new SqlConnection(connectionString);
            string insertQuery = $"insert into Empp(Ename,EAddress) values('{empp.EName}','{empp.EAddress}') ";
            SqlCommand cmd=new SqlCommand(insertQuery, con);

            con.Open();
            int rowsAffected = cmd.ExecuteNonQuery();
            con.Close();
            return rowsAffected;
        }

        public int UpdateEmpRecord(int idToBeUpdated, Empp emptoBeUpdated)
        {
            SqlConnection conn = new SqlConnection(connectionString);

            string updateQuery = $"UPDATE EMPP SET ENAME= '{emptoBeUpdated.EName}', EADDRESS = '{emptoBeUpdated.EAddress}' WHERE EID = {idToBeUpdated} ";

            SqlCommand cmd = new SqlCommand(updateQuery, conn);
            conn.Open();
            int rowsAffected = cmd.ExecuteNonQuery();
            conn.Close();
            return rowsAffected;
        }
        public int DeleteEmpRecord(int idToBeDeleted)
        {
            SqlConnection conn = new SqlConnection(connectionString);

            string deleteQuery = $"DELETE FROM EMPP WHERE EID = {idToBeDeleted} ";

            SqlCommand cmd = new SqlCommand(deleteQuery, conn);
            conn.Open();
            int rowsAffected = cmd.ExecuteNonQuery();
            conn.Close();
            return rowsAffected;
        }
    }
}
