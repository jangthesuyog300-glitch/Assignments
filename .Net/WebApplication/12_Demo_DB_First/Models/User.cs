using System;
using System.Collections.Generic;

namespace _12_Demo_DB_First.Models;

public partial class User
{
    public string UserName { get; set; } = null!;

    public string? Password { get; set; }
}
