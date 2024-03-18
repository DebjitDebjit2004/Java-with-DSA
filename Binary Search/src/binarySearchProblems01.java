public class binarySearchProblems01 {
    static int findSqRoot(int x) {
        int st = 0, end = x;
        int ans = -1;
        while (st <= end) {
            int mid = (st + end) / 2;
            int val = mid * mid;
            if (val == x) {
                return mid;
            } else if (val > x) {
                end = mid - 1;
            } else {
                ans = mid;
                st = mid + 1;
            }
        }
        return ans;
    }
    static int firstOccurrenceBinarySearch(int[] arr, int x) {
        int st = 0, end = arr.length - 1;
        int fo = -1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == x) {
                fo = mid;
                end = mid - 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        System.out.println(firstOccurrenceBinarySearch(arr, 5));
        System.out.println(findSqRoot(36));
    }
}
