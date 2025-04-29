package Strings_9;

import java.util.Arrays;
import java.util.Scanner;

public class FindExtraCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first string");
        String firstSting = scanner.nextLine();
        System.out.println("Enter a second string");
        String secondString = scanner.nextLine();

        System.out.println("Method 1 " + findExtraCharMethod1(firstSting, secondString));
        System.out.println("Method 2 " + findExtraCharMethod2(firstSting, secondString));
        System.out.println("Method 3 " + findExtraCharMethod3(firstSting, secondString));
    }

    private static char findExtraCharMethod3(String firstSting, String secondString) {
        int res = 0;
        int n = firstSting.length();
        for (int i = 0; i < n; i++) {
            // bitwise Xor
            res = res ^ firstSting.charAt(i) ^ secondString.charAt(i);
        }
        res = res ^ secondString.charAt(n);
        return (char) res;
    }

    private static char findExtraCharMethod2(String firstSting, String secondString) {
        int[] count = new int[26];

        int n = firstSting.length();

        for (int i = 0; i < n; i++) {
            count[firstSting.charAt(i) - 'a']--;
            count[secondString.charAt(i) - 'a']++;
        }
        count[secondString.charAt(n) - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                return (char) (i + 'a');
            }
        }
        return 0;
    }

    private static char findExtraCharMethod1(String firstSting, String secondString) {
        char[] a1 = firstSting.toCharArray();
        Arrays.sort(a1);

        char[] a2 = secondString.toCharArray();
        Arrays.sort(a2);

        int n = a1.length;

        for (int i = 0; i < n; i++) {
            if (a1[i] != a2[i]) {
                return a2[i];
            }
        }
        return a2[n];
    }
}
