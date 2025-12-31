namespace WebApplication1
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            var app = builder.Build();

            #region app.Map- GET , POST, PUT, DELETE
            ////app.MapGet("/", () => "Hello World!");
            //app.MapGet("/", () => "get: <h1>hello world ");
            //app.MapPut("/", () => "put: <h1>hello world ");
            //app.MapPost("/", () => "Post: <h1>hello world ");
            //app.MapDelete("/", () => "Delete: <h1>hello world ");
            #endregion

            #region app.Run() can not pass http context reference to next app.Run() method .
            //app.Run(async (context) =>
            //{
            //    await context.Response.WriteAsync("hii");
            //    await context.Response.WriteAsync("hello");
            //});

            //app.Run(async (context) =>
            //{
            //    await context.Response.WriteAsync("bye");
            //});
            #endregion

            app.Use(async (context, next) => {
                await context.Response.WriteAsync("Hello Hugh Jackman!!");
                await context.Response.WriteAsync("\nHow are you!!");
                next(context);
            });
            app.Use(async (context, next) => {
                await context.Response.WriteAsync("\nWolvarine");
                next(context);
                await context.Response.WriteAsync("\nLogan");
            });

            app.Run(async (context) => {
                await context.Response.WriteAsync("\nBye Hugh Jackman!!");
            });
            app.Run();
        }
    }
}
