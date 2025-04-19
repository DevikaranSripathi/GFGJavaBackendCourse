package loops_6;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Enter a Input");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;

        while (input > 0) {
            input = input / 10;
            count++;
        }

        System.out.println("Number of Digits Count is " + count);

    }
}
