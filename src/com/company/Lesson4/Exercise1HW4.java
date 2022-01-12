package com.company.Lesson4;
import java.util.Scanner;

public class Exercise1HW4
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day time");
        int hour = scanner.nextInt();
        String  text = (hour >18) ? "Good evening " : "Good day";
        System.out.println(text);

    }
}



