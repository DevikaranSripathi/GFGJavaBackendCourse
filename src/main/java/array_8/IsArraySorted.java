package array_8;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array size " + n);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean ans = isSorted(arr, n);
        if (ans) {
            System.out.println("Yes, sorted array");
        } else {
            System.out.println("No, unsorted array");
        }
    }

    private static boolean isSorted(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return true;
        } else {
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
