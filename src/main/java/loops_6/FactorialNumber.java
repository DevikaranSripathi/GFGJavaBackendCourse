package loops_6;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to find a factorial");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = 1;

        for (int i = num; i >= 1; i--) {
            temp = temp * i;
        }
        System.out.println("Factorial of " + num + " = " + temp);
    }
}
