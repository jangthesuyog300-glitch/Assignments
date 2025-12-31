using Microsoft.AspNetCore.Mvc;

namespace _03_Demo_ConventialRouting.Controllers
{
    public class DemoController : Controller
    {
        public string Index(string nm)
        {
            return nm;
        }
    }
}
