using Microsoft.AspNetCore.Mvc;
using System.Net;
using System.Xml.Linq;

namespace _05_Demo_Return_TypeOfAction.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult About()
        {
            return View();
        }
        // Strongly -typed return type of Method : Generic Type<T>
        public ActionResult<int> GetNumber()
        {
            return 111;
        }
        public ViewResult M1()
        {
            return View("~/Views/Home/About.cshtml");
        }

        public string GetSomthing(string uname,string pwd)
        {
            return $"Uname = {uname}  pass = {pwd}";
        }

        public JsonResult GetData()
        {
            var data = new { Name ="Suyog", Id=1, Address = "YTM"};
            return Json(data);
        }
        public StatusCodeResult GetStatus()
        {
            return StatusCode(200);
        }

        public ObjectResult GetResult()
        {
            var obj = new
            {
                ID = 101,
                Name = "Hugh Jackman",
                Address = "NYC"
            };           
            return new ObjectResult(obj);
        }

        public EmptyResult doNothing()
        {
            return new EmptyResult();
        }

        public async Task<ViewResult> GetResult1()
        {
            await Task.Delay(3000);
            return View("~/Views/Home/GetData.cshtml");
        }
        public FileResult FileDown()
        {
            var bytea= System.IO.File.ReadAllBytes(@"C:\Users\IET\Desktop\git\Assignments\.Net\WebApplication\05_Demo_Return_TypeOfAction\Data\IET2.pdf");

            return File(bytea,"application/pdf","IET2.pdf");
        }


    }
}
