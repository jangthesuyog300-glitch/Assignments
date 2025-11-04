package com.demo.test;

import java.util.Scanner;
import com.demo.service.QuickSort;

public class Quick {
    public static void main(String[] args) {
        QuickSort quick = new QuickSort();

        Scanner sc = new Scanner(System.in);
        int[] arr = {21, 2, 5, 1, 7, 8, 10, 3};

        int choice = 0;
        do {
            System.out.println("1. Quick Sort ascending");
            System.out.println("2. Quick Sort descending");
            System.out.println("3. exit");
            System.out.print("Enter the choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    int start = 0;
                    int end = arr.length - 1;  
                    quick.quickSortAsc(arr, start, end);
                    System.out.println("Sorted (Ascending): " + java.util.Arrays.toString(arr));
                }
                case 2 -> {
//                    int start = 0;
//                    int end = arr.length - 1;
//                    quick.quickSortDes(arr, start, end);
//                    System.out.println("Sorted (Descending): " + java.util.Arrays.toString(arr));
                }
                case 3 -> {
                    System.out.println("Exiting program.");
                }
                default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        } while (choice != 3);

        sc.close(); // Close Scanner
    }
}
