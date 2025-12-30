using _42_ConnectedAdo.Net.DAL;
using _42_ConnectedAdo.Net.Models;

namespace _42_ConnectedAdo.Net
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            IETDbContext dbContext = new IETDbContext();
            int noOfRowsAffected = 0;
            while (true)
            {
                Console.WriteLine("Enter Db Operation Choice: 1. SELECT, 2.INSERT, 3. UPDATE, 4. DELETE");
                int opChoice = Convert.ToInt32(Console.ReadLine());

                switch (opChoice)
                {
                    case 1:
                        var records=dbContext.getEmpRecords();
                        foreach(var emp in records)
                        {
                            Console.WriteLine($"Id: {emp.EId} Name: {emp.EName} address: {emp.EAddress}");
                        }
                        break;
                    
                    case 2:
                        Empp empToBeInserted = new Empp();

                        Console.WriteLine("Enter Name of Emp");
                        empToBeInserted.EName = Console.ReadLine();
                        Console.WriteLine("Enter NAddress of Emp");
                        empToBeInserted.EAddress = Console.ReadLine();

                        noOfRowsAffected = dbContext.insertRecords(empToBeInserted);
                        if (noOfRowsAffected > 0)
                        {
                            Console.WriteLine("Record inserted successfully!");
                        }
                        else
                        {
                            Console.WriteLine("Error with insert query!");
                        }

                        break;

                    case 3:
                        Empp empToBeUpdated = new Empp();
                        Console.WriteLine("Enter Id of Emp to be updated");
                        empToBeUpdated.EId = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter Name of Emp to be updated");
                        empToBeUpdated.EName = Console.ReadLine();
                        Console.WriteLine("Enter NAddress of Emp  to be updated");
                        empToBeUpdated.EAddress = Console.ReadLine();

                        noOfRowsAffected = dbContext.UpdateEmpRecord(empToBeUpdated.EId, empToBeUpdated);
                        if (noOfRowsAffected > 0)
                        {
                            Console.WriteLine("Record updated successfully!");
                        }
                        else
                        {
                            Console.WriteLine("Error with update query!");
                        }

                        break;

                    case 4:
                        Console.WriteLine("Enter Id of Emp to be deleted");
                        int idToBeDeleted = Convert.ToInt32(Console.ReadLine());

                        noOfRowsAffected = dbContext.DeleteEmpRecord(idToBeDeleted);
                        if (noOfRowsAffected > 0)
                        {
                            Console.WriteLine("Record deleted successfully!");
                        }
                        else
                        {
                            Console.WriteLine("Error with delete query!");
                        }

                        break;
                    default:
                        Console.WriteLine("Invalid Choice.");
                        break;
                }

                Console.WriteLine("Do you want continue? y/n");
                string ynChoice = Console.ReadLine();
                if (ynChoice == "n")
                {
                    break;
                }
            }

            }
        }
    }

