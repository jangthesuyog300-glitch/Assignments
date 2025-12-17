package com.example.demo.beans;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    private String sname;
    private String email;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate dob;
    private String addr;
    
    // Default constructor
    public Student() {}
    
    // Parameterized constructor
    public Student(int sid, String sname, String email, LocalDate dob, String addr) {
        this.sid = sid;
        this.sname = sname;
        this.email = email;
        this.dob = dob;
        this.addr = addr;
    }
    
    // Getters and Setters
    public int getSid() { return sid; }
    public void setSid(int sid) { this.sid = sid; }
    public String getSname() { return sname; }
    public void setSname(String sname) { this.sname = sname; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }
    public String getAddr() { return addr; }
    public void setAddr(String addr) { this.addr = addr; }
    
    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", dob=" + dob + ", addr=" + addr + "]";
    }
}
