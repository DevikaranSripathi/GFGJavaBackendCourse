package InputOutput_3;

import java.util.Scanner;

public class GFG {
    public static void main(String args[]) {
        // Implement Scanner Class
        // Take all inputs
        // Print all the values
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        float b = scanner.nextFloat();
        System.out.println(b);
        long c = scanner.nextLong();
        System.out.println(c);
        byte d = scanner.nextByte();
        System.out.println(d);
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println(s);


      /*----------------INPUT-------OUTPUT---------------
        5
        5.256
        568746854
        120
        geeks for geeks*/
    }
}