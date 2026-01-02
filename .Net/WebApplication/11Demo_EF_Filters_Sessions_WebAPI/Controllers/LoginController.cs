using _11Demo_EF_Filters_Sessions_WebAPI.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace _11Demo_EF_Filters_Sessions_WebAPI.Controllers
{
    public class LoginController : Controller
    {
        // GET: LoginController
        [HttpGet]
        public ActionResult SignIn()
        {
            return View();
        }

        [HttpPost]
        public ActionResult SignIn(User user)
        {
            if(user.UserName=="User1" && user.Password == "1234")
            {
                HttpContext.Session.SetString("token",user.UserName);
                return Redirect("/Home/Index");
            }
            else
            {
                ViewBag.message = "Invalid credentials";
                return View();
            }
        }
       

       
    }
}
