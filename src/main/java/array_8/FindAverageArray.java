package array_8;

import java.util.Scanner;

public class FindAverageArray {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= scanner.nextInt();
        int[]arr=new int[5];
        System.out.println("Enter the elements in the array"+n);
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println(FindAverage(arr, n));

    }

    private static double FindAverage(int[] arr, int n) {
        int sum=0;
        for (int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        return (double) sum/n;
    }
}
