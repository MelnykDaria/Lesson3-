package com.company.Lesson;
import java.util.Scanner;

public class Exercise2HW4
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day time");
        int hour = scanner.nextInt();
        if (hour > 18){
            System.out.println("Good evening");
        }
        else if (hour >10) {
            System.out.println("Good morning");

        }
        else{
            System.out.println("Good day");
        }


    }
}



