import java.util.Scanner;

public class matrixAddition {
    static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] add(int[][] a, int[][] b, int row, int col){
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int row = sc.nextInt();

        System.out.println("Enter Col: ");
        int col = sc.nextInt();

        int[][] m1 = new int[row][col];
        System.out.println("Enter Element of matrix1: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        int[][] m2 = new int[row][col];
        System.out.println("Enter Element of matrix2: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition of matrices is ");
        print2DArray(add(m1, m2, row, col));
    }
}
