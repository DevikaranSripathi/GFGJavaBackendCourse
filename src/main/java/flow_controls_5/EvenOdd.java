package flow_controls_5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.print("Positive ");
            if (n % 2 == 0) {
                System.out.print("Even\n");
            } else {
                System.out.print("Odd\n");
            }
        } else if (n < 0) {
            System.out.print("Negative ");
            if (n % 2 == 0) {
                System.out.print("Even\n");
            } else {
                System.out.print("Odd\n");
            }
        } else {
            System.out.print("Zero");
        }
    }
}
