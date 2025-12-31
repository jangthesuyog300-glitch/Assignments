namespace _05_Demo_Return_TypeOfAction
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            var app = builder.Build();

            app.MapGet("/", () => "Hello ddd World!");
            app.MapDefaultControllerRoute();

            app.Run();
        }
    }
}
