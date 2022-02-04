package com.javaproject.dayfive;

import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the Three number to find which number is largest");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("First Number is greatest Number");
        }
        else if (num2 > num1 && num2 >num3){
            System.out.println("Second Number is greatest Number");
        }
        else{
            System.out.println("Third Number is greatest Number");
        }
    }
}

