import java.util.Scanner;

public class recursionProblems03 {
    static int alternativeSeriesSum(int n) {
        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return alternativeSeriesSum(n - 1) - n;
        } else {
            return alternativeSeriesSum(n - 1) + n;
        }
    }

    static void multiplicationTable(int num, int k) {
        //BASE CASE
        if (k == 1) {
            System.out.println(num);
            return;
        }
        //RECURSIVE WORK
        multiplicationTable(num, k - 1);
        //SELF WORK
        System.out.println(num * k);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        if (k > 0) {
            multiplicationTable(num, k);
        } else {
            System.out.println("please enter positive number :) ");
        }

        System.out.println("Sum of the series is "+alternativeSeriesSum(10));
    }
}
