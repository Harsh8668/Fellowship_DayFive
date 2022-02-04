package com.javaproject.dayfive;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.print("The factors of " + num + ":" + i + "\t");
            }
        }
    }
}
