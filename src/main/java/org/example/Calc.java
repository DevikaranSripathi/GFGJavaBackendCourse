package org.example;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int a= 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        a =scanner.nextInt();
        b =scanner.nextInt();
        Calculator calculator = new Calculator(a,b);
        int addition =calculator.addition();
        System.out.println(addition);
        int Subtraction =calculator.Subtraction();
        System.out.println(Subtraction);
        int Multiplication = calculator.Multiplication();
        System.out.println(Multiplication);
        int Division = calculator.Division();
        System.out.println(Division);
    }
}
