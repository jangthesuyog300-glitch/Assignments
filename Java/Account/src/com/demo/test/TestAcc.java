package com.demo.test;
import com.demo.service.*;
import java.util.*;
import java.util.Scanner;
public class TestAcc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Display All ");
            System.out.println("2. Add Saving Account ");
            System.out.println("3. Add Current Account ");
            System.out.println("4. Withdral ");
            System.out.println("5. Add Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    AccountService.displayAll();
                    break;
                case 2:
                    
                    AccountService.addNewAccountSaving();
                    break;
                case 3:    
                	AccountService.addNewCurrent();
                	break;
                case 4:
                	System.out.println("Enter the Account No :");
                	int sac=sc.nextInt();
                	AccountService.With(sac);
                	break;
                case 5:
                	System.out.println("Enter the Account No :");
                	int cac=sc.nextInt();
                	
                	AccountService.Addbal(cac);
                	break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }
}
