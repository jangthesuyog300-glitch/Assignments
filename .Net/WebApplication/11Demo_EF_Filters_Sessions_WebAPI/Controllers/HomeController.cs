using _11Demo_EF_Filters_Sessions_WebAPI.Filter;
using _11Demo_EF_Filters_Sessions_WebAPI.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace _11Demo_EF_Filters_Sessions_WebAPI.Controllers
{
    [IETfilter]
    public class HomeController : Controller
    {
        
        private readonly IETDbContext _dbContext;

        
        public HomeController(IETDbContext context)
        {
            _dbContext = context;
        }

        public IActionResult Index()
        {
            ViewBag.ctr = "Home";
            var allemp = _dbContext.emps.ToList();
            return View(allemp);
        }
        [HttpGet]
        public IActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public IActionResult AfterCreate(Emp emp)
        {
            _dbContext.emps.Add(emp);
            _dbContext.SaveChanges();
            return Redirect("Index");
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
            Emp emp=_dbContext.emps.Find(id);
            if (emp != null) {
                return View(emp);
            }
            else
            {
                return NotFound(404);
            }
        }

        [HttpGet]
        public IActionResult Details(int id)
        {
            Emp emp = _dbContext.emps.Find(id);
            return View(emp);
            
         }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            Emp emp=_dbContext.emps.Find(id);
            _dbContext.Remove(emp);
            _dbContext.SaveChanges();
            return Redirect("Index");
        }

            [HttpPost]
        public IActionResult Edit(int id, Emp emps)
        {
            if (ModelState.IsValid) { 
            Emp emp = _dbContext.emps.Find(id);
                emp.Name = emps.Name;
                emp.Address = emps.Address;
                _dbContext.SaveChanges();
            }
            return RedirectToAction("Index");
        }
            [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
