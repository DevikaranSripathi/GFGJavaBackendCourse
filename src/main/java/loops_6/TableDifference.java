package loops_6;

import java.util.Scanner;

public class TableDifference {
    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers, first number should be greater than second number");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.print(((firstNumber * i) - (secondNumber * i)) + " ");
            i++;
        }
    }
}
