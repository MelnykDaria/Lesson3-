

package com.company.Lesson4;
import java.util.Scanner;
class Exercise6HW4 {
    public static void main(String[] args)
    {
        int month;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        month= input.nextInt();

        if (month == 1)
        {
            System.out.println("31 days");
        }
        else if(month == 2)
        {
            System.out.println("28 or 29 days");
        }
        else if(month == 3)
        {
            System.out.println("31 days");
        }
        else if(month == 4)
        {
            System.out.println("30 days");
        }
        else if(month == 5)
        {
            System.out.println("31 days");
        }
        else if(month == 6)
        {
            System.out.println("30 days");
        }
        else if(month == 7)
        {
            System.out.println("31 days");
        }
        else if(month == 8)
        {
            System.out.println("31 days");
        }
        else if(month == 9)
        {
            System.out.println("30 days");
        }
        else if(month == 10)
        {
            System.out.println("31 days");
        }
        else if(month == 11)
        {
            System.out.println("30 days");
        }
        else if(month == 12)
        {
            System.out.println("31 days");
        }
        else
        {
            System.out.println("Invalid input! Please enter month number between (1-12).");
        }

    }
}
