package Strings_9;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(BinToDec(str));
    }

    private static int BinToDec(String str) {
        // 110
        // 2^2*1 + 2^1*1 + 2^0*0
        int m = 0;
        int k = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            m = m + (str.charAt(i)-'0') * k;
            k = k *2;
        }
        return m;
    }
}
