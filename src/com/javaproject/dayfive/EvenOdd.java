package com.javaproject.dayfive;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the Number to check whether the number is even or not");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Entered Number is Even");
        }
        else{
            System.out.println("Entered Number is odd");
        }
    }
}


