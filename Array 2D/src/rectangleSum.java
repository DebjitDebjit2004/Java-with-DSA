import java.util.Scanner;

public class rectangleSum {
    static void prefixSumMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    static int findSumMethodTwo(int[][] matrix, int x1, int y1, int x2, int y2) {
        prefixSumMatrix(matrix);
        int sum = 0;
        for (int i = x1; i <= x2; i++) {
            if (y1 >= 1) sum += (matrix[i][y2] - matrix[i][y1 - 1]);
            else sum += matrix[i][y2];
        }
        return sum;
    }

    static int findSumMethodOne(int[][] matrix, int x1, int y1, int x2, int y2) {
        int sum = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter Element of matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter co-ordinate: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Sum is "+findSumMethodOne(arr, x1, y1, x2, y2));
        System.out.println("Sum is "+findSumMethodTwo(arr, x1, y1, x2, y2));

    }
}
