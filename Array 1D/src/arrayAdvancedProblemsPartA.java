import java.util.Scanner;

public class arrayAdvancedProblemsPartA {
    static void printArray(int[] arr){
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static int[] makeFrequencyArray(int[] arr){
        int[] freqArray = new int[10000];
        for (int ele : arr) {
            freqArray[ele] = -1;
        }
        return freqArray;
    }

    static void swapArrayElement(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void reverseArrayWithoutExtraSpace(int[] arr, int left, int right){
        while (left < right) {
            swapArrayElement(arr, left , right);
            left++;
            right--;
        }
    }

    static void kthRotationOfArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        reverseArrayWithoutExtraSpace(arr, 0, n - k - 1);
        reverseArrayWithoutExtraSpace(arr, n - k, n - 1);
        reverseArrayWithoutExtraSpace(arr, 0, n - 1);

        System.out.print("kth Rotation of Array is ");
        printArray(arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverseArrayWithoutExtraSpace(arr, 0, arr.length - 1);
        System.out.print("Reverse Array is ");
        printArray(arr);

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        kthRotationOfArray(arr1, 5);

        int[] arr2 = {10, 400, 6083, 16, 89, 999, 1000, 2, 6, 8};
        int[] freqArray = makeFrequencyArray(arr2);
        System.out.print("Enter Total Number of Quires: ");
        int q = sc.nextInt();

        while (q > 0){
            System.out.print("Enter Query: ");
            int query = sc.nextInt();
            if (freqArray[query] == -1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            q--;
        }


    }
}
