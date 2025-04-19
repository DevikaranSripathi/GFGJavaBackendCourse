package operators_4;

import java.util.Scanner;

public class DayBeforeNDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter day from 0 to 6");
        int d = scanner.nextInt();
        System.out.println("Please enter days from that day");
        int n = scanner.nextInt();
        int x = n % 7;
        int result = d - x;

        if (result > 0) {
            System.out.println("Your day is " + result);
        } else {
            System.out.println("Your day is " + (result + 7));
        }

    }
}
