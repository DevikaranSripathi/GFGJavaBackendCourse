package org.example;

import java.util.Scanner;

public class Example2 {
    public class Fibonacci {

        // Method to print the Fibonacci series up to a given number of terms
        public static void printFibonacciSeries(int n) {
            int firstTerm = 0, secondTerm = 1;

            if (n <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }

            System.out.println("Fibonacci Series up to " + n + " terms:");
            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + " ");

                // Calculate the next term
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println(); // Move to the next line after printing the series
        }

        // Method to find the nth term in the Fibonacci series
        public static int findNthFibonacciTerm(int n) {
            if (n <= 0) {
                return -1; // Return -1 for invalid input
            } else if (n == 1) {
                return 0; // First Fibonacci term is 0
            } else if (n == 2) {
                return 1; // Second Fibonacci term is 1
            } else {
                int firstTerm = 0, secondTerm = 1;
                for (int i = 3; i <= n; ++i) {
                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                }
                return secondTerm;
            }
        }


    }

}
