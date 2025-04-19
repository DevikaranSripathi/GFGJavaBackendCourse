package loops_6;

import java.util.Scanner;

public class PrimeNumberTypes {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime number using naive method");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        naiveMethod(num);
        efficientMethod(num);
        moreEfficientMethod(num);
        nextPrimeNumber(num);
    }

    private static void nextPrimeNumber(int num) {
        boolean prime = true;
        num++;
        int i = 2;
        while(i < num) {
            if (num % i == 0) {
                num++;
                i = 2;
            }
            i++;
        }
        printStatement("next prime number", prime, num);
    }

    private static void moreEfficientMethod(int num) {
        boolean prime = true;
        if (num == 1) {
            prime = false;
        } else if (num == 2 || num == 3) {
            prime = true;
        } else if (num % 2 == 0 || num % 3 == 0) {
            prime = false;
        } else {
            for (int i = 5; i * i <= num; i = i + 6) {
                if (num % i == 0 || num %(i+2)==0) {
                    prime = false;
                }
            }
        }
        printStatement("more efficient", prime, num);
    }

    private static void efficientMethod(int num) {
        boolean prime = true;
        if (num == 1) {
            prime = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        printStatement("efficient", prime, num);
    }

    private static void naiveMethod(int num) {
        boolean prime = true;
        if (num == 1) {
            prime = false;
        } else {
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
        }
        printStatement("naive", prime, num);
    }

    private static void printStatement(String method, boolean prime, int num) {
        if (prime) {
            System.out.println(num + " is a prime number using " + method + " method");
        } else {
            System.out.println(num + " is not a prime number using " + method + " method");
        }
    }
}
