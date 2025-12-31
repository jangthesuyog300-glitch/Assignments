using Microsoft.AspNetCore.Mvc;

namespace _04_AttributeRouting.Controllers
{
    [Route("Admin")]
    public class DemoController : Controller
    {
        [Route("/Demo")]
        public IActionResult Demo()
        {
            return View("~/Views/Demo/Data.cshtml");
        }

        [Route("/Greet")]
        public string SayHi()
        {
            return "hello";
        }
    }
}
