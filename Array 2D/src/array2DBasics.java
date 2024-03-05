import java.util.Scanner;

public class array2DBasics {
    static void print2DArray(int[][] arr, int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3, col = 4;
        int[][] arr = new int[row][col];

        System.out.println("Enter Element of matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        print2DArray(arr, row, col);
    }
}
