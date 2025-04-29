package Strings_9;

import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(decToBin(n));
    }

    private static String decToBin(int n) {
        String str = "";
        while (n > 0) {
            str = (n % 2) + str;
            n = n / 2;
        }

        return str;
    }
}
