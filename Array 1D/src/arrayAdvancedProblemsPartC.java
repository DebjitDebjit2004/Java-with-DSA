import java.util.Scanner;

public class arrayAdvancedProblemsPartC {
    static void printArray(int[] arr){
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static int totalSum(int[] arr){
        int sum = 0;
        for (int ele: arr){
            sum += ele;
        }
        return sum;
    }

    static Boolean equalSumPartition(int[] arr) {
        int totalSum = totalSum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++){
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }

    static int[] makePrefixSumArray(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] pref = makePrefixSumArray(arr);
        System.out.print("Prefix Sum : ");
        printArray(arr);

        System.out.print("Enter Queries: ");
        int q = sc.nextInt();

        while (q > 0){
            System.out.print("Enter Range: ");
            int r = sc.nextInt();
            int l = sc.nextInt();
            int sum = pref[r] - pref[l - 1];
            System.out.println("Sum: "+sum);
            q--;
        }

        int[] arr1 = {1, 1, 1, 1, 1, 1};
        System.out.println(equalSumPartition(arr1));

    }
}
