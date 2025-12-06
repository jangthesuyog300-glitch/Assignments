package com.demo.test;

import java.util.Scanner;
import com.demo.service.*;

public class Test {
    public static void main(String[] args) {
        EmpService eservice = new EmpServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        do {
            System.out.println("\n=== Employee & Project Management ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Add Project");
            System.out.println("3. Display all Employees");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Display All Projects");
            System.out.println("7. Update Project Employees");
            System.out.println("8. Delete Project");
            System.out.println("9. Assign Employee to Project");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch(choice) {
                case 1:
                    boolean empStatus = eservice.addEmp();
                    System.out.println(empStatus ? "Employee added successfully!" : "Failed to add employee.");
                    break;
                    
                case 2:
                    boolean projStatus = eservice.addProject();
                    System.out.println(projStatus ? "Project added successfully!" : "Failed to add project.");
                    break;
                    
                case 3:
                    eservice.displayAllEmployees();
                    break;
                    
                case 4:
                    System.out.print("Enter Employee ID: ");
                    int eidUpdate = sc.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = sc.nextDouble();
                    boolean salaryStatus = eservice.updateSalary(eidUpdate, newSalary);
                    System.out.println(salaryStatus ? "Salary updated successfully!" : "Failed to update salary.");
                    break;
                    
                case 5:
                    System.out.print("Enter Employee ID to delete: ");
                    int eidDelete = sc.nextInt();
                    boolean deleteEmpStatus = eservice.deleteEmployee(eidDelete);
                    System.out.println(deleteEmpStatus ? "Employee deleted successfully!" : "Failed to delete employee.");
                    break;
                    
                case 6:
                    eservice.displayAllProjects();
                    break;
                    
                case 7:
                    System.out.print("Enter Project ID: ");
                    int pidUpdate = sc.nextInt();
                    eservice.updateProjectEmployees(pidUpdate);
                    break;
                    
                case 8:
                    System.out.print("Enter Project ID to delete: ");
                    int pidDelete = sc.nextInt();
                    boolean deleteProjStatus = eservice.deleteProject(pidDelete);
                    System.out.println(deleteProjStatus ? "Project deleted successfully!" : "Failed to delete project.");
                    break;
                    
                case 9:
                    System.out.print("Enter Project ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter Employee ID: ");
                    int eid = sc.nextInt();
                    boolean assignStatus = eservice.assignProject(pid, eid);
                    System.out.println(assignStatus ? "Employee assigned to project successfully!" : "Failed to assign employee to project.");
                    break;
                    
                case 10:
                    System.out.println("Thank you for using the application!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println("Press Enter to continue...");
            sc.nextLine();
        } while(choice != 10);
        
        sc.close();
    }
}
