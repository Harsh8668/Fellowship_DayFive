package com.javaproject.dayfive;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the Year");
        Scanner sc = new Scanner(System.in);
        int year= sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            System.out.println( + year + " is an Leap Year");
        }
        else {
            System.out.println( + year + " is not an Leap Year");
        }
    }
}