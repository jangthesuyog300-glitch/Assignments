using System;
using System.Collections.Generic;

namespace _12_Demo_DB_First.Models;

public partial class Login1
{
    public int Id { get; set; }

    public string User { get; set; } = null!;

    public string Pass { get; set; } = null!;
}
