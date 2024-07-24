package org.example;

import java.util.Scanner;



public class CountToEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number less than 11: ");
        int number = sc.nextInt();

        while (number <= 11) {
            System.out.println(number);
            number++;
        }

        sc.close();
    }
}
