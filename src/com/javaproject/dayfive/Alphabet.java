package com.javaproject.dayfive;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        System.out.println("Enter the Character");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i'
                || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
            System.out.println("The Character is Vowel :" +ch);
        }
        else{
            System.out.println("The Character is Consonant :" +ch);
        }
    }
}
