package Strings_9;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    private  final static int CHAR = 256;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String firstString = scanner.nextLine();
        System.out.println("Enter second pattern");
        String secondString = scanner.nextLine();

        System.out.println(naiveMethod("first method " + firstString, secondString));
        System.out.println(efficientMethod("second method " + firstString, secondString));

    }

    private static boolean efficientMethod(String firstString, String secondString) {

        if (firstString.length() != secondString.length()) {
            return false;
        }

        int[] charArray = new int[CHAR];
        for (int i = 0; i < firstString.length(); i++) {
            charArray[firstString.charAt(i)]++;
            charArray[secondString.charAt(i)]--;
        }

        for (int i : charArray) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }


    private static boolean naiveMethod(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }

        char[] a1 = firstString.toCharArray();
        Arrays.sort(a1);
        String str1 = new String(a1);
        char[] a2 = secondString.toCharArray();
        Arrays.sort(a2);
        String str2 = new String(a2);
        return (str1.equals(str2));
    }

}
