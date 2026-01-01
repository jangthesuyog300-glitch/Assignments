using _09Demo_TagHelpers.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace _09Demo_TagHelpers.Controllers
{
    public class HomeController : Controller
    {s

        public IActionResult Index()
        {
            return View();
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
