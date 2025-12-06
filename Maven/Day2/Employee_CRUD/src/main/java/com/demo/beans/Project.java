package com.demo.beans;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project11")
public class Project {
    @Id
    @GeneratedValue
    private int pid;
    private String pname;
    private LocalDate startDate;
    
    @ManyToMany(mappedBy="plist")
    private Set<Employee> elist = new HashSet<>();
    
    // Default constructor initializes collection
    public Project() {}
    
    public Project(String pname, LocalDate startDate) {
        this.pname = pname;
        this.startDate = startDate;
    }
    
    // Getters and setters
    public int getPid() { return pid; }
    public void setPid(int pid) { this.pid = pid; }
    public String getPname() { return pname; }
    public void setPname(String pname) { this.pname = pname; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public Set<Employee> getElist() { return elist; }
    public void setElist(Set<Employee> elist) { this.elist = elist; }
    
    @Override
    public String toString() {
        return "Project [pid=" + pid + ", pname=" + pname + ", startDate=" + startDate + "]";
    }
}
