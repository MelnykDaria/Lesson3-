package com.company.Lesson5;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{10, 11, 12, 13, 14};
        int expectedInt = scanner.nextInt();
        boolean result = false;
        int[] test = new int[]{};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == expectedInt) {
                result = true;
            }
            System.out.println(result);
        }
    }
}




