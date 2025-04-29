package Strings_9;

import java.util.Scanner;

public class DigitsAfterDecimalPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string double value");
        String string = scanner.nextLine();
        System.out.println(decimalPoint(string));
    }

    private static String decimalPoint(String string) {
        int pos = string.indexOf('.');
        if (pos < 0) {
            return "";
        } else {
            return string.substring(pos + 1);
        }
    }
}
