public class binarySearchProblems03 {
    static int peakElement(int[] arr) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid];
            } else if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int peakIndex(int[] arr) {
        int st = 0, end = arr.length - 1;
        int ans = -1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
                ans = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static boolean searchElement2dArray1(int[][] arr, int target) {
        int n = arr.length, m = arr[0].length;
        int i = 0, j = m - 1;

        while (i < n && j >= 0) {
            if (target == arr[i][j]) {
                return true;
            } else if (target < arr[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    static boolean searchElement2dArray(int[][] arr, int target) {
        int n = arr.length, m = arr[0].length;
        int st = 0, end = (n * m) - 1;

        while (st <= end) {
            int mid = (st + end) / 2;
            int midEle = arr[mid/m][mid % n];

            if (midEle == target) return true;
            else if (target < midEle) end = mid - 1;
            else st = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 18;
        if (searchElement2dArray(arr, target)) {
            System.out.println("Element Present in 2D Array");
        } else {
            System.out.println("Element Not Present on 2D Array");
        }

        if (searchElement2dArray1(arr, target)) {
            System.out.println("Element Present in 2D Array");
        } else {
            System.out.println("Element Not Present on 2D Array");
        }

        int[] arr1 = {2, 3, 5, 8, 6, 2, 12, 0};
//        System.out.println(peakIndex(arr1));
        System.out.println(peakElement(arr1));
    }
}
