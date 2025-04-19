package flow_controls_5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        final int addition = 1, subtraction = 2, multiplication = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operation \nSelect 1 for Addition \nSelect 2 for Subtraction \nSelect 3 for Multiplication");
        int operation = sc.nextInt();
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter a second number");
        int second = sc.nextInt();
        switch (operation) {
            case addition:
                System.out.println("Addition of 2 number is " + (first + second));
                break;
            case subtraction:
                System.out.println("Subtraction of 2 number is " + (first - second));
                break;
            case multiplication:
                System.out.println("Multiplication of 2 number is " + (first * second));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
