package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        int sum = 0;
        int remainingNumber;
        while (true) {
            remainingNumber = number % 10;
            number = number / 10;
            sum = sum + remainingNumber;
            if (number < 10) {
                sum = sum + number;
                break;
            }
        }
        System.out.println("The sum of the digits is " + sum);
    }
}
