package com.company;
import java.util.Scanner;

public class Exercise5HW4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = input.nextLine();
        System.out.println("Enter your password: ");
        String password = input.nextLine();

        if("Daria".equals(username) && "password".equals("password"))
        {

            System.out.print("Successfully login");
        } else{
            System.out.println("Invalid password: ");

        }
    }
}









