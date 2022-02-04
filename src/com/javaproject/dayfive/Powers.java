package com.javaproject.dayfive;

import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num=1;
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            num=2*num;
        }
        System.out.println("Power of " + count + " : " +num);
    }
}

