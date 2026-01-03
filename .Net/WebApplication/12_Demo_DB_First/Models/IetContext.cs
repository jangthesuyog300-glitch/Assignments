using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace _12_Demo_DB_First.Models;

public partial class IetContext : DbContext
{
    public IetContext()
    {
    }

    public IetContext(DbContextOptions<IetContext> options)
        : base(options)
    {
    }

    public virtual DbSet<Emp> Emps { get; set; }

    public virtual DbSet<Employee> Employees { get; set; }

    public virtual DbSet<Empp> Empps { get; set; }

    public virtual DbSet<Login1> Login1s { get; set; }

    public virtual DbSet<User> Users { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    { }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Emp>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PK__Emp__3214EC07F5865946");

            entity.ToTable("Emp");

            entity.Property(e => e.Address)
                .HasMaxLength(50)
                .IsUnicode(false);
            entity.Property(e => e.Name)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        modelBuilder.Entity<Employee>(entity =>
        {
            entity.ToTable("Employee");

            entity.Property(e => e.Address)
                .HasMaxLength(50)
                .IsUnicode(false);
            entity.Property(e => e.Name)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        modelBuilder.Entity<Empp>(entity =>
        {
            entity.HasKey(e => e.Eid).HasName("PK__Empp__C190176B85CF3F5F");

            entity.ToTable("Empp");

            entity.Property(e => e.Eid).HasColumnName("EId");
            entity.Property(e => e.Eaddress)
                .HasMaxLength(50)
                .IsUnicode(false)
                .HasColumnName("EAddress");
            entity.Property(e => e.Ename)
                .HasMaxLength(50)
                .IsUnicode(false)
                .HasColumnName("EName");
        });

        modelBuilder.Entity<Login1>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PK__Login1__3214EC079D6E4F5C");

            entity.ToTable("Login1");

            entity.Property(e => e.Pass)
                .HasMaxLength(50)
                .IsUnicode(false);
            entity.Property(e => e.User)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        modelBuilder.Entity<User>(entity =>
        {
            entity.HasKey(e => e.UserName).HasName("PK__User__C9F28457EAF13BF4");

            entity.ToTable("User");

            entity.Property(e => e.UserName)
                .HasMaxLength(50)
                .IsUnicode(false);
            entity.Property(e => e.Password)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
