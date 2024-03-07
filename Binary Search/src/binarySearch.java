public class binarySearch {
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
    }
}
