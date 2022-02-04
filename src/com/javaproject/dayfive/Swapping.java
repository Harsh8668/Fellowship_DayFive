package com.javaproject.dayfive;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        System.out.println("Enter the Two numbers to be swapped");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp = 0;
        System.out.println("Number Before swapping num1 = "+num1+ " & num2 =  " +num2);

        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Number After swapping num1 = "+num1+ " & num2 =  " +num2);
    }
}


