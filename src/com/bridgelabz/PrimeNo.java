package com.bridgelabz;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        int num, count = 0;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
