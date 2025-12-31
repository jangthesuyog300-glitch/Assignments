using Microsoft.AspNetCore.Mvc;

namespace _04_AttributeRouting.Controllers
{
    [Route("Home")]
    public class HomeController : Controller
    {
        [Route("")]
        [Route("~/")]
        [Route("/Index")]
        public IActionResult Index()
        {
            return View();
            
        }

        [Route("/About")]
        public IActionResult About()
        {
            return View();
        }
    }
}
