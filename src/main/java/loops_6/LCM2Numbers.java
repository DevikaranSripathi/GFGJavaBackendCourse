package loops_6;

import java.util.Scanner;

public class LCM2Numbers {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers to find LCM");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int max = Math.max(num1, num2);
        int end = num1 * num2;
        int temp = 1;
        for (int i = max; i <= end; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                temp = i;
                break;
            }
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is " + temp);

    }
}
