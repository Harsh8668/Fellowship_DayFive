package com.javaproject.dayfive;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        System.out.println("Enter the number of the count");
        Scanner sc = new Scanner(System.in);
        double harmonicSum = 0.0;
        int count = sc.nextInt();
        for ( int i = 1; i <= count ; i++) {
            if (i < count) {
                System.out.print("1/" + i + " + ");
            }
            else{
                System.out.println("1/" +i);
            }
            harmonicSum += 1f/i;
        }
        System.out.println("Harmonic Value of : " +harmonicSum);
    }
}
