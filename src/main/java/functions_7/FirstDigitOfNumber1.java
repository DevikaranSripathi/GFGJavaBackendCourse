package functions_7;

import java.util.Scanner;

public class FirstDigitOfNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(firstDigit(num));
    }

    private static int firstDigit(int num) {
        double power = Math.log10(num);
        int p = (int) power;
        int a = (int) Math.pow(10, p);
        return num / a;
    }
}
