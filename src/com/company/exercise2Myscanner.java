package com.company;
import java.util.Scanner;

public class exercise2Myscanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total minutes");
        int minutes = scanner.nextInt();
int days = minutes/(60 * 24);
int year = days/365;
int days2 = days % 365;
        System.out.println( year + " year " + days2 + " days " );

    }
}

