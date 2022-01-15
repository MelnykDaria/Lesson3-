package com.company.Lesson4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Height");
        int height = scanner.nextInt();
        System.out.println("Width");
        int width = scanner.nextInt();
        int[][] matrix = new int[height][width];

        for (int i = 0; i < matrix[i].length; i++)
        {
            for (int g = 0; g < matrix[g].length; g++)
            {
                char symbol  = matrix[i][g] == 1 ? '*': '#';

                System.out.println(symbol + " " );
            }
            System.out.println();
        }
        

    }

}
