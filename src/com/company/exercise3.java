package com.company;

public class exercise3
{
    public static void main (String[] args) {
        int pounds = 452;
        int inches = 72;
        double kg = pounds*0.453592;
        double m = (inches* 2.54)/100;
        double BMI = kg/(m*m);
        System.out.println(BMI);


    }
}
