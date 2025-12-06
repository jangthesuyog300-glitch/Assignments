package com.demo.service;
import java.util.*;
import com.demo.beans.Account;
import com.demo.beans.Current;
import com.demo.beans.Saving;

public class AccountService {
    static Account[] actarr = new Account[10];
    static Scanner sc = new Scanner(System.in);
    static int count = 0;

    public static void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(actarr[i]);
        }
    }

    public static void addNewAccountSaving() {
        if (count >= actarr.length) {
            System.out.println("Account array is full!");
            return;
        }
        System.out.println("Enter the name");
        String n = sc.next();
        System.out.println("Enter the last name");
        String l = sc.next();
        System.out.println("Mobile No :");
        String m = sc.next();
        System.out.println("Email :");
        String e = sc.next();
        System.out.println("Enter the balance more than 2000");
        double b = sc.nextDouble();
        if (b < 2000) {
            System.out.println("Balance must be more than 2000.");
            return;
        }
        actarr[count] = new Saving(n, l, m, e, b);
        count++;
    }

    public static void addNewCurrent() {
        if (count >= actarr.length) {
            System.out.println("Account array is full!");
            return;
        }
        System.out.println("Enter the name");
        String n = sc.next();
        System.out.println("Enter the last name");
        String l = sc.next();
        System.out.println("Mobile No :");
        String m = sc.next();
        System.out.println("Email :");
        String e = sc.next();
        System.out.println("Enter the balance more than 1000");
        double b = sc.nextDouble();
        if (b < 1000) {
            System.out.println("Balance must be more than 1000.");
            return;
        }
        actarr[count] = new Current(n, l, m, e, b);
        count++;
    }

    public static void With(int Ac) {
        for (int i = 0; i < count; i++) {
            Account A = actarr[i];
            if (A.getAccountNo() == Ac) {
                System.out.println("Account found: " + A);
                System.out.println("Enter amount to withdraw:");
                double amt = sc.nextDouble();
                double currentBalance = 0;
                if (A instanceof Saving) {
                    currentBalance = ((Saving)A).getBalance();
                    if (currentBalance - amt >= A.minbal()) {
                        ((Saving)A).setBalance(currentBalance - amt);
                        System.out.println("Withdrawal successful. New balance: " + ((Saving)A).getBalance());
                    } else {
                        System.out.println("Insufficient balance. Minimum balance required: " + A.minbal());
                    }
                } else if (A instanceof Current) {
                    currentBalance = ((Current)A).getBalance();
                    if (currentBalance - amt >= A.minbal()) {
                        ((Current)A).setBalance(currentBalance - amt);
                        System.out.println("Withdrawal successful. New balance: " + ((Current)A).getBalance());
                    } else {
                        System.out.println("Insufficient balance. Minimum balance required: " + A.minbal());
                    }
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public static void Addbal(int Ac) {
        for (int i = 0; i < count; i++) {
            Account A = actarr[i];
            if (A.getAccountNo() == Ac) {
                System.out.println("Account found: " + A);
                System.out.println("Enter amount to Credit ");
                double amt = sc.nextDouble();
                double currentBalance = 0;
                if (A instanceof Saving) {
                    currentBalance = ((Saving)A).getBalance();
                    ((Saving)A).setBalance(currentBalance + amt);
                    System.out.println("Credit Successful. New balance: " + ((Saving)A).getBalance());
                } else if (A instanceof Current) {
                    currentBalance = ((Current)A).getBalance();
                    ((Current)A).setBalance(currentBalance + amt);
                    System.out.println("Credit Successful. New balance: " + ((Current)A).getBalance());
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }
}