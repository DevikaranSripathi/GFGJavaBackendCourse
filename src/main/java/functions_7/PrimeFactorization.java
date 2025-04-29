package functions_7;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printPrimeFactors(num);
    }

    private static void printPrimeFactors(int num) {
        int i = 2;
        while (i <= num) {
            if (isPrime(i)) {
                int x = i;
                while (num % x == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
            i++;
        }
    }

    private static boolean isPrime(int n) {
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
