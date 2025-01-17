package org.example;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Your number must be positive.");
            } else if (number == 0) {
                break;
            } else {
                System.out.println("You entered: " + number);
            }
        }

        scanner.close();
        System.out.println("Program ended.");
    }
}
