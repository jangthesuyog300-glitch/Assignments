package com.demo.test;
import java.util.Scanner;

import com.demo.service.Array2D;

public class Test2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = Array2D.Accept();
        Array2D.displayData(arr);

        int choice = 0;
        do {
            System.out.println("1. add all numbers");
            System.out.println("2. add rowwise");
            System.out.println("3. columnwise addition");
            System.out.println("4. find max of all numbers");
            System.out.println("5. maximum rowwise");
            System.out.println("6. find maximum columnwise");
            System.out.println("7. add 2 arrays");
            System.out.println("8. Substraction of matrix");
            System.out.println("9. find transpose of array");
            System.out.println("10. check identity matrix");
            System.out.println("11. rotate matrix rows");
            System.out.println("12. rotate matrix columns");
            System.out.println("13. convert to 1D array");
            System.out.println("14. exit");
            System.out.print("choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int ans = Array2D.addAllNumbers(arr);
                    System.out.println("Addition: " + ans);
                    break;
                case 2:
                    int[] arradd = Array2D.addRowwise(arr);
                    for (int i = 0; i < arradd.length; i++) {
                        System.out.println(arradd[i]);
                    }
                    break;
                case 3:
                    arradd = Array2D.columnwise(arr);
                    for (int i = 0; i < arradd.length; i++) {
                        System.out.println(arradd[i]);
                    }
                    break;
//                case 4:
//                    int max = Array2D.findMax(arr);
//                    System.out.println("Maximum of all numbers: " + max);
//                    break;
//                case 5:
//                    int[] maxRow = Array2D.maxRowwise(arr);
//                    for (int i = 0; i < maxRow.length; i++) {
//                        System.out.println("Max of row " + i + ": " + maxRow[i]);
//                    }
//                    break;
//                case 6:
//                    int[] maxCol = Array2D.maxColumnwise(arr);
//                    for (int i = 0; i < maxCol.length; i++) {
//                        System.out.println("Max of column " + i + ": " + maxCol[i]);
//                    }
//                    break;
                case 7:
                    int[][] arr1 = Array2D.Accept();
                    int[][] addition = Array2D.add2Darrays(arr, arr1);
                    Array2D.displayData(addition);
                    break;
                case 8:
                    int[][] arr2 = Array2D.Accept();
                    int[][] sub = Array2D.subtractArray(arr, arr2);
                    if (sub != null) {
                        Array2D.displayData(sub);
                    } else {
                        System.out.println("Multiplication not possible");
                    }
                    break;
                case 9:
                    int[][] temp = Array2D.findTranspose(arr);
                    Array2D.displayData(temp);
                    break;
                case 10:
                	boolean status = Array2D.checkIdentity(arr);
                	if (status) {
                	    System.out.println("It is identity matrix");
                	} else {
                	    System.out.println("It is not identity matrix");
                	}
     
                    break;
                case 11:
                    System.out.println("Enter number of rotations");
                    int n = sc.nextInt();
                    System.out.println("Enter True or False");
                    boolean flag=sc.nextBoolean();
                    int[][] newarr = Array2D.rotateRow(arr, n,flag);
                    Array2D.displayData(newarr);
                    break;
                case 12:
                    System.out.println("Enter number of rotations for column");
                    n = sc.nextInt();
                    System.out.println("Enter True or False");
                    flag=sc.nextBoolean();
                    newarr = Array2D.rotateColumn(arr, n,flag);
                    Array2D.displayData(newarr);
                    break;
//                case 13:
//                    int[] arr3 = Array2D.convertTo1DArray(arr);
//                    for (int val : arr3) {
//                        System.out.print(val + ",");
//                    }
//                    System.out.println();
//                    break;
                case 14:
                    System.out.println("Thank you for visiting.....");
                    break;
                default:
                    System.out.println("Choice is wrong");
                    break;
            }
        } while (choice != 14);
    }
}
