package flow_controls_5;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.print(a);
        } else if (b >= a && b >= c) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }

}
