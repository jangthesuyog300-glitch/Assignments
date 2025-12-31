using Microsoft.AspNetCore.Mvc;

namespace _03_Demo_ConventialRouting.Controllers
{
    public class AdminController : Controller
    {
        public ActionResult<string> UserCredentials(string unm,string pwd)
        {
            return $"UserName:{unm} Password:{pwd}";
        }
    }
}
