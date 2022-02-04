package com.javaproject.dayfive;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("How many times you want to flip the coin");
        Scanner sc = new Scanner(System.in);

        int headCount = 0;
        int tailCount = 0;
        int count= sc.nextInt();

        for (int i = 0 ; i < count ; i++){
            double random = Math.random();
            if(random < 0.5){
                tailCount++;            }
            else{
                headCount++;
            }
        }

        System.out.println("Percentage is : ("+ tailCount +"): " + (tailCount * 100 / (tailCount + headCount)));
        System.out.println("Percentage is : ("+ headCount +"): " + (headCount * 100 / (tailCount + headCount)));
    }
}
