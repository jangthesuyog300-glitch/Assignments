using Microsoft.AspNetCore.Builder;

namespace _03_Demo_ConventialRouting
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            var app = builder.Build();

            app.MapGet("/", () => "Hello World!");
            app.MapControllerRoute(
                name:"Default",
                pattern:"{Controller=Home}/{action=Index}/{id?}"
                );

            app.MapControllerRoute(
                name: "bvs",
                pattern: "{controller=Demo}/{action=Index}/{nm}");

            app.MapControllerRoute(
                name: "bvs2",
                pattern: "{controller=Admin}/{action=UserCredentials}/{unm}/{pwd}");
            app.Run();
        }
    }
}
