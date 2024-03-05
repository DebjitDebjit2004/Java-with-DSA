import java.util.Scanner;

public class matrixTransposeProblems {
    static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    static int[][] rotate90Degree(int[][] a, int row_col) {
        int[][] transpose = transposeMatrix(a, row_col);
        for (int i = 0; i < row_col; i++) {
            reverseArray(a[i]);
        }
        return a;
    }

    static int[][] transposeMatrix(int[][] a, int row_col) {

        for (int i = 0; i < row_col; i++) {
            for (int j = i; j < row_col; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row_col = 3;
        int[][] arr = new int[row_col][row_col];

        System.out.println("Enter Element of matrix: ");
        for (int i = 0; i < row_col; i++) {
            for (int j = 0; j < row_col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        System.out.println("Transpose of Matrix is");
//        print2DArray(transposeMatrix(arr, row_col));

        System.out.println("Rotated Matrix is ");
        print2DArray(rotate90Degree(arr, row_col));
    }
}
