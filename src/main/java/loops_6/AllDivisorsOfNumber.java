package loops_6;

import java.util.Scanner;

public class AllDivisorsOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to find all Divisors");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
