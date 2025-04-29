package functions_7;

import java.util.Scanner;

public class FirstDigitOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(printFirst(num));
    }

    private static int printFirst(int num) {
        while (num > 10) {
            num = num / 10;
        }
        return num;
    }
}
