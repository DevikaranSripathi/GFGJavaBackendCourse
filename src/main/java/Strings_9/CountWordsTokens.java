package Strings_9;

import java.util.Scanner;

public class CountWordsTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = new String(str);
        int countWords = 0;
        String[] occurance = str.split(" ");
        for (String element: occurance) {
            countWords++;
        }


        System.out.println("String operations " + (str.substring(1, str.length()-1)));
        System.out.println("Total words are " + countWords);
        String st = String.valueOf(str1.charAt(0));
        st = st.toUpperCase();
        str1 = str.substring(1);
        System.out.println(st + str1);
        System.out.println(st + str1.toUpperCase());
    }
}
