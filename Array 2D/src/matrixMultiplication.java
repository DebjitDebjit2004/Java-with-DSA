import java.util.Scanner;

public class matrixMultiplication {
    static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] multiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        return mul;
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

        System.out.println("Enter Row: ");
        int row1 = sc.nextInt();

        System.out.println("Enter Col: ");
        int col1 = sc.nextInt();

        int[][] m2 = new int[row1][col1];
        System.out.println("Enter Element of matrix2: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        print2DArray(multiplication(m1, row, col, m2, row1, col1));


    }
}