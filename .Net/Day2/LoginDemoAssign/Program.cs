using Microsoft.Data.SqlClient;

namespace LoginDemoAssign
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string ConnectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IET;Integrated Security=True";
            Console.WriteLine("Enter username:");
            string? uname=Console.ReadLine().Trim();
            Console.WriteLine("enter password: ");
            string? pass=Console.ReadLine().Trim();
            SqlConnection con=new SqlConnection(ConnectionString);
            string selectQuery = $"select * from login1 where User = {uname} AND Pass = {pass}";
            SqlCommand cmd= new SqlCommand(selectQuery,con);
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = selectQuery;
            cmd.Connection = con;
            con.Open();
            SqlDataReader reader = cmd.ExecuteReader();
            if (reader.Read())
            {
                string? nm = reader["User"].ToString();

                Console.WriteLine($"welcome {nm}");
            }
            else
            {
                Console.WriteLine("Invalid");
            }
                con.Close();
        }
    }
}
