using _10Demo_Connected.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;


namespace _10Demo_Connected.Controllers
{
    public class HomeController : Controller
    {
        private readonly IETDbContext _DbContext;
        public HomeController(IETDbContext context)
        {
            _DbContext = context;
        }

        public IActionResult Index()
        {
            var allEmps = _DbContext.GetallEmp();
            return View(allEmps);
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
