package loops_6;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Enter the N value?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Square(n);
        System.out.println("-----------------------------");
        NumberSquare(n);
        System.out.println("-----------------------------");
        RightAngleTriangle1(n);
        System.out.println("-----------------------------");
        RightAngleTriangleBoundry(n);
        System.out.println("-----------------------------");
        RightAngleTriangle2(n);
        System.out.println("-----------------------------");
        InvertedRightAngleTriangle(n);
        System.out.println("-----------------------------");
        squareBoundry(n);
        System.out.println("-----------------------------");
        pyramid(n);
    }

    private static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void squareBoundry(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n || j == n || j == 1 || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void InvertedRightAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= (n - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void RightAngleTriangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j <= (n - i))) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void RightAngleTriangleBoundry(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == (n) || j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void RightAngleTriangle1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void NumberSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void Square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
