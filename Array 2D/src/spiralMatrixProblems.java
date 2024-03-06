import java.util.Scanner;

public class spiralMatrixProblems {
    static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void createSpiralMatrix(int row_col) {
        int n = 1, topRow = 0, rightCol = row_col - 1, bottomRow = row_col - 1, leftCol = 0;
        int[][] ans = new int[row_col][row_col];
        while (n <= (row_col * row_col)) {
            //TOP ROW PRINT ==> left column to right column
            for (int i = leftCol; i <= rightCol && n <= (row_col * row_col); i++) {
                ans[topRow][i] = n++;
            }
            topRow++;

            //RIGHT COL PRINT ==> top row to bottom row
            for (int i = topRow; i <= bottomRow && n <= (row_col * row_col); i++) {
                ans[i][rightCol] = n++;
            }
            rightCol--;

            //BOTTOM ROW PRINT ==> right column to left column
            for (int i = rightCol; i >= leftCol && n <= (row_col * row_col); i--) {
                ans[bottomRow][i]= n++;
            }
            bottomRow--;

            //LEFT COL PRINT ==> bottom row to top row
            for (int i = bottomRow; i >= topRow && n <= (row_col * row_col); i--) {
                ans[i][leftCol] = n++;
            }
            leftCol++;
        }
        print2DArray(ans);
    }

    static void printSpiralMatrix(int[][] arr, int row, int col) {
        int n = 1, topRow = 0, rightCol = col - 1, bottomRow = row - 1, leftCol = 0;
        while (n <= (row * col)) {
            //TOP ROW PRINT ==> left column to right column
            for (int i = leftCol; i <= rightCol && n <= (row * col); i++) {
                System.out.print(arr[topRow][i]+" ");
                n++;
            }
            topRow++;

            //RIGHT COL PRINT ==> top row to bottom row
            for (int i = topRow; i <= bottomRow && n <= (row * col); i++) {
                System.out.print(arr[i][rightCol]+" ");
                n++;
            }
            rightCol--;

            //BOTTOM ROW PRINT ==> right column to left column
            for (int i = rightCol; i >= leftCol && n <= (row * col); i--) {
                System.out.print(arr[bottomRow][i]+" ");
                n++;
            }
            bottomRow--;

            //LEFT COL PRINT ==> bottom row to top row
            for (int i = bottomRow; i >= topRow && n <= (row * col); i--) {
                System.out.print(arr[i][leftCol]+" ");
                n++;
            }
            leftCol++;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int row = sc.nextInt();

        System.out.println("Enter Col: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        System.out.println("Enter Element of matrix1: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printSpiralMatrix(matrix, row, col);
        System.out.println();

        int n = 5;
        createSpiralMatrix(n);
    }
}
