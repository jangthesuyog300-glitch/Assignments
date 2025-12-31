
using Microsoft.AspNetCore.Mvc;

namespace _03_Demo_ConventialRouting.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
