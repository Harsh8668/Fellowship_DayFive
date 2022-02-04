package com.javaproject.dayfive;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        System.out.println("Enter the Divisor and Dividend");
        Scanner sc = new Scanner(System.in);

        int Divisor = sc.nextInt();
        int Dividend = sc.nextInt();
        int quotient = 0;
        int remainder = 0;

        quotient = Dividend / Divisor;
        System.out.println("Quotient is : " +quotient);

        remainder = Dividend % Divisor;
        System.out.println("Remainder is :" +remainder);
    }
}



