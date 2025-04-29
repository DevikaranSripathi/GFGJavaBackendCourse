package Strings_9;

import java.util.Scanner;

public class ReverseString {
    public static void main(String []args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter a String you want to Reverse");
        String string = scanner.nextLine();
        System.out.println(reversestring(string));

    }
    public static String reversestring(String string){
        int n=string.length()-1;
        String b="";
        while (n>=0){
            b=b+string.charAt(n);
            n--;

        }
       return b;
    }

}
