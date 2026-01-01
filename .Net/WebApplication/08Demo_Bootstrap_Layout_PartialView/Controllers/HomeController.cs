using _08Demo_Bootstrap_Layout_PartialView.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace _08Demo_Bootstrap_Layout_PartialView.Controllers
{
    public class HomeController : Controller
    {
        List<Emp> emps = new List<Emp>() {
            new Emp(){ Id= 11, Name= "Tony Stark", Address="LA"},
            new Emp(){ Id= 12, Name= "Walter Bishop", Address="New Jersey"},
            new Emp(){ Id= 13, Name= "Thor", Address="Asgard"},
            new Emp(){ Id= 14, Name= "Peter Bishop", Address="Parallel Universe"},
        };

        List<Product> products = new List<Product>() {
            new Product(){ Id = 1, Name = "Laptop", Price = 75000, Description = "Asus 16GB RAM", Image="~/images/laptop.png"},
                new Product(){ Id = 2, Name = "HDD", Price = 5000, Description = "Sandisk 1TB", Image="~/images/HDD.png"},
                new Product(){ Id = 3, Name = "Mobile", Price = 175000, Description = "Nokia, Windows OS", Image="~/images/Mobile.png"},
            };

        public IActionResult Index()
        {
            return View();
        }
        public IActionResult About()
        {
            
            return View();
        }
        public IActionResult Contact()
        {

            return View();
        }
        public IActionResult Courses()
        {

            return View();
        }
        public IActionResult Emps()
        {
            return View(emps);
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
