package com.company;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args)
    {
            Scanner scanner = new Scanner(System.in);
            float timeSeconds;
            float mps,kph;

            System.out.print("Enter distance in meters: ");
            float distance = scanner.nextFloat();

            System.out.print("Enter hour: ");
            float hour = scanner.nextFloat();

            System.out.print("Enter minutes: ");
            float minute = scanner.nextFloat();

            System.out.print("Enter seconds: ");
            float second = scanner.nextFloat();

            timeSeconds = (hour*3600) + (minute*60) + second;
            mps = distance / timeSeconds;
            kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );

            System.out.println("Your speed in meters/second is "+mps);
            System.out.println("Your speed in km/h is "+kph);

        }
    }

