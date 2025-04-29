package array_8;

public class JaggedArray {
    public static void main(String[] args) {
        int m = 3;
        int[][] jaggedArray = new int[m][];
        for (int i = 0; i < jaggedArray.length; i++) {
            jaggedArray[i] = new int[i + 1];
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = i;
            }
        }
        printJaggedArray(jaggedArray);
    }

    private static void printJaggedArray(int[][] jaggedArray) {
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
