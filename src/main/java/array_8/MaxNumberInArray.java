package array_8;

import java.util.Scanner;

public class MaxNumberInArray {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array size " + n);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(maxNumber(arr, n));
    }

    private static int maxNumber(int[] arr, int n) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            // 5 8 3 8 1
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
