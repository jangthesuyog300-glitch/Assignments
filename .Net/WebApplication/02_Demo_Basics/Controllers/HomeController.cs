using Microsoft.AspNetCore.Mvc;

namespace _02_Demo_Basics.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
