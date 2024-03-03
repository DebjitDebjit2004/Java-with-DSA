
public class Assignment3 {
    // Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers. There are no duplicates in the list
    static int missingElement(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n + 2];

        for (int ele : arr) {
            newArr[ele] = -1;
        }

        for (int i = 1; i < newArr.length; i++) {
            if (newArr[i] > -1) {
                return i;
            }
        }

        return -1;
    }

    // Given an array sorted in increasing order of size n and an integer x, find if there exists a pair in the array whose absolute difference is exactly x.(n>1)
    static boolean absoluteDifference(int[] arr, int x) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] - arr[i]) == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 26};
        int x = 10;
        if (absoluteDifference(arr, x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        int[] arr1 = {1, 2, 5, 4, 6, 3, 8, 9};
        System.out.println("Missing Element is "+missingElement(arr1));

    }
}
