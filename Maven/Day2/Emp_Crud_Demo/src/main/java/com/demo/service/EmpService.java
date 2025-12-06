package com.demo.service;

public interface EmpService {

    boolean addEmp();
    boolean addProject();
    boolean assignProject(int pid, int eid);
    void displayAllEmployees();
    void displayAllProjects();
    boolean updateSalary(int eid, double salary);
    boolean deleteEmployee(int eid);
    boolean deleteProject(int pid);
    void updateProjectEmployees(int pid);

}
