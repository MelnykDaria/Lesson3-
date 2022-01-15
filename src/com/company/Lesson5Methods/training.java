package com.company.Lesson5Methods;

public class training {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int c = 100;
        String d = "99";
        long f = 99;

        sum(a,b);
        sum(b,c);
        sum(b,a);
        sum(c,a);
    }
    static void sum(int x, int y)
    {
        System.out.println(x+y);

    }
}
