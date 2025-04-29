package org.example;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int numberOfTerms = scanner.nextInt();
        // Print the Fibonacci series
        printFibonacciSeries(numberOfTerms);


        System.out.print("Enter the term number (n) to find in the Fibonacci series: ");
        int nthTermToFind = scanner.nextInt();

        // Find and print the nth term
        int nthFibonacciTerm = findNthFibonacciTerm(nthTermToFind);
        System.out.println("nth term value is "+nthFibonacciTerm);
    }

    private static int findNthFibonacciTerm(int n) {
        int x = 0;
        if (n == 0) {
            System.out.println(1);
        } else if (n == 1) {
            System.out.print(1 + " ");
            System.out.print(1);
        } else {
//            System.out.println(1 + " ");
//            System.out.println(1 + " ");

            int a = 1;
            int b = 1;

            for (int i = 2; i <= n; i++) {
                int c = a + b;

                a = b;
                b = c;
                if (i == n - 1) {
                    x = c;
                    return c;
                }
            }
        }
        return x;
    }

            private static void printFibonacciSeries(int n){
                if (n == 0) {
                    System.out.println(1);
                } else if (n == 1) {
                    System.out.print(1 + " ");
                    System.out.print(1);
                } else {
                    System.out.println(1 + " ");
                    System.out.println(1 + " ");

                    int a = 1;
                    int b = 1;
                    for (int i = 2; i <= n; i++) {
                        int c = a + b;
                        System.out.println(c + " ");
                        a = b;
                        b = c;

                    }
                }
            }
        }
