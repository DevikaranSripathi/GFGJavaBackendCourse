package Strings_9;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countWords = 0;
            String[] occurance =str.split(" ");
        for ( String element:occurance) {
            countWords++;
        }
       System.out.println(" Total Words are "+ countWords);
    }
}
