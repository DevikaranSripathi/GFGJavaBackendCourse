package array_8;

import java.util.Scanner;

public class CountDistinctElements {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = scanner.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter element of array size"+n);
    for(int i=0; i<n; i++){
        arr[i] = scanner.nextInt();
    }
    System.out.println(countDistinctCount(arr, n));

}

    private static int countDistinctCount(int[] arr, int n) {

        int distinctCount =0;
        boolean isDistinct=true;
        for(int i=0;i<n;i++){
            for (int j=i-1; j>=0; j--){
                if (arr[i]==arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct){
                distinctCount++;
            }
            isDistinct=true;
        }
        return distinctCount;
    }
}
