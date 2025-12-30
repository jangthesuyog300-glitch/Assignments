using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using _44_DemoEntityFW.Models;
using Microsoft.Extensions.Configuration;

namespace _44_DemoEntityFW.DAL
{
    public class IETDbContext:DbContext
    {
        public DbSet<Emp> Emp {  get; set; }
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            var builder = new ConfigurationBuilder();
            builder.SetBasePath(Directory.GetCurrentDirectory());
            builder.AddJsonFile("appsettings.json");
            IConfiguration config = builder.Build();
            optionsBuilder.UseSqlServer(config.GetConnectionString("IETDb"));
        }
    }
}
