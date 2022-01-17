package com.company.Lesson4;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4, 5};
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




