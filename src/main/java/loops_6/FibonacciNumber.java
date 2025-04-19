package loops_6;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to find fibonacci series");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println(1);
        } else if (num == 1) {
            System.out.print(1 + " ");
            System.out.print(1);
        } else {
            System.out.print(1 + " ");
            System.out.print(1 + " ");
            int a = 1;
            int b = 1;

            for (int i = 2; i <= num; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
