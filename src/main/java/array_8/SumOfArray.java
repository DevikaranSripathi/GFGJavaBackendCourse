package array_8;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array size " + n);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(sumOfArray(arr, n));
    }

    private static int sumOfArray(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // 1 2 3 4 5
            sum = sum + arr[i];
//            sum += arr[i];
        }
        return sum;
    }
}
