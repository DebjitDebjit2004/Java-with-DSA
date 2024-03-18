public class binarySearch {
    static boolean binarySearchUsingRecursion(int[] arr, int start, int end, int target) {
        if (start > end) return false;
        int mid = (start + end) / 2;
        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return binarySearchUsingRecursion(arr, start, mid - 1, target);
        } else {
            return binarySearchUsingRecursion(arr, mid + 1, end, target);
        }
    }

    static boolean binarySearchAlgorithm(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 15, 20, 24, 45, 50, 77};
        int target = 24;
        if (binarySearchAlgorithm(arr, target)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        if (binarySearchUsingRecursion(arr, 0, arr.length - 1, 45)) {
            System.out.println("45 is present");
        } else {
            System.out.println("45 is not present");
        }
    }
}
