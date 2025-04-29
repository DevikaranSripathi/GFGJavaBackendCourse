package Strings_9;

import java.util.Scanner;

public class PatternSearchingString {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String string =scanner.nextLine();
        System.out.println("Enter a Pattern");
        String pattern =scanner.nextLine();
        patternSearch(string,pattern);
    }

    private static void patternSearch(String string, String pattern) {
        int pos=string.indexOf(pattern);
        while (pos>=0){
            System.out.println(pos+" ");
            pos=string.indexOf(pattern, pos+1);
        }
    }
}
