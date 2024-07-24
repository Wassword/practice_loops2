package org.example;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (number != 5) {
            System.out.print("Give a number: ");
            number = sc.nextInt();

        }
        sc.close();
        System.out.println("You entered 5. Exiting...");
    }
}
