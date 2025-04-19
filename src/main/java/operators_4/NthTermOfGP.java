package operators_4;

import java.util.Scanner;

public class NthTermOfGP {
    public static void main(String[] args) {
        System.out.println("Enter starting value");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter ratio value");
        int r = scanner.nextInt();
        System.out.println("Enter Nth term");
        int n = scanner.nextInt();

        int result = a * (int) Math.pow(r, n - 1);
        System.out.println("Nth term value is " + result);
    }
}
