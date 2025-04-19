package loops_6;

import java.util.Scanner;

public class GCD2Number {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers to find GCD");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int temp = 1;
        int min = Math.min(num1, num2);
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                temp = i;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + temp);

    }
}
