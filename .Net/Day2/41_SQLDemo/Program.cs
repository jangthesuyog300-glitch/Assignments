using Microsoft.Data.SqlClient;

namespace _41_SQLDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string ConnectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IET;Integrated Security=True";
            SqlConnection con=new SqlConnection(ConnectionString);
            string selectQuery = "select * from emp";
            SqlCommand cmd = new SqlCommand(selectQuery,con);
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = selectQuery;
            cmd.Connection = con;
            con.Open(); 
            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                int id=Convert.ToInt32(reader["ID"]);
                string? nm = reader["Name"].ToString();
                string? Address = reader["Address"].ToString();
                Console.WriteLine($"Id : {id} Name : {nm} Address : {Address}");
            }
            con.Close();        
           
        }
    }
}
